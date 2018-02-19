create or replace FUNCTION cust_genre(cid customerx.customer_id%TYPE)
    RETURN VARCHAR IS
    ret_genre VARCHAR(30);
	max_count_var NUMBER(6);
BEGIN
	SELECT MAX(COUNT(cat.category_id)) INTO max_count_var
	FROM rental r, customerx c, inventory i, category cat, film_category fc, film f
	WHERE c.customer_id=r.customer_id
	AND i.inventory_id = r.inventory_id
	AND f.film_id = i.film_id
	AND f.film_id = fc.film_id
	AND cat.category_id = fc.category_id
	AND c.customer_id = cid
	GROUP BY cat.category_id;
    
	SELECT cat.name INTO ret_genre
	FROM rental r, customerx c, inventory i, category cat, film_category fc, film f
	WHERE c.customer_id=r.customer_id
	AND i.inventory_id = r.inventory_id
	AND f.film_id = i.film_id
	AND f.film_id = fc.film_id
	AND cat.category_id = fc.category_id
	AND c.customer_id = cid

	GROUP BY cat.name HAVING COUNT(cat.category_id)=max_count_var;
	
    RETURN ret_genre;
EXCEPTION
	WHEN  TOO_MANY_ROWS THEN
	ret_genre := 'more than one output';
	RETURN ret_genre;
END;
/
--TEST
select first_name,last_name,cust_genre(customer_id),customer_id
from customerx
where customer_id=49;
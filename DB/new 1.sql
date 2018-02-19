b,1)
SELECT COUNT(cat.category_id)
FROM rental r, customerx c, inventory i, category cat, film_category fc, film f
WHERE c.customer_id=r.customer_id
AND i.inventory_id = r.inventory_id
AND f.film_id = i.film_id
AND f.film_id = fc.film_id
AND cat.category_id = fc.category_id
AND c.customer_id = 25
GROUP BY cat.category_id
ORDER BY COUNT(cat.category_id) desc
			
			
			
------------------------------------------------------------------------------
a)
create or replace FUNCTION tot_film_num(actid actor.actor_id%TYPE)
    RETURN NUMBER IS ret_num number;
    
BEGIN
    SELECT COUNT(f.film_id) INTO ret_num
    FROM film f,film_actor fac, actor a
    WHERE a.actor_id = actid
    AND f.film_id = fac.film_id
    AND fac.actor_id = a.actor_id;
    RETURN ret_num;
END;


----------------------------------------
B) 
create or replace FUNCTION cust_genre(cid customerx.customer_id%TYPE)
    RETURN NUMBER IS
    cat_curr_max NUMBER;
    cat_max_id category.category_id%TYPE;
BEGIN
    cat_curr_max:=0;
    FOR i IN (
            SELECT COUNT(cat.category_id),cat.name,cat.category_id
            FROM rental r, customerx c, inventory i, category cat, film_category fc, film f
            WHERE c.customer_id=r.customer_id
            AND i.inventory_id = r.inventory_id
            AND f.film_id = i.film_id
            AND f.film_id = fc.film_id
            AND cat.category_id = fc.category_id
            AND c.customer_id = cid
            GROUP BY cat.category_id
            ORDER BY COUNT(cat.category_id)
            )
         
         LOOP
            IF i.COUNT > cat_curr_max THEN
                cat_curr_max:=i.COUNT(cat.category_id);
                cat_max_id:=i.category_id;
                
                
            END IF;
        END LOOP;
    
    RETURN cat_max_id;
END;
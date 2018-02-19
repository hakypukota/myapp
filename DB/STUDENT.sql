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
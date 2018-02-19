create or replace FUNCTION tot_film_num(actid actor.actor_id%TYPE)
    RETURN NUMBER IS ret_num NUMBER(6);
    
BEGIN
    SELECT COUNT(*) INTO ret_num
    FROM film_actor WHERE actor_id=actid;
    RETURN ret_num;
END;
/
--TEST
select a.actor_id,a.first_name,a.last_name,tot_film_num(fa.actor_id)
from film_actor fa, actor a
where a.actor_id=fa.actor_id
AND fa.actor_id=52
AND rownum=1;
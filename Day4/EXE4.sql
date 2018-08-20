SELECT Max(order_filled) as Hightest , MIN(order_filled)as Lowest FROM s_ord;
SELECT COUNT(e.manager_id)as "S? ng??i qu?n lý" from s_emp e;
SELECT c.name, i.quantity FROM s_customer c, s_item i, s_ord o WHERE c.id = o.customer_id and o.id = i.ord_id;
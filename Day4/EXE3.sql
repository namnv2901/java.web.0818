SELECT p.name,p.id,i.quantity as ordered from s_item i,s_product p where i.product_id = p.id and i.ord_id = 101 ;
select c.id as "Mã khách hàng",o.id as "Mã ord" from s_customer c LEFT JOIN s_ord o on c.id = o.customer_id order by c.id ;
select c.*,i.product_id,i.quantity from s_customer c ,s_item i, s_ord o where c.id = o.customer_id and o.id = i.ord_id and i.price >100000;
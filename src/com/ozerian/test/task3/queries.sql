/* First query - clients have an order sum > 50 */

SELECT Clients.client_id, Clients.client_name
FROM Clients
INNER JOIN Orders
ON Clients.client_id = Orders.client_id
WHERE Orders.orders_sum > 50;


/* Second query - clients with total sum of orders > 100 */

SELECT Clients.client_id, Clients.client_name
FROM Clients
INNER JOIN Orders
ON Clients.client_id = Orders.client_id
HAVING SUM(Orders.orders_sum) > 100;




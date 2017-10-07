use acdatabase;

INSERT INTO products (product_name, description) VALUES("product1", "first product");
INSERT INTO products (product_name, description) VALUES("product2", "second product");
INSERT INTO products (product_name, description) VALUES("product3", "third product");
INSERT INTO products (product_name, description) VALUES("product4", "first parent of first product");
INSERT INTO products (product_name, description) VALUES("product5", "second parent of first product");
INSERT INTO products (product_name, description) VALUES("product6", "first parent of third product");

UPDATE products p1
INNER JOIN products p2 
ON p1.product_name = "product4" 
AND p2.product_name = "product1"
SET p1.parent_id = p2.product_id;

UPDATE products p1
INNER JOIN products p2 
ON p1.product_name = "product5" 
AND p2.product_name = "product1"
SET p1.parent_id = p2.product_id;

UPDATE products p1
INNER JOIN products p2 
ON p1.product_name = "product6" 
AND p2.product_name = "product3"
SET p1.parent_id = p2.product_id;
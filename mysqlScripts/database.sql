create database acdatabase;

use acdatabase;

create table products (product_id INT NOT NULL AUTO_INCREMENT, 
					product_name VARCHAR(50), 
                    description VARCHAR(300), 
                    parent_id INT,
                    PRIMARY KEY (product_id),
                    FOREIGN KEY (parent_id)
					REFERENCES products(product_id)
					ON DELETE SET NULL
                    ON UPDATE CASCADE) ENGINE=INNODB;
                    
create table images (image_id INT NOT NULL AUTO_INCREMENT, 
					image_type VARCHAR(20),
                    product_id INT,
                    PRIMARY KEY (image_id),
                    FOREIGN KEY (product_id)
					REFERENCES products(product_id)
					ON DELETE CASCADE
                    ON UPDATE CASCADE) ENGINE=INNODB;
                    

CREATE USER 'avenuecode'@'%' IDENTIFIED BY 'testeAvCd';
GRANT ALL PRIVILEGES ON acdatabase.* TO 'avenuecode'@'%';
SHOW GRANTS FOR 'avenuecode'@'%';
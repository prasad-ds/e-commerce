use e_commercetest;

TRUNCATE TABLE products;

INSERT INTO products (name ,stock_number, description, rating, no_of_reviews, actual_price, discount, discounted_price,quantity, is_restricted)
 VALUES('BlueTooth', 'ABC4', 'blue tooth', 2, 2, 123, 0, 123, 4, 0);
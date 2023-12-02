CREATE TABLE CUSTOMERS (
    id SERIAL PRIMARY KEY,
    name VARCHAR(50),
    surname VARCHAR(50),
    age INT,
    phone_number VARCHAR(50)
);

CREATE TABLE ORDERS (
    id SERIAL PRIMARY KEY,
    date DATE,
    customer_id int,
    product_name VARCHAR(150),
    amount INT,
    FOREIGN KEY (customer_id) REFERENCES CUSTOMERS (id)
);
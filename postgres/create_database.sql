CREATE TABLE mocked_values (
    id SERIAL PRIMARY KEY,
    created_on TIMESTAMP NOT NULL DEFAULT NOW(),
    first_value NUMERIC(18,4) NOT NULL,
    second_value NUMERIC(18,4) NOT NULL
);

insert into mocked_values (first_value, second_value) values (1,1), (1,2), (1.0001,1);
create table clients (
    id bigserial NOT NULL,
    firstName varchar NOT NULL,
    lastName varchar NOT NULL,
    document varchar NOT NULL,
    email varchar NOT NULL,
    birthday date NOT NULL,
    created_at timestamp without time zone,
    updated_at timestamp without time zone,
    PRIMARY KEY (id)
);
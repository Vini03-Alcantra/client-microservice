create table address (
    id bigserial NOT NULL,
    street varchar,
    neighborhood varchar,
    city varchar,
    cep varchar,
    number_house varchar,
    complement varchar,
    client_id int,
    created_at timestamp without time zone,
    updated_at timestamp without time zone,
    FOREIGN KEY (client_id) REFERENCES clients(id),
    PRIMARY KEY (id)
)
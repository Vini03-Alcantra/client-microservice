create table phone_client (
    id bigserial NOT NULL,
    ddd varchar,
    number varchar,
    client_id int,
    created_at timestamp without time zone,
    updated_at timestamp without time zone,
    FOREIGN KEY (client_id) REFERENCES clients(id),
    PRIMARY KEY (id)
)
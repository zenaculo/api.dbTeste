create table agencia (
                         id bigserial not null primary key,
                         cep varchar(255),
                         nome varchar(255),
                         numero varchar(255),
                         numero_predio bigint,
                         rua varchar(255)
);

create table pessoa (
                         id bigserial not null primary key,
                         nome varchar(255),
                         sobrenome varchar(255),
                         idade bigint
);

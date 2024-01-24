CREATE TABLE if not exists tb_contato (
   id BIGINT NOT NULL,
   name VARCHAR(255),
   phone VARCHAR(255),
   cep VARCHAR(255),
   logradouro VARCHAR(255),
   numero INTEGER,
   complemento VARCHAR(255),
   bairro VARCHAR(255),
   cidade VARCHAR(255),
   estado VARCHAR(255),
   CONSTRAINT pk_tb_contato PRIMARY KEY (id)
);
CREATE TABLE pagamentos(
    id int AUTO_INCREMENT PRIMARY KEY,
    tipo varchar(100) NOT NULL,
    nome_cliente varchar(100) NOT NULL,
    valor double NOT NULL,
    data_pagamento date NOT NULL,
    descricao varchar(255) NOT NULL
);
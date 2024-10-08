CREATE TABLE usuarios (
                          id INT,
                          nome VARCHAR(255) NOT NULL COMMENT 'Nome do usuário',
                          email VARCHAR(255) NOT NULL UNIQUE COMMENT 'Endereço de e-mail do usuário',
                          data_nascimento DATE NOT NULL COMMENT 'Data de nascimento do usuário',
                          endereco VARCHAR(50) NOT NULL COMMENT 'Endereço do Cliente'
);

CREATE TABLE viagens.destinos (
                                  id INT,
                                  nome VARCHAR(255) NOT NULL UNIQUE COMMENT 'Nome do destino',
                                  descricao VARCHAR(255) NOT NULL COMMENT 'Descrição do destino'
);

CREATE TABLE viagens.reservas (
                                  id INT COMMENT 'Identificador único da reserva',
                                  id_usuario INT COMMENT 'Referência ao ID do usuário que fez a reserva',
                                  id_destino INT COMMENT 'Referência ao ID do destino da reserva',
                                  data DATE COMMENT 'Data da reserva',
                                  status VARCHAR(255) DEFAULT 'pendente' COMMENT 'Status da reserva (confirmada, pendente, cancelada, etc.)'
);

-- Inserts --
INSERT INTO viagens.usuarios (id, nome, email, data_nascimento, endereco) VALUES
                                                                              (1, 'João Silva', 'joao@example.com', '1990-05-15', 'Rua A, 123, Cidade X, Estado Y'),
                                                                              (2, 'Maria Santos', 'maria@example.com', '1985-08-22', 'Rua B, 456, Cidade Y, Estado Z'),
                                                                              (3, 'Pedro Souza', 'pedro@example.com', '1998-02-10', 'Avenida C, 789, Cidade X, Estado Y');

INSERT INTO viagens.destinos (id, nome, descricao) VALUES
                                                       (1, 'Praia das Tartarugas', 'Uma bela praia com areias brancas e mar cristalino'),
                                                       (2, 'Cachoeira do Vale Verde', 'Uma cachoeira exuberante cercada por natureza'),
                                                       (3, 'Cidade Histórica de Pedra Alta', 'Uma cidade rica em história e arquitetura');

INSERT INTO viagens.reservas (id, id_usuario, id_destino, data, status) VALUES
                                                                            (1, 1, 2, '2023-07-10', 'confirmada'),
                                                                            (2, 2, 1, '2023-08-05', 'pendente'),
                                                                            (3, 3, 3, '2023-09-20', 'cancelada');

-- Selects --

-- Selecionar todos os registros da tabela "usuarios"
SELECT * FROM usuarios;

-- Selecionar apenas o nome e o email dos usuários
SELECT nome, email FROM usuarios;

-- Selecionar os usuários que possuem o nome "João Silva"
SELECT * FROM usuarios WHERE nome = 'João Silva';

-- Selecionar os usuários que nasceram antes de uma determinada data
SELECT * FROM usuarios WHERE data_nascimento < '1990-01-01';

-- Like
SELECT * FROM usuarios WHERE nome LIKE '%Silva%';
SELECT * FROM usuarios WHERE nome LIKE 'Jo_o%';

-- Update --
UPDATE usuarios SET endereco = 'Nova Rua, 123' WHERE email = 'joao@example.com';

-- delete --
DELETE FROM reservas WHERE status = 'cancelada';

-- ####################### Alterando e Excluindo Tabelas ####################### --
-- Criando nova tabela --

CREATE TABLE usuarios_nova (
                               id INT,
                               nome VARCHAR(255) NOT NULL COMMENT 'Nome do usuário',
                               email VARCHAR(255) NOT NULL UNIQUE COMMENT 'Endereço de e-mail do usuário',
                               data_nascimento DATE NOT NULL COMMENT 'Data de nascimento do usuário',
                               endereco VARCHAR(100) NOT NULL COMMENT 'Endereço do Cliente'
);

-- Migrando os dados --

INSERT INTO usuarios_nova(id, nome, endereco, email, data_nascimento)
SELECT * from usuarios;

-- Excluindo tabela anterior --
DROP table usuarios;

-- Renomeando nova tabela --
ALTER TABLE usuarios_nova RENAME usuarios;


-- Ou opção 2 : Alterar tamanho da coluna endereço --
ALTER TABLE usuarios MODIFY COLUMN endereco VARCHAR(100);

-- ####################### Chaves Primárias e Estrangeiras ####################### --
-- Primary Key--
-- Tabela "usuarios"
ALTER TABLE usuarios
MODIFY COLUMN id INT AUTO_INCREMENT,
ADD PRIMARY KEY (id);

-- Tabela "destinos"
ALTER TABLE destinos
MODIFY COLUMN id INT AUTO_INCREMENT,
ADD PRIMARY KEY (id);

-- Tabela "reservas"
ALTER TABLE reservas
MODIFY COLUMN id INT AUTO_INCREMENT,
ADD PRIMARY KEY (id);

-- Exemplos --

-- Inserção na tabela "usuarios"
INSERT INTO usuarios (nome, email, data_nascimento, endereco)
VALUES ('João Maria', 'joaomaria@example.com', '1990-01-01', 'Rua A, 123');

-- Inserção na tabela "destinos"
INSERT INTO destinos (nome, descricao)
VALUES ('Praia Teste', 'Destino paradisíaco com belas praias.');

-- Inserção na tabela "reservas"
INSERT INTO reservas (id_usuario, id_destino, data, status)
VALUES (4, 4, '2023-07-01', 'pendente');

-- Chaves estrangeiras --

-- Adicionando chave estrangeira na tabela "reservas" referenciando a tabela "usuarios"
ALTER TABLE reservas
ADD CONSTRAINT fk_reservas_usuarios
FOREIGN KEY (id_usuario) REFERENCES usuarios(id);

-- Adicionando chave estrangeira na tabela "reservas" referenciando a tabela "destinos"
ALTER TABLE reservas
ADD CONSTRAINT fk_reservas_destinos
FOREIGN KEY (id_destino) REFERENCES destinos(id);

-- Alterando a restrição da chave estrangeira "fk_reservas_usuarios" na tabela "reservas" para ON DELETE CASCADE
ALTER TABLE reservas
DROP FOREIGN KEY fk_reservas_usuarios;

ALTER TABLE reservas
ADD CONSTRAINT fk_reservas_usuarios
FOREIGN KEY (id_usuario) REFERENCES usuarios(id) ON DELETE CASCADE;
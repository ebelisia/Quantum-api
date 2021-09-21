--USUARIO
INSERT INTO quantum.usuario(id,nome, email, genero, telefone)VALUES(1,'Afonsinho', 'afonsinho@gmail.com', 'masculino', 987654321);
INSERT INTO quantum.usuario(id,nome, email, genero, telefone)VALUES(2,'Amandinha', 'amandinha@gmail.com', 'feminino', 963258741);
INSERT INTO quantum.usuario(id,nome, email, genero, telefone)VALUES(3,'Carlinhos', 'carlinhos@gmail.com', 'masculino', 951236874);

-- PATRIMONIO
INSERT INTO quantum.patrimonio(id, nome, valor, valor_seguro, observacoes) VALUES (1, 'Automovel compartilhado', 260000.00, 6500, '');
INSERT INTO quantum.patrimonio(id, nome, valor, valor_seguro, observacoes) VALUES (2, 'Automovel compartilhado', 63900.00, 7000, '');
INSERT INTO quantum.patrimonio(id, nome, valor, valor_seguro, observacoes) VALUES (3, 'Imovel compartilhado - Casa na praia', 850000, 0, '');
INSERT INTO quantum.patrimonio(id, nome, valor, valor_seguro, observacoes) VALUES (4, 'Imovel compartilhado - Casa de campo', 1250000, 0, '');

-- AUTOMOVEL
INSERT INTO quantum.automovel(patrimonio_id, placa, marca, modelo, ano, valor_licenciamento) VALUES (1, 'AAA-1475', 'BMW', '118i', 2020, 128);
INSERT INTO quantum.automovel(patrimonio_id, placa, marca, modelo, ano, valor_licenciamento) VALUES (2, 'BBB-3697', 'Ducati', 'Monster', 2020, 128);

-- IMOVEL
INSERT INTO quantum.imovel(patrimonio_id, iptu, valor_condominio) VALUES (3, 12350, 250);
INSERT INTO quantum.imovel(patrimonio_id, iptu, valor_condominio) VALUES (4, 19250, 0);

--GRUPO
INSERT INTO quantum.grupo(id, nome, patrimonio_id)VALUES(1, 'Grupo 1', 2);
INSERT INTO quantum.grupo(id, nome, patrimonio_id)VALUES(2, 'Grupo 2', 3);
INSERT INTO quantum.grupo(id, nome, patrimonio_id)VALUES(3, 'Grupo 3', 1);
INSERT INTO quantum.grupo(id, nome, patrimonio_id)VALUES(4, 'Grupo 4', 4);

--GRUPO_USUARIO
INSERT INTO quantum.grupo_usuario(grupo_id, usuario_id)VALUES(1, 1);
INSERT INTO quantum.grupo_usuario(grupo_id, usuario_id)VALUES(1, 2);
INSERT INTO quantum.grupo_usuario(grupo_id, usuario_id)VALUES(2, 2);
INSERT INTO quantum.grupo_usuario(grupo_id, usuario_id)VALUES(2, 3);
INSERT INTO quantum.grupo_usuario(grupo_id, usuario_id)VALUES(3, 1);
INSERT INTO quantum.grupo_usuario(grupo_id, usuario_id)VALUES(3, 3);
INSERT INTO quantum.grupo_usuario(grupo_id, usuario_id)VALUES(4, 1);
INSERT INTO quantum.grupo_usuario(grupo_id, usuario_id)VALUES(4, 2);
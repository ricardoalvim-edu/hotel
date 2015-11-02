-- -----------------------------------------------------
-- SISTEMA GERENCIADOR DE BANCO DE DADOS
-- 'Script' de criação das tabelas, restrições de chave estrangeira e indices,
-- ALUNOS: Giliard Almeidade de Godoi & Ricardo Carreiro Alvim
-- PROJETO PARA A DISCIPLINA DE BANCO DE DADOS 3 - 2015/2
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Tabela Endereco
-- -----------------------------------------------------

CREATE TABLE Endereco (
  idEndereco SERIAL PRIMARY KEY,
  nomeLodradouro VARCHAR(50),
  numero VARCHAR(10),
  cidade VARCHAR(50),
  idEstado INTEGER,
  complemento VARCHAR(50)
) ;


-- -----------------------------------------------------
-- Tabela Telefone
-- -----------------------------------------------------

CREATE TABLE Telefone (
  idTelefone SERIAL PRIMARY KEY,
  telefone VARCHAR(10),
  ddd VARCHAR(3) ,
  ddi VARCHAR(3)
);


-- -----------------------------------------------------
-- Tabela Hospede
-- -----------------------------------------------------

CREATE TABLE Hospede (
  idHospede SERIAL PRIMARY KEY,
  nomeHospede VARCHAR(100),
  rgHospede VARCHAR(9),
  rgEmissorHospede VARCHAR(10),
  cpfHospede VARCHAR(11),
  dataNascimentoHospede DATE,
  filiacaoHospede VARCHAR(100),
  passaporteHospedeEstrangeiro VARCHAR(15),
  idEndereco INTEGER
  );



-- -----------------------------------------------------
-- Tabela Funcionario
-- -----------------------------------------------------

CREATE TABLE Funcionario (
  idFuncionario SERIAL PRIMARY KEY,
  nomeFuncionario VARCHAR(100),
  dataNascimento DATE,
  documentoIdentificacao VARCHAR(15),
  idEndereco INTEGER
 );



-- -----------------------------------------------------
-- Tabela Funcionario_tem_Telefone
-- -----------------------------------------------------

CREATE TABLE Funcionario_tem_Telefone (
  idFuncionario INTEGER NOT NULL,
  idTelefone INTEGER NOT NULL,
  PRIMARY KEY (idFuncionario, idTelefone)
);


-- -----------------------------------------------------
-- Tabela Hospede_tem_Telefone
-- -----------------------------------------------------
CREATE TABLE Hospede_tem_Telefone (
  idTelefone INTEGER NOT NULL,
  idHospede INTEGER NOT NULL,
  PRIMARY KEY (idTelefone, idHospede) 
);


-- -----------------------------------------------------
-- Tabela Acompanhante
-- -----------------------------------------------------

CREATE TABLE Acompanhante (
  idAcompanhante SERIAL PRIMARY KEY,
  nomeAcompanhante VARCHAR(100) NOT NULL,
  idadeAcompanhante INT NOT NULL,
  idHospede INTEGER NOT NULL
);

-- -----------------------------------------------------
-- Tabela Acomodacao
-- -----------------------------------------------------

CREATE TABLE Acomodacao (
  idAcomodacao SERIAL PRIMARY KEY,
  andarAcomodacao CHAR(5),
  numeroAcomodacao VARCHAR(5) NOT NULL,
  idCategoriaAcomodacao INTEGER NOT NULL
);

-- -----------------------------------------------------
-- Tabela Tipo_Acomodacao
-- -----------------------------------------------------

CREATE TABLE Categoria_Acomodacao (
  idCategoriaAcomodacao SERIAL PRIMARY KEY,
  codTipoAcomodacao VARCHAR(10) NOT NULL,
  nomeTipoAcomodacao VARCHAR(50) NOT NULL,
  descricaoTipoAcomodacao VARCHAR(100),
  quantidadeTipoAcomodacao INT NOT NULL,
  precoDiariaTipoAcomodacao NUMERIC(10,2),
  quantidadeAdultos INT NOT NULL,
  quantidadeCriancas INT NOT NULL
);

-- -----------------------------------------------------
-- Tabela Reservas
-- -----------------------------------------------------

CREATE TABLE Reserva (
  idReservas SERIAL PRIMARY KEY,
  dataHoraChegadaReserva DATE NOT NULL,
  dataHoraSaidaReserva DATE NOT NULL,
  numeroCartaoCredito VARCHAR(16) NULL,
  codCartaoCredito VARCHAR(3) NULL,
  desconto NUMERIC(10, 2) NULL,
  multaDesistencia NUMERIC(10, 2) NULL,
  idHospede INTEGER NOT NULL,
  idCategoriaAcomodacao INTEGER NOT NULL 
 );

-- -----------------------------------------------------
-- Tabela CadastroEntrada
-- -----------------------------------------------------

CREATE TABLE Cadastro_Entrada (
  idCadastroEntrada SERIAL PRIMARY KEY,
  dataHoraEntrada DATE NOT NULL,
  dataHoraSaidaPrevista DATE NOT NULL,
  desconto NUMERIC(10, 2) NULL,
  numeroCartaoCredito VARCHAR(16) NULL,
  codCartaoCredito VARCHAR(3) NULL,
  idFuncionario INTEGER NOT NULL,
  idAcomodacao INTEGER NOT NULL,
  idHospede INTEGER NOT NULL
);

-- -----------------------------------------------------
-- Tabela CadastroSaida
-- -----------------------------------------------------

CREATE TABLE Cadastro_Saida (
  idCadastroSaida SERIAL PRIMARY KEY,
  dataHoraSaida DATE NOT NULL,
  quantidadeDiariasCobradas INT NOT NULL,
  valorGastoTelefonema NUMERIC(10, 2) NOT NULL,
  descontoConcedido NUMERIC(10, 2) NULL,
  valorDiaria NUMERIC(10, 2) NULL,
  idCadastroEntrada INTEGER NOT NULL UNIQUE,
  idTipoPagamento INTEGER NOT NULL
 );

-- -----------------------------------------------------
-- Tabela Categoria_Produto
-- -----------------------------------------------------

CREATE TABLE Categoria_Produto (
  idCategoria SERIAL PRIMARY KEY,
  nomeCategoria VARCHAR(50),
  descricao VARCHAR(45)
);

-- -----------------------------------------------------
-- Tabela Produto
-- -----------------------------------------------------

CREATE TABLE Produto(
  idProduto SERIAL PRIMARY KEY,
  nome VARCHAR(50),
  descricao VARCHAR(100),
  preco NUMERIC(10, 2),
  idCategoria INTEGER
 );

-- -----------------------------------------------------
-- Tabela Consumo_Hospede
-- -----------------------------------------------------

CREATE TABLE Consumo_Hospede (
  idconsumohospede SERIAL PRIMARY KEY,
  quantidadeConsumida INT NOT NULL,
  dataHoraConsumo DATE NULL,
  valorTotalConsumido NUMERIC(10, 2) NOT NULL DEFAULT 0,
  idCadastroEntrada INT NOT NULL,  
  idFuncionario INT NOT NULL
);


-- -----------------------------------------------------
-- Tabela ConsumoHospede_tem_Produto
-- -----------------------------------------------------

CREATE TABLE ConsumoHospede_tem_Produto (
  idConsumoHospede INTEGER NOT NULL,
  idProduto INTEGER NOT NULL,
  PRIMARY KEY (idConsumoHospede, idProduto)
) ;


-- -----------------------------------------------------

-- Tabela TipoPagamento

-- -----------------------------------------------------

CREATE TABLE Tipo_Pagamento (
  idTipoPagamento SERIAL PRIMARY KEY,
  nomeTipoPagamento VARCHAR(20) NOT NULL,
  descricaoTipoPagamento VARCHAR(50) NOT NULL
);



-- -----------------------------------------------------
-- Tabela Fatura
-- -----------------------------------------------------

CREATE TABLE Fatura (
  idFatura SERIAL PRIMARY KEY,
  numeroFatura VARCHAR(45) NOT NULL UNIQUE,
  dataVencimento TIMESTAMP NULL,
  dataPagamento TIMESTAMP,
  valorTotalPago NUMERIC(10,2) NOT NULL,
  jurosPago NUMERIC(10,2) NULL DEFAULT 0,
  multaPaga NUMERIC(10,2) NULL DEFAULT 0,
  idCadastroSaida INTEGER NULL
);



-- CRIAÇÃO DAS CHAVES ESTRANGEIRAS

-- ALTER TABLE nome_tabela ADD CONSTRAINT nome_restrição FOREIGN KEY (nome_coluna) REFERENCES Nome_tabela_referenciada(nome_coluna_referenciada);

ALTER TABLE Endereco ADD CONSTRAINT Estado_endereco_fk  FOREIGN KEY (idEstado) REFERENCES Estado(idEstado);

ALTER TABLE Hospede ADD CONSTRAINT Hospede_Endereco_fk  FOREIGN KEY (idEndereco) REFERENCES Endereco(idEndereco);

ALTER TABLE Hospede_tem_Telefone ADD CONSTRAINT Hospede_telefone_fk FOREIGN KEY (idHospede) REFERENCES Hospede(idHospede);

ALTER TABLE Hospede_tem_Telefone ADD CONSTRAINT Telefone_Hospede_fk FOREIGN KEY(idTelefone) REFERENCES Telefone(idTelefone);

ALTER TABLE Funcionario_tem_Telefone ADD CONSTRAINT Funcionario_Telefone_fk FOREIGN KEY (idFuncionario) REFERENCES Funcionario(idFuncionario);

ALTER TABLE Funcionario_tem_Telefone ADD CONSTRAINT Telefone_Funcionario_fk FOREIGN KEY(idTelefone) REFERENCES Telefone(idTelefone);

ALTER TABLE Acompanhante ADD CONSTRAINT Acompanhante_hospede_fk FOREIGN KEY (idHospede) REFERENCES Hospede(idHospede);

ALTER TABLE Acomodacao ADD CONSTRAINT Acomodacao_categoria_fk FOREIGN KEY (idCategoriaAcomodacao) REFERENCES Categoria_Acomodacao(idCategoriaAcomodacao);

ALTER TABLE Reserva ADD CONSTRAINT Reserva_Hospede_fk FOREIGN KEY (idHospede) REFERENCES Hospede(idHospede);

ALTER TABLE Reserva ADD CONSTRAINT Reserva_TipoAcomodacao_fk FOREIGN KEY (idCategoriaAcomodacao) REFERENCES Categoria_Acomodacao(idCategoriaAcomodacao);

ALTER TABLE Produto ADD CONSTRAINT Produto_CategoriaProduto_fk FOREIGN KEY (idCategoria) REFERENCES Categoria_Produto(idCategoria);

ALTER TABLE Consumo_Hospede ADD CONSTRAINT ConsumoHospede_Entrada_fk FOREIGN KEY (idCadastroEntrada) REFERENCES Cadastro_Entrada(idCadastroEntrada);

ALTER TABLE Consumo_Hospede ADD CONSTRAINT ConsumoHospede_Funcionario_fk FOREIGN KEY (idFuncionario) REFERENCES Funcionario(idFuncionario);

ALTER TABLE ConsumoHospede_tem_Produto ADD CONSTRAINT ProdutosConsumoHospede_Produtos_fk FOREIGN KEY (idProduto) REFERENCES Produto(idProduto);

ALTER TABLE ConsumoHospede_tem_Produto ADD CONSTRAINT ConsumoHospede_fk FOREIGN KEY (idConsumoHospede) REFERENCES Consumo_Hospede(idConsumoHospede);

ALTER TABLE Cadastro_Entrada ADD CONSTRAINT Entrada_Hospede_fk FOREIGN KEY (idHospede) REFERENCES Hospede(idHospede);

ALTER TABLE Cadastro_Entrada ADD CONSTRAINT Entrada_FuncionarioResponsavel_fk FOREIGN KEY (idFuncionario) REFERENCES Funcionario(idFuncionario);

ALTER TABLE Cadastro_Entrada ADD CONSTRAINT Entrada_Acomodacao_fk FOREIGN KEY (idAcomodacao) REFERENCES Acomodacao(idAcomodacao);

ALTER TABLE Cadastro_Saida ADD CONSTRAINT Saida_Entrada_fk FOREIGN KEY (idCadastroEntrada) REFERENCES Cadastro_Entrada(idCadastroEntrada);

ALTER TABLE Cadastro_Saida ADD CONSTRAINT Saida_TipoPagamento_fk FOREIGN KEY (idTipoPagamento) REFERENCES Tipo_Pagamento(idTipoPagamento);

ALTER TABLE Fatura ADD CONSTRAINT Fatura_Saida_fk FOREIGN KEY (idCadastroSaida) REFERENCES Cadastro_Saida(idCadastroSaida);


-- CRIAÇÃO DOS INDICES PARA PESQUISA

-- CREATE INDEX nomeDoIndice ON nome_tabela(nome_atributo);

-- agilizar a busca por produtos que fazem parte de um consumo registrado
CREATE INDEX lista_itens_de_consumo_index ON ConsumoHospede_tem_Produto(idConsumoHospede);

-- agilizar a busca pelos consumos efetuados pelos hóspedes
CREATE INDEX lista_consumo_index ON Consumo_Hospede(idCadastroEntrada);

-- agilizar a busca das entradas que originaram uma saída
CREATE INDEX index_entrada_tbl_saida ON Cadastro_Saida(idCadastroEntrada);

-- agilizar a busca de hospedes que realizaram entradas
CREATE INDEX hospedes_entrada_index ON Cadastro_Entrada(idHospede);

-- agiliar a busca de hospedes que realizaram reservas 
CREATE INDEX hospedes_reservas_index ON Reserva(idHospede);

-- agiliar a busca de acomodações de um determinado tipo
CREATE INDEX tipo_acomodacao_index ON Acomodacao(idCategoriaAcomodacao);

-- agiliar a busca de acompanhantes de um determinado hospede
CREATE INDEX hospede_acompanhante_index ON Acompanhante(idHospede);

-- agiliar as buscas do telefone de um determinado funcionário ou hospede

CREATE INDEX telefone_hospede_index ON Hospede_tem_Telefone(idHospede);
CREATE INDEX telefone_funcionario_index ON Funcionario_tem_Telefone(idFuncionario);

-- agiliar a busca de um funcionário ou hospede pelo seu nome
CREATE INDEX nome_funcionario_index ON Funcionario(nomeFuncionario);
CREATE INDEX nome_hospede_index ON Hospede(nomeHospede);

-- -----------------------------------------------------
-- SISTEMA GERENCIADOR DE BANCO DE DADOS
-- Consultas e visões
-- ALUNOS: Giliard Almeidade de Godoi & Ricardo Carreiro Alvim
-- PROJETO PARA A DISCIPLINA DE BANCO DE DADOS 3 - 2015/2
-- -----------------------------------------------------

-- -----------------------------------------------------
-- VISÕES AUXILIARES
-- -----------------------------------------------------

-- 1) Lista dos hospedes com telefone
CREATE OR REPLACE VIEW Hospede_telefone AS
	SELECT *
	FROM (SELECT t.idTelefone, t.ddd, t.ddi, t.telefone, x.idHospede
		  FROM  Telefone AS t 
		  NATURAL JOIN Hospede_tem_Telefone AS x) AS tel
    NATURAL JOIN Hospede AS h;

-- 2) Lista dos Funcionarios com telefone
CREATE OR REPLACE VIEW Funcionario_telefone AS
	SELECT * 
	FROM ( SELECT  t.idTelefone, t.ddd, t.ddi, t.telefone, z.idFuncionario
			FROM Telefone AS t 
			NATURAL JOIN Funcionario_tem_telefone AS z) AS tel
	NATURAL JOIN Funcionario AS f;

-- 3) Lista dos produtos por categoria
CREATE OR REPLACE VIEW produto_por_categoria AS
	SELECT *
	FROM Produto NATURAL JOIN CategoriaProduto ORDER BY nomeCategoria;

-- 4)	lista produtos consumidos - visão intermediária;
CREATE OR REPLACE VIEW lista_produtos_consumo AS 
	SELECT *
	FROM ( SELECT * 
			FROM Produto NATURAL JOIN consumoHospede_tem_produto
		) AS p
	NATURAL JOIN ConsumoHospede AS hc;
	
-- 5) listar os acompanhantes de determinado hóspede;
CREATE OR REPLACE VIEW lista_acompanhante_hospede AS
	SELECT * FROM Hospede NATURAL JOIN Acompanhante;

-- 6) listar as acomodações por tipo
CREATE OR REPLACE VIEW acomodacao_por_tipo AS
	SELECT * FROM Acomodacao NATURAL JOIN CategoriaAcomodacao  ORDER BY nomeTipoAcomodacao;


-- -----------------------------------------------------
-- VISÕES DE RELATÓRIOS
-- -----------------------------------------------------

-- 1) Lista de hospedes que estão no hotel
-- Listar:
-- nome do hópede principal | nome dos acompanhantes | data Entrada | data prevista para saida | numero da acomodacao

CREATE OR REPLACE VIEW 	hospedagem_atuais AS
SELECT x.nomeHospede, x.nomeAcompanhante, x.dataHoraEntrada, x.dataHoraSaidaPrevista, z.numeroAcomodacao
FROM ( SELECT h.nomeHospede, h.nomeAcompanhante, e.dataHoraEntrada, e.dataHoraSaidaPrevista, e.idAcomodacao
		FROM CadastroEntrada AS e NATURAL JOIN lista_acompanhante_hospede AS h
		WHERE e.dataHoraSaidaPrevista < current_date ) AS x ;


-- 2) Listar as reservas para a data atual (hoje = current_date)
-- Listar:
-- nome Hospede Principal | telefone para contato | tipo Acomodação | data Prevista para saída
-- o fato do telefone estar 'normalizado' dificulta que eu liste apensa um telefone
CREATE OR REPLACE VIEW listaReservasParaDataAtual AS 
SELECT m.nomeHospede,m.ddd, m.ddi, m.telefone, tmp.dataHoraSaidaReserva, tmp.nomeTipoAcomodacao FROM
(SELECT h.idHospede, h.dataHoraSaidaReserva, c.nomeTipoAcomodacao FROM
	(SELECT idHospede, idCategoriaAcomodacao, dataHoraSaidaReserva
		FROM Reserva WHERE dataHoraChegadaReserva = current_date) AS h NATURAL JOIN CategoriaAcomodacao AS c) as tmp
		INNER JOIN Hospede_telefone AS m ON tmp.idHospede = m.idHospede;
	

-- 3) Comprovante de saída do hospedes
-- nome do hospede | documento | data e horário da entrada | data e horário da saída | numero total de diárias |
-- valor total de diárias | valor total consumo | valor total telefonemas | valor do desconto | total a pagar

-- Lista dos produtos consumidos
-- Data do consumo | descrição do item | quantidade | preço unitário | preço total

-- Forma de pagamento | Espaço para assinatura



-- 4) Permitir consultas pelo hóspede
-- -> dados referente a sua estadia, conferir diárias, conferir consumo;


-- 5) Permitir consulta histórico das estadias pelo hóspede
-- Pré condição: codigo de identificação e senha
	-- Um linha para cada estadia onde deve constar:
	-- data entrada | data saída | totais pagos em cada ocasião
	
-- 6) Consultas on-line da ocupação das acomodações num determinado período
--   ocupado se está hospedado (ocupado)
--	 disponível se não está ocupada no período e o número de reservas < n.º total de acomodação de um determinado tipo
-- 1 linha para cada tipo:
-- cód. tipo | descrição do tipo | n.º acomodação existente | n.º acomodações ocupadas | n.º acomodações reservadas | n.º de acomodações disponíveis



-- 7) Relatório resumido do faturamanento no período (quinzenal ou semanal) para cada dia do  período  um resumo das estadias pagas:
-- diárias | frigobar | restaurante | lavanderia | telefone | desconto | total

-- 8) Impressão diária das faturas a semrem enviadas contendo:
-- 


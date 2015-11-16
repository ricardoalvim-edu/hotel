/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sistemahotel.dao.factoryDAO;

import org.sistemahotel.dao.implementacao.*;
import org.sistemahotel.dao.interfaces.*;

/**
 *
 * @author GILIARD
 */
public class HibernateFactoryDAO extends DAOFactory {

    @Override
    public AcomodacaoDAO getAcomodacaoDAO() {
        return new HibernateAcomodacaoDAO();
    }

    @Override
    public AcompanhanteDAO getAcompanhanteDAO() {
        return new HibernateAcompanhanteDAO();
    }

    @Override
    public CadastroEntradaDAO getCadastroEntradaDAO() {
        return new HibernateCadastroEntradaDAO();
    }

    @Override
    public CadastroSaidaDAO getCadastroSaidaDAO() {
        return new HibernateCadastroSaidaDAO();
    }

    @Override
    public CategoriaAcomodacaoDAO getCategoriaAcomodacaoDAO() {
        return new HibernateCategoriaAcomodacaoDAO();
    }

    @Override
    public CategoriaProdutoDAO getCategoriaProdutoDAO() {
        return new HibernateCategoriaProdutoDAO();
    }

    @Override
    public ConsumoHospedeDAO getConsumoHospedeDAO() {
        return new HibernateConsumoHospedeDAO();
    }

    @Override
    public EnderecoDAO getEnderecoDAO() {
        return new HibernateEnderecoDAO();
    }

    @Override
    public FaturaDAO getFaturaDAO() {
        return new HibernateFaturaDAO();
    }

    @Override
    public FuncionarioDAO getFuncionarioDAO() {
        return new HibernateFuncionarioDAO();
    }

    @Override
    public HospedeDAO getHospedeDAO() {
        return new HibernateHospedeDAO();
    }

    @Override
    public ProdutoDAO getProdutoDAO() {
        return new HibernateProdutoDAO();
    }

    @Override
    public ReservaDAO getReservaDAO() {
        return new HibernateReservaDAO();
    }

    @Override
    public TelefoneDAO getTelefoneDAO() {
        return new HibernateTelefoneDAO();
    }

    @Override
    public TipoPagamentoDAO getTipoPagamentoDAO() {
        return new HibernateTipoPagamentoDAO();
    }
    
}

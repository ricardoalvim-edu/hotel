/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sistemahotel.dao.factoryDAO;

import org.sistemahotel.dao.interfaces.*;

/**
 *
 * @author GILIARD
 */
public abstract class DAOFactory {
    private static final Class FACTORY_CLASS = HibernateFactoryDAO.class;
    
    public static DAOFactory getDAOFactory(){
        try {
            return (DAOFactory) FACTORY_CLASS.newInstance();
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        }catch(IllegalAccessException e){
            throw new RuntimeException(e);
        }
    }
    
    public abstract AcomodacaoDAO getAcomodacaoDAO();
    
    public abstract AcompanhanteDAO getAcompanhanteDAO();
    
    public abstract CadastroEntradaDAO getCadastroEntradaDAO();
    
    public abstract CadastroSaidaDAO getCadastroSaidaDAO();
    
    public abstract CategoriaAcomodacaoDAO getCategoriaAcomodacaoDAO();
    
    public abstract CategoriaProdutoDAO getCategoriaProdutoDAO();
    
    public abstract ConsumoHospedeDAO getConsumoHospedeDAO();
    
    public abstract EnderecoDAO getEnderecoDAO();
    
    public abstract FaturaDAO getFaturaDAO();
    
    public abstract FuncionarioDAO getFuncionarioDAO();
    
    public abstract HospedeDAO getHospedeDAO();
    
    public abstract ProdutoDAO getProdutoDAO();
    
    public abstract ReservaDAO getReservaDAO();
    
    public abstract TelefoneDAO getTelefoneDAO();
    
    public abstract TipoPagamentoDAO getTipoPagamentoDAO();
    
    public abstract AdministradorDAO getAdministrador();
}

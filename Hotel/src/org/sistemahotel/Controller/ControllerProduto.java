/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sistemahotel.Controller;

import java.util.List;
import org.sistemahotel.Model.CategoriaProduto;
import org.sistemahotel.Model.Produto;
import org.sistemahotel.dao.factoryDAO.DAOFactory;
import org.sistemahotel.dao.interfaces.CategoriaProdutoDAO;

/**
 *
 * @author GILIARD
 */
public class ControllerProduto extends Controller<Produto>{
    
    private final CategoriaProdutoDAO categoriaProdutoDAO;
    private final List<CategoriaProduto> listaCategoriaProduto;

    public ControllerProduto() {
        this.dao = DAOFactory.getDAOFactory().getProdutoDAO();
        this.lista = dao.listAll();
        
        categoriaProdutoDAO = DAOFactory.getDAOFactory().getCategoriaProdutoDAO();
        listaCategoriaProduto = categoriaProdutoDAO.listAll();
    }
    
    
    @Override
    public Produto novo() {
        return new Produto();
    }
    
    public List<CategoriaProduto> getListaCategoriaProduto(){
        return listaCategoriaProduto;
    }
  
}

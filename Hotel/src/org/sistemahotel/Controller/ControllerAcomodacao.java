/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sistemahotel.Controller;

import java.util.List;
import org.sistemahotel.Model.Acomodacao;
import org.sistemahotel.Model.CategoriaAcomodacao;
import org.sistemahotel.Model.CategoriaProduto;
import org.sistemahotel.dao.factoryDAO.DAOFactory;
import org.sistemahotel.dao.interfaces.CategoriaAcomodacaoDAO;

/**
 *
 * @author GILIARD
 */
public class ControllerAcomodacao extends Controller<Acomodacao>{

    private final CategoriaAcomodacaoDAO categoriaAcomodacaoDAO;
    private final List<CategoriaAcomodacao> listaCategoriaAcomodacao;

    public ControllerAcomodacao() {
        this.dao = DAOFactory.getDAOFactory().getAcomodacaoDAO();
        this.lista = dao.listAll();
        
        categoriaAcomodacaoDAO = DAOFactory.getDAOFactory().getCategoriaAcomodacaoDAO();
        listaCategoriaAcomodacao = categoriaAcomodacaoDAO.listAll();
    }
    
    @Override
    public Acomodacao novo() {
        return new Acomodacao();
    }
    
    @Override
    public List<CategoriaAcomodacao> getListaCategoriaAcomodacao(){
        return listaCategoriaAcomodacao;
    }
    
}

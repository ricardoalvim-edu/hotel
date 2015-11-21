/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sistemahotel.Controller;

import org.sistemahotel.Model.CategoriaAcomodacao;
import org.sistemahotel.dao.factoryDAO.DAOFactory;

/**
 *
 * @author GILIARD
 */
public class ControllerCategoriaAcomodacao extends Controller<CategoriaAcomodacao> {

    public ControllerCategoriaAcomodacao() {
        super();
        this.dao = DAOFactory.getDAOFactory().getCategoriaAcomodacaoDAO();
        this.lista = dao.listAll();
    }
     
    @Override
    public CategoriaAcomodacao novo() {
        return new CategoriaAcomodacao();
    }
    
}

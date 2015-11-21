/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sistemahotel.Controller;

import org.sistemahotel.Model.Acompanhante;
import org.sistemahotel.dao.factoryDAO.DAOFactory;

/**
 *
 * @author GILIARD
 */
public class ControllerAcompanhante extends Controller<Acompanhante> {

    public ControllerAcompanhante() {
        this.dao = DAOFactory.getDAOFactory().getAcompanhanteDAO();
        this.lista = dao.listAll();
    }

    @Override
    public Acompanhante novo() {
        return new Acompanhante();
    }
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sistemahotel.Controller;

import org.sistemahotel.Model.Hospede;
import org.sistemahotel.Model.Telefone;
import org.sistemahotel.dao.factoryDAO.DAOFactory;

/**
 *
 * @author GILIARD
 */
public class ControllerTelefone extends Controller<Telefone>{

    public ControllerTelefone() {
        super();
        this.dao = DAOFactory.getDAOFactory().getTelefoneDAO();
    }
    
    

    @Override
    public Telefone novo() {
        return new Telefone();
    }
    
}

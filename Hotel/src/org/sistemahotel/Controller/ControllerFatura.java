/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sistemahotel.Controller;

import org.sistemahotel.Model.Fatura;
import org.sistemahotel.dao.factoryDAO.DAOFactory;

/**
 *
 * @author GILIARD
 */
public class ControllerFatura extends Controller<Fatura> {

    public ControllerFatura() {
        this.dao = DAOFactory.getDAOFactory().getFaturaDAO();
    }

    @Override
    public Fatura novo() {
       return new Fatura();
    }
    
    
}

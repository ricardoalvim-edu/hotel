/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sistemahotel.Controller;

import org.sistemahotel.Model.Hospede;
import org.sistemahotel.dao.factoryDAO.DAOFactory;

/**
 *
 * @author GILIARD
 */
public class ControllerHospede extends Controller<Hospede>{

    public ControllerHospede() {
        this.dao = DAOFactory.getDAOFactory().getHospedeDAO();
        this.lista = dao.listAll();
    }

    @Override
    public Hospede novo() {
        return new Hospede();
    }
    
}

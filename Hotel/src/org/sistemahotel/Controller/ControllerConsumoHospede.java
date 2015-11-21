/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sistemahotel.Controller;

import org.sistemahotel.Model.ConsumoHospede;
import org.sistemahotel.dao.factoryDAO.DAOFactory;

/**
 *
 * @author GILIARD
 */
public class ControllerConsumoHospede extends Controller<ConsumoHospede>{

    public ControllerConsumoHospede() {
        this.dao = DAOFactory.getDAOFactory().getConsumoHospedeDAO();
        this.lista = dao.listAll();
    }

    @Override
    public ConsumoHospede novo() {
        return new ConsumoHospede();
    }
    
    
}

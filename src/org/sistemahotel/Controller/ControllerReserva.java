/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sistemahotel.Controller;

import org.sistemahotel.Model.Reserva;
import org.sistemahotel.dao.factoryDAO.DAOFactory;

/**
 *
 * @author GILIARD
 */
public class ControllerReserva extends Controller<Reserva> {

    public ControllerReserva() {
        super();
        this.dao = DAOFactory.getDAOFactory().getReservaDAO();
        this.lista = dao.listAll();
    }

    @Override
    public Reserva novo() {
        return new Reserva();
    }
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sistemahotel.dao.implementacao;

import org.sistemahotel.Model.Reserva;
import org.sistemahotel.dao.interfaces.ReservaDAO;

/**
 *
 * @author GILIARD
 */
public class HibernateReservaDAO 
        extends HibernateDAO<Reserva,Integer>
        implements ReservaDAO{

    public HibernateReservaDAO() {
        super(Reserva.class);
    }
    
}

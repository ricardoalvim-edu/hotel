/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sistemahotel.Controller;

import org.sistemahotel.Model.Acomodacao;
import org.sistemahotel.dao.factoryDAO.DAOFactory;

/**
 *
 * @author GILIARD
 */
public class ControllerAcomodacao extends Controller<Acomodacao>{

    public ControllerAcomodacao() {
        this.dao = DAOFactory.getDAOFactory().getAcomodacaoDAO();
        this.lista = dao.listAll();
    }
    
    @Override
    public Acomodacao novo() {
        return new Acomodacao();
    }
    
}

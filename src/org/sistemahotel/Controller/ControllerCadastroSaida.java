/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sistemahotel.Controller;

import org.sistemahotel.Model.CadastroSaida;
import org.sistemahotel.dao.factoryDAO.DAOFactory;

/**
 *
 * @author GILIARD
 */
public class ControllerCadastroSaida extends Controller<CadastroSaida> {

    public ControllerCadastroSaida() {
        this.dao = DAOFactory.getDAOFactory().getCadastroSaidaDAO();
        this.lista = dao.listAll();
    }

    @Override
    public CadastroSaida novo() {
        return new CadastroSaida();
    }
    
    
}

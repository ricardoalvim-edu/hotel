/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sistemahotel.Controller;

import org.sistemahotel.Model.CadastroEntrada;
import org.sistemahotel.dao.factoryDAO.DAOFactory;

/**
 *
 * @author GILIARD
 */
public class ControllerCadastroEntrada extends Controller<CadastroEntrada>{

    public ControllerCadastroEntrada() {
        this.dao = DAOFactory.getDAOFactory().getCadastroEntradaDAO();
        this.lista = dao.listAll();
    }

    @Override
    public CadastroEntrada novo() {
        return new CadastroEntrada();
    }
    
    
}

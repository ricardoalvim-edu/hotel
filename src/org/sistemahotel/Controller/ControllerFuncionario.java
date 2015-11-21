/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sistemahotel.Controller;

import org.sistemahotel.Model.Funcionario;
import org.sistemahotel.dao.factoryDAO.DAOFactory;

/**
 *
 * @author GILIARD
 */
public class ControllerFuncionario extends Controller<Funcionario> {

    public ControllerFuncionario() {
        this.dao = DAOFactory.getDAOFactory().getFuncionarioDAO();
        this.lista = dao.listAll();
    }

    @Override
    public Funcionario novo() {
        return new Funcionario();
    }
    
}

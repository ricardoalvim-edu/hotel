/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sistemahotel.Controller;

import org.sistemahotel.Model.CategoriaAcomodacao;
import org.sistemahotel.dao.factoryDAO.FactoryDAO;

/**
 *
 * @author GILIARD
 */
public class ControllerCategoriaAcomodacao extends Controller<CategoriaAcomodacao> {

    public ControllerCategoriaAcomodacao() {
        this.dao = FactoryDAO.getFactoryDAO().getCategoriaAcomodacaoDAO();
        this.lista = dao.listAll();
    }
     
    @Override
    protected CategoriaAcomodacao novo() {
        return new CategoriaAcomodacao();
    }
    
}

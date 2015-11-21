/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sistemahotel.Controller;

import org.sistemahotel.Model.TipoPagamento;
import org.sistemahotel.dao.factoryDAO.DAOFactory;

/**
 *
 * @author GILIARD
 */
public class ControllerTipoPagamento extends Controller<TipoPagamento> {

    public ControllerTipoPagamento() {
        this.dao = DAOFactory.getDAOFactory().getTipoPagamentoDAO();
        this.lista = dao.listAll();
    }

    @Override
    public TipoPagamento novo() {
        return new  TipoPagamento();
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sistemahotel.dao.implementacao;

import org.sistemahotel.Model.TipoPagamento;
import org.sistemahotel.dao.interfaces.TipoPagamentoDAO;

/**
 *
 * @author GILIARD
 */
public class HibernateTipoPagamentoDAO
        extends HibernateDAO<TipoPagamento, Integer>
        implements TipoPagamentoDAO{

    public HibernateTipoPagamentoDAO() {
        super(TipoPagamento.class);
    }
    
}

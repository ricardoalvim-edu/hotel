/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sistemahotel.dao.implementacao;

import org.sistemahotel.Model.Acompanhante;
import org.sistemahotel.dao.interfaces.AcompanhanteDAO;

/**
 *
 * @author GILIARD
 */
public class HibernateAcompanhanteDAO extends HibernateDAO<Acompanhante, Integer> implements AcompanhanteDAO{

    public HibernateAcompanhanteDAO() {
        super(Acompanhante.class);
    }
    
}

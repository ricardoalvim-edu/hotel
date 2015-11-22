/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sistemahotel.dao.implementacao;

import org.sistemahotel.Model.Acomodacao;
import org.sistemahotel.dao.interfaces.AcomodacaoDAO;

/**
 *
 * @author GILIARD
 */
public class HibernateAcomodacaoDAO extends HibernateDAO<Acomodacao, Integer> implements AcomodacaoDAO{

    public HibernateAcomodacaoDAO() {
        super(Acomodacao.class);
    }
    
}

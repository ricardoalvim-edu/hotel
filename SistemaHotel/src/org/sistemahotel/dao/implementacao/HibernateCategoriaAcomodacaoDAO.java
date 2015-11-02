/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sistemahotel.dao.implementacao;

import org.sistemahotel.Model.CategoriaAcomodacao;
import org.sistemahotel.dao.interfaces.CategoriaAcomodacaoDAO;

/**
 *
 * @author GILIARD
 */
public class HibernateCategoriaAcomodacaoDAO extends HibernateDAO<CategoriaAcomodacao, Integer> 
                implements CategoriaAcomodacaoDAO {

    public HibernateCategoriaAcomodacaoDAO() {
        super(CategoriaAcomodacao.class);
    }
    
}

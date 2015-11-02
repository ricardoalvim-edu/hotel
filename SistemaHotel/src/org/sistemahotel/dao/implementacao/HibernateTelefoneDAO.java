/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sistemahotel.dao.implementacao;

import org.sistemahotel.Model.Telefone;
import org.sistemahotel.dao.interfaces.TelefoneDAO;

/**
 *
 * @author GILIARD
 */
public class HibernateTelefoneDAO 
        extends HibernateDAO<Telefone, Integer>
        implements TelefoneDAO{

    public HibernateTelefoneDAO() {
        super(Telefone.class);
    }
    
}

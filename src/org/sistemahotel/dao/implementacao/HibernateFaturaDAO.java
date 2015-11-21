/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sistemahotel.dao.implementacao;

import org.sistemahotel.Model.Fatura;
import org.sistemahotel.dao.interfaces.FaturaDAO;

/**
 *
 * @author GILIARD
 */
public class HibernateFaturaDAO 
    extends HibernateDAO<Fatura, Integer>
    implements FaturaDAO{

    public HibernateFaturaDAO() {
        super(Fatura.class);
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sistemahotel.dao.implementacao;

import org.sistemahotel.Model.Produto;
import org.sistemahotel.dao.interfaces.ProdutoDAO;

/**
 *
 * @author GILIARD
 */
public class HibernateProdutoDAO 
        extends HibernateDAO<Produto, Integer>
        implements ProdutoDAO{

    public HibernateProdutoDAO() {
        super(Produto.class);
    }
    
}

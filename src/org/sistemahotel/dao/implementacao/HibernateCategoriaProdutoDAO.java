/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sistemahotel.dao.implementacao;

import org.sistemahotel.Model.CategoriaProduto;
import org.sistemahotel.dao.interfaces.CategoriaProdutoDAO;

/**
 *
 * @author GILIARD
 */
public class HibernateCategoriaProdutoDAO extends HibernateDAO<CategoriaProduto, Integer>
        implements CategoriaProdutoDAO{

    public HibernateCategoriaProdutoDAO() {
        super(CategoriaProduto.class);
    }
    
}

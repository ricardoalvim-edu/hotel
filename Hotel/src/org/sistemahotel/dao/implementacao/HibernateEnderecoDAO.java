/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sistemahotel.dao.implementacao;

import org.sistemahotel.Model.Endereco;
import org.sistemahotel.dao.interfaces.EnderecoDAO;

/**
 *
 * @author GILIARD
 */
public class HibernateEnderecoDAO
        extends HibernateDAO<Endereco, Integer>
        implements EnderecoDAO{

    public HibernateEnderecoDAO() {
        super(Endereco.class);
    }
   
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sistemahotel.dao.implementacao;

import org.sistemahotel.Model.CadastroEntrada;
import org.sistemahotel.dao.interfaces.CadastroEntradaDAO;

/**
 *
 * @author GILIARD
 */
public class HibernateCadastroEntradaDAO extends HibernateDAO<CadastroEntrada, Integer> implements CadastroEntradaDAO{

    public HibernateCadastroEntradaDAO() {
        super(CadastroEntrada.class);
    }
    
}

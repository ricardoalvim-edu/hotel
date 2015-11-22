/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sistemahotel.dao.implementacao;

import org.sistemahotel.Model.CadastroSaida;
import org.sistemahotel.dao.interfaces.CadastroSaidaDAO;

/**
 *
 * @author GILIARD
 */
public class HibernateCadastroSaidaDAO extends HibernateDAO<CadastroSaida, Integer> implements CadastroSaidaDAO {

    public HibernateCadastroSaidaDAO() {
        super(CadastroSaida.class);
    }
    
}

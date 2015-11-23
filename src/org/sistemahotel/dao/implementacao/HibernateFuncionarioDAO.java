/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sistemahotel.dao.implementacao;

import org.sistemahotel.Model.Funcionario;
import org.sistemahotel.dao.interfaces.FuncionarioDAO;

/**
 *
 * @author GILIARD
 */
public class HibernateFuncionarioDAO 
        extends HibernateDAO<Funcionario,Integer>
        implements FuncionarioDAO{

    public HibernateFuncionarioDAO() {
        super(Funcionario.class);
    }

    @Override
    public Funcionario getByUsuario(String usuario) {
       return (Funcionario) getByUsuario(usuario, Funcionario.class);
    }
    
    
    
}

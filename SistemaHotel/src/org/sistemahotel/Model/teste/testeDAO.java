/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sistemahotel.Model.teste;

import org.sistemahotel.Model.Telefone;
import org.sistemahotel.dao.factoryDAO.FactoryDAO;
import org.sistemahotel.dao.interfaces.TelefoneDAO;

/**
 *
 * @author GILIARD
 */
public class testeDAO {
    public static void main(String[] args) {
        FactoryDAO daoFactory = FactoryDAO.getFactoryDAO();
        TelefoneDAO dao = daoFactory.getTelefoneDAO();
        
        Telefone telefone = new Telefone();
        
        telefone.setDdd("41");
        telefone.setTelefone("444");
        
        
        dao.saveAndCommit(telefone);
        
        dao.closeTransaction();
        
        System.out.println("Feito");
        
        System.exit(0);
    }
}

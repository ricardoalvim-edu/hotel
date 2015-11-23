/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sistemahotel.Controller;

import java.util.List;
import org.sistemahotel.Model.Telefone;
import org.sistemahotel.Model.AgendaContato;
import org.sistemahotel.dao.factoryDAO.DAOFactory;

/**
 *
 * @author GILIARD
 */
public class ControllerTelefone extends Controller<Telefone> implements AgendaContato {
    
    AgendaContato proprietario; 
    
    public ControllerTelefone() {
        super();
        this.dao = DAOFactory.getDAOFactory().getTelefoneDAO();
        this.lista = dao.listAll();
    }
    
    public ControllerTelefone(AgendaContato proprietario){
        super();
        this.dao = DAOFactory.getDAOFactory().getTelefoneDAO();
        this.lista = proprietario.getListaTelefone();
        this.proprietario = proprietario;
    }
    
    

    @Override
    public Telefone novo() {
        return new Telefone();
    }
    
    @Override
    public List<Telefone> listAll(){
        return this.lista;
    }

    @Override
    public List<Telefone> getListaTelefone() {
        return proprietario.getListaTelefone();
    }

    @Override
    public void setListaTelefone(List<Telefone> lista) {
        proprietario.setListaTelefone(lista);
    }

    @Override
    public String getNomeProprietarioAgenda() {
        return proprietario.getNomeProprietarioAgenda();
    }

    
}

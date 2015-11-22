/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sistemahotel.Controller;

import java.util.List;
import org.sistemahotel.Model.CategoriaAcomodacao;
import org.sistemahotel.Model.Hospede;
import org.sistemahotel.Model.Reserva;
import org.sistemahotel.dao.factoryDAO.DAOFactory;
import org.sistemahotel.dao.interfaces.CategoriaAcomodacaoDAO;
import org.sistemahotel.dao.interfaces.HospedeDAO;

/**
 *
 * @author GILIARD
 */
public class ControllerReserva extends Controller<Reserva> {

    private final CategoriaAcomodacaoDAO categoriaAcomodacaoDAO;
    private final List<CategoriaAcomodacao> listaCategoriaAcomodacao;
    
    private final HospedeDAO hospedeDAO;
    private final List<Hospede> listaHospedes;
    public ControllerReserva() {
        super();
        this.dao = DAOFactory.getDAOFactory().getReservaDAO();
        this.lista = dao.listAll();
        
        categoriaAcomodacaoDAO = DAOFactory.getDAOFactory().getCategoriaAcomodacaoDAO();
        listaCategoriaAcomodacao = categoriaAcomodacaoDAO.listAll();
        
        hospedeDAO = DAOFactory.getDAOFactory().getHospedeDAO();
        listaHospedes = hospedeDAO.listAll();
    }

    @Override
    public Reserva novo() {
        return new Reserva();
    }
    
    @Override
    public List<CategoriaAcomodacao> getListaCategoriaAcomodacao(){
        return listaCategoriaAcomodacao;
    }
    
    @Override
    public List<Hospede> getListaHospede(){
        return listaHospedes;
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sistemahotel.dao.implementacao;

import org.sistemahotel.Model.Hospede;
import org.sistemahotel.dao.interfaces.HospedeDAO;

/**
 *
 * @author GILIARD
 */
public class HibernateHospedeDAO
        extends HibernateDAO<Hospede, Integer>
        implements HospedeDAO{

    public HibernateHospedeDAO() {
        super(Hospede.class);
    }

    @Override
    public Hospede getByUsuario(String usuario) {
        return (Hospede) getByUsuario(usuario, Hospede.class);
    }
    
    
}

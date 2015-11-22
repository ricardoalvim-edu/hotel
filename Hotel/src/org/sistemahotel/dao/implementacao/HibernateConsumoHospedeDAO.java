/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sistemahotel.dao.implementacao;

import org.sistemahotel.Model.ConsumoHospede;
import org.sistemahotel.dao.interfaces.ConsumoHospedeDAO;

/**
 *
 * @author GILIARD
 */
public class HibernateConsumoHospedeDAO 
        extends HibernateDAO<ConsumoHospede, Integer>
            implements ConsumoHospedeDAO{

    public HibernateConsumoHospedeDAO() {
        super(ConsumoHospede.class);
    }
    
}

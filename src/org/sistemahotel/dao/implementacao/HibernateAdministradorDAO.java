package org.sistemahotel.dao.implementacao;

import org.sistemahotel.Model.Administrador;
import org.sistemahotel.dao.interfaces.AdministradorDAO;

/**
 *
 * @author ricar
 */
public class HibernateAdministradorDAO extends HibernateDAO<Administrador, Integer> implements AdministradorDAO{
    public HibernateAdministradorDAO () {
        super(Administrador.class);
    }
}

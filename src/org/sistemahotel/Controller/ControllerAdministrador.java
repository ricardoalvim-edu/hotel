package org.sistemahotel.Controller;

import org.sistemahotel.Model.Administrador;
import org.sistemahotel.dao.HibernateUtil.HibernateUtil;
import org.sistemahotel.dao.factoryDAO.DAOFactory;

/**
 *
 * @author ricar
 */
public class ControllerAdministrador extends Controller<Administrador>{
    public ControllerAdministrador() {
        this.dao = DAOFactory.getDAOFactory().getFuncionarioDAO();
        this.lista = dao.listAll();
    }

    @Override
    public Administrador novo() {
        return new Administrador();
    }
    
    
}

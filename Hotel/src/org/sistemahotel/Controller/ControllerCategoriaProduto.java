package org.sistemahotel.Controller;

import org.sistemahotel.Model.CategoriaProduto;
import org.sistemahotel.dao.factoryDAO.DAOFactory;

/**
 *
 * @author ricar
 */
public class ControllerCategoriaProduto extends Controller<CategoriaProduto>{

    @Override
    public CategoriaProduto novo() {
        return new CategoriaProduto();
    }
    
    public ControllerCategoriaProduto() {
        this.dao = DAOFactory.getDAOFactory().getCategoriaProdutoDAO();
        this.lista = dao.listAll();
    }
}

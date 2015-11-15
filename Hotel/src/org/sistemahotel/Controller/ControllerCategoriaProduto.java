package org.sistemahotel.Controller;

import org.sistemahotel.Model.CategoriaProduto;
import org.sistemahotel.dao.factoryDAO.FactoryDAO;

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
        this.dao = FactoryDAO.getFactoryDAO().getCategoriaProdutoDAO();
        this.lista = dao.listAll();
    }
}

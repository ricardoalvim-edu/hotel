package org.sistemahotel.view;

import javax.swing.JFrame;
import org.sistemahotel.Controller.Controller;

/**
 *
 * @author GILIARD
 */
public abstract class JanelaAbstrata<T> extends JFrame {
   
   protected Controller controle;
    
   protected abstract void setView(T objeto);
   protected abstract T getView();
}

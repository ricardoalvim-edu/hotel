package org.sistemahotel.view;

import javax.swing.JFrame;
import org.sistemahotel.Controller.Controller;

/**
 *
 * @author GILIARD
 * @param <T>
 */
public abstract class JanelaAbstrata<T> extends JFrame {
   
   protected Controller<T> controle;
     
    
   protected abstract void setView(T objeto);
   protected abstract T getView();
}

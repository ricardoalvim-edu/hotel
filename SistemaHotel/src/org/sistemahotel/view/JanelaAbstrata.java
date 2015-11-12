/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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

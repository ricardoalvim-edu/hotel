/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sistemahotel.Controller;

import java.util.List;
import org.sistemahotel.Iterator.IteratorList;
import org.sistemahotel.dao.interfaces.DAO;

/**
 *
 * @author GILIARD
 * @param <T>
 */
public abstract class Controller<T>{
   
    protected List<T> lista;
    IteratorList<T> iterator = new IteratorList<>(lista);
    protected DAO dao;
    
    
   
   protected abstract T novo(); 
   
   protected void salvar(T objeto){
       dao.saveAndCommit(objeto);
   }
   
   protected void excluir(T objeto){
       dao.deleteAndCommit(objeto);
   }   
   
   protected T exibeProximo(){
       T objeto = iterator.next();
       return objeto;
   }
   
   protected T exibeAnterior(){
       T objeto = iterator.previous();
       return objeto;
   }
   
   protected T exibeUltimo(){
       T objeto = iterator.last();
       return objeto;
   }
   
   protected T exibePrimeiro(){
       T objeto = iterator.first();
       return objeto;
   }
   
   protected List<T> listarTudo(){
       return dao.listAll();
   }
      
}

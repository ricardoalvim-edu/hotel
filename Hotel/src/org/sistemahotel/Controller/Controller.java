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
   
   public abstract T novo(); 
   
   public void salvar(T objeto){
       dao.beginTransaction();
       dao.save(objeto);
       dao.closeTransaction();
   }
   
   public void excluir(T objeto){
       dao.deleteAndCommit(objeto);
   }   
   
   public T exibeProximo(){
       T objeto = iterator.next();
       return objeto;
   }
   
   public T exibeAnterior(){
       T objeto = iterator.previous();
       return objeto;
   }
   
   public T exibeUltimo(){
       T objeto = iterator.last();
       return objeto;
   }
   
   public T exibePrimeiro(){
       T objeto = iterator.first();
       return objeto;
   }
   
   public List<T> listarTudo(){
       return dao.listAll();
   }
      
}

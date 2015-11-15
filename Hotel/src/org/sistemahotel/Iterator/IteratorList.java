/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sistemahotel.Iterator;

import java.util.Iterator;
import java.util.List;

/**
 *
 * @author GILIARD
 * @param <T>
 * 
 * Referências: 
 */
public class IteratorList<T> implements Iterator{
    
    private List<T> lista;
    private int cursor = 0;
    
    public IteratorList(List<T> lista){
        this.lista = lista;
    }
    
    @Override
    public boolean hasNext() {
        if(!this.isEmpty()){
            return cursor < lista.size()-2;
        }else{
            return false;
        }
    }
    
    public boolean hasPrevious(){
        if(!this.isEmpty()){
            return cursor > 0;
        }else{
            return false;
        }
    }

    @Override
    public T next() {
        if(!this.isEmpty() && this.hasNext()){
            cursor++;
            return lista.get(cursor);
        }else if(!this.isEmpty()){
            // Se a lista não tem próximo, atingiu o fim da lista, retorna o mesmo elemento, o último
            return lista.get(cursor);
        }else{
            //lista vazia, não tem elementos para retornar
            return null;
        }        
    }
    
    public T previous(){
        if(!this.isEmpty() && this.hasPrevious()){
            cursor--;
            return lista.get(cursor);
        }else if(!this.isEmpty()){
            //não é vazia, mas não tem anterior
            //atingiu o inicio da lista, retorna o primeiro elemento
            return lista.get(cursor);
        }else{
            //lista vazia, não tem elementos para retornar
            return null;
        }
    }
    
    public T current(){
        if(!this.isEmpty()){
            return lista.get(cursor);
        }else{
            return null;
        }
    }
    
    public T first(){
        if(!this.isEmpty()){
            cursor = 0;
            return lista.get(cursor);
        }else{
            return null;
        }
    }
    
    public T last(){
        if(!this.isEmpty()){
            cursor = lista.size()-1;
            return lista.get(cursor);
        }else{
            return null;
        }
    }
    
    public boolean isEmpty(){
        return lista.isEmpty();
    }
    
}

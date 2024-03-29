/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sistemahotel.Controller;

import java.util.List;
import org.sistemahotel.Model.Acomodacao;
import org.sistemahotel.Model.CategoriaAcomodacao;
import org.sistemahotel.Model.CategoriaProduto;
import org.sistemahotel.Model.Hospede;
import org.sistemahotel.dao.interfaces.DAO;

/**
 *
 * @author GILIARD
 * @param <T>
 */
public abstract class Controller<T>{
   
   protected List<T> lista;
   private int cursor;
   protected DAO dao;
   
    /*
        Nos construtores das classes que vão implementar o Controller eu terei que inicializar o dao com o tipo de dao especifico da classe que estou lidando.
   Também terei que inicilizar a lista com os elementos por isso derei que fazer um this.lista = dao.listAll(); em todos os construtores das classes que 
   implementarem o meu Controller.
   */
    public Controller(){
        this.cursor = 0;
    }
   /*
    O método novo retorna um objeto do tipo do tipo do controller está lidando, por isso que eu coloquei esse método como abstrato.
    */
   public abstract T novo(); 
   
   public void salvar(T objeto){
       if(!lista.contains(objeto)){
           lista.add(objeto);
       }
       dao.beginTransaction();
       dao.save(objeto);
       dao.commitTransaction();
   }
   
   public void excluir(T objeto){
       if(lista.contains(objeto)){
           lista.remove(objeto);
       }
       dao.beginTransaction();
       dao.delete(objeto);
       dao.commitTransaction();
       dao.closeTransaction();
       updateCursor();
   }   
   
   public T exibeProximo(){
       return next();
   }
   
   public T exibeAnterior(){
       return previous();
   }
   
   public T exibeUltimo(){
       return last();
   }
   
   public T exibePrimeiro(){
       return first();
   }
   
   public T exibeAtual(){
       return current();
   }
   
   public List<T> listarTudo(){
       return dao.listAll();
   }
   
   /*
    Estes métodos originalmente, fariam parte de uma outra classe, mas a sua construção estava
   sendo um pouco trabalhosa e eu estava lindando com vários problemas por causa disso. Então por ora eu resolvi colocar esses métodos aqui.
   */
   private void updateCursor(){
       if(!this.isEmpty()){
           /*
                Se o ponteiro cursor aponta para uma posição maior ou igual ao tamanho da lista, isto é, para posições não válidas e risco de cair em NullPointerException,
           este método atualiza o cursor para a ultima posição válida da lista. Usar juntamente com o método excluir.
           */
           if(cursor >= lista.size()){
                cursor = lista.size()-1;
            }
       }else{
           cursor = 0;
       }
   }
   
    private boolean hasNext() {
        if(!this.isEmpty()){
            return cursor <= lista.size()-2;
        }else{
            return false;
        }
    }
    
    private boolean hasPrevious(){
        if(!this.isEmpty()){
            return cursor > 0;
        }else{
            return false;
        }
    }

    
    private T next() {
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
    
    private T previous(){
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
    
    private T current(){
        if(!this.isEmpty()){
            return lista.get(cursor);
        }else{
            return null;
        }
    }
    
    private T first(){
        if(!this.isEmpty()){
            cursor = 0;
            return lista.get(cursor);
        }else{
            return null;
        }
    }
    
    private T last(){
        if(!this.isEmpty()){
            cursor = lista.size()-1;
            return lista.get(cursor);
        }else{
            return null;
        }
    }
    
    private boolean isEmpty(){
        return lista.isEmpty();
    }

    /*
        Acho que não é uma boa prática deixar esse método aqui, massss.......
    */
    public List<CategoriaProduto> getListaCategoriaProduto() {
        return null;
    }
    
    public List<CategoriaAcomodacao> getListaCategoriaAcomodacao() {
        return null;
    }
    
    public List<Acomodacao> getListaAcomodacao() {
        return null;
    }
    
    public List<Hospede> getListaHospede() {
        return null;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sistemahotel.Model.teste;

import java.lang.reflect.Field;
import org.sistemahotel.Model.Endereco;

/**
 *
 * @author GILIARD
 */
public class ObterInformacoesClasseDinamicamente {
           
    public static void main(String[] args) {
        
        Endereco endereco = new Endereco();
    
        Class classe = endereco.getClass();
        
        System.out.println(classe.getName()+"\n");
    
       Field[] atributos = classe.getDeclaredFields();
        
        for (int i = 0; i < atributos.length; i++) {
            System.out.println("Atributo "+atributos[i].getName());
            System.out.println(atributos[i].getType().getSimpleName()+"\n");
        }
    }
    
}

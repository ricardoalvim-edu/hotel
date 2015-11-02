/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sistemahotel.dao.HibernateUtil;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author GILIARD
 */
public class HibernateUtil {
   private static EntityManagerFactory factory = null;
   private static EntityManager manager = null;
   
   static{
       try {
           factory = Persistence.createEntityManagerFactory("SistemaHotelPU");
           manager = factory.createEntityManager();
       } catch (Exception e) {
           throw new RuntimeException("Erro na conexao com o banco da dados\n Verifique",e);
       }
   }
   
   public static EntityManager getEntityManager(){
       return manager;
   }
   
   public static void beginTransaction(){
       getEntityManager().getTransaction().begin();      
   }
   
   public static void commitTransaction(){
       getEntityManager().getTransaction().commit();
   }
   
   public static void rollbackTransaction(){
       getEntityManager().getTransaction().rollback();
   }
   
   public static void closeTransaction(){
       getEntityManager().close();
   }
}

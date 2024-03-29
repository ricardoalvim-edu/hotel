package org.sistemahotel.dao.HibernateUtil;

import org.hibernate.Session;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.SessionFactory;

/**
 * Hibernate Utility class with a convenient method to get Session Factory
 * object.
 *
 * @author GILIARD
 */
public class HibernateUtil  {

    private static final SessionFactory sessionFactory;
    private static final Session session;

    
    /*
        Blocos estáticos são inicializados somente uma vez na aplicação. 
    Por isso são usados em rotinas de inicialização do sistema.
    */
    static {
        try {
            // Create the SessionFactory from standard (hibernate.cfg.xml) 
            // config file.
            sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
            session = sessionFactory.openSession();
        } catch (Throwable ex) {
            // Log the exception. 
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }
    private static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
    
    public static Session getSession(){
        return session;
    }
    
    public static void beginTransaction(){
        getSession().beginTransaction();
    }
    
    public static void commitTransaction(){
        getSession().getTransaction().commit();
    }
    
    public static void closeSession(){
        getSession().close();
    }
    
    public static void rollbackTransaction(){
        getSessionFactory().getCurrentSession().getTransaction().rollback();
    }    
    
}

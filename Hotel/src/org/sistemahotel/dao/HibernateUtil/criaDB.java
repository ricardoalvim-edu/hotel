
package org.sistemahotel.dao.HibernateUtil;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

/**
 *
 * @author ricar
 */
public class criaDB {
    public static void main(String[] args) {
     AnnotationConfiguration configuration = new AnnotationConfiguration();
     configuration.configure();
     
     SessionFactory factory = configuration.buildSessionFactory();
     Session session = factory.openSession();
    }
}

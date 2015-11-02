/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sistemahotel.dao.implementacao;

import java.io.Serializable;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.sistemahotel.dao.HibernateUtil.HibernateUtil;
import org.sistemahotel.dao.interfaces.GenericDAO;

/**
 *
 * @author GILIARD
 */
public abstract class HibernateDAO<T, Type extends Serializable> implements GenericDAO<T, Type> {
    private final Class<T> entity;

    public HibernateDAO(Class entityPersistent) {
        super();
        this.entity = entityPersistent;
    }

    @Override
    public void beginTransaction() {
        HibernateUtil.beginTransaction();
    }

    @Override
    public void commitTransaction() {
        HibernateUtil.commitTransaction();
    }
    
    @Override
    public void closeTransaction() {
        HibernateUtil.closeTransaction();
    }
    
    @Override
    public void rollbackTransaction(){
        HibernateUtil.rollbackTransaction();
    }

    @Override
    public void save(T entity) {
        try {
           HibernateUtil.getSession().saveOrUpdate(entity);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }

    @Override
    public void delete(T entity) {
        try {
            HibernateUtil.getSession().delete(entity);
        } catch (HibernateException e) {
            e.printStackTrace();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public List<T> listAll() {
        HibernateUtil.beginTransaction();
        Criteria criteria = HibernateUtil.getSession().createCriteria(entity);
        return criteria.list();
    }

    /*
        Para entender consulte o seguinte endereço
        http://www.guj.com.br/java/232208-metodo-de-consulta-via-hibernate-resolvido    
        Acessado em 02/11/2015
    */
    @Override
    public T getById(Type id) {
        HibernateUtil.beginTransaction();
        T objeto = (T) HibernateUtil.getSession().load(entity, id);
        return objeto;
    }  
    
}

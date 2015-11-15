/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sistemahotel.dao.implementacao;

import java.io.Serializable;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.sistemahotel.dao.HibernateUtil.HibernateUtil;
import org.sistemahotel.dao.interfaces.DAO;

/**
 *
 * @author GILIARD
 */
public abstract class HibernateDAO<T, Type extends Serializable> implements DAO<T, Type> {
    private final Class<T> entity;
    private Session session;

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
        HibernateUtil.closeSession();
    }
    
    @Override
    public void rollbackTransaction(){
        HibernateUtil.rollbackTransaction();
    }

    @Override
    public void save(T entity) {
        HibernateUtil.getSession().saveOrUpdate(entity);
    }

    @Override
    public void delete(T entity) {
        HibernateUtil.getSession().delete(entity);
    }

    @Override
    public void deleteAndCommit(T entity) {
       this.beginTransaction();
       this.delete(entity);
       this.commitTransaction();
    }

    @Override
    public void saveAndCommit(T entity) {
        this.beginTransaction();
        this.save(entity);
        this.commitTransaction();
    }
    
    @Override
    public List<T> listAll() {
        this.beginTransaction();
        Criteria criteria = HibernateUtil.getSession().createCriteria(entity);
        this.commitTransaction();
        return criteria.list();
    }

    /*
        Para entender consulte o seguinte endereço
        http://www.guj.com.br/java/232208-metodo-de-consulta-via-hibernate-resolvido    
        Acessado em 02/11/2015
    */
    @Override
    public T getById(Type id) {
        this.beginTransaction();
        T objeto = (T) HibernateUtil.getSession().load(entity, id);
        this.commitTransaction();
        return objeto;
    }

    @Override
    public List<T> listPaged(int first, int amount) {
        List<T> lista = null;
        this.beginTransaction();
        lista = HibernateUtil.getSession()
                .createCriteria(entity)
                .setMaxResults(amount)
                .setFirstResult(first)
                .list();
        this.commitTransaction();
        return lista;
    }
    
    
    
    
}

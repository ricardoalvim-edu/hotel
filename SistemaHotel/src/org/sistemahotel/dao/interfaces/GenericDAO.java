/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sistemahotel.dao.interfaces;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author GILIARD
 */
public interface GenericDAO<T, Type extends Serializable> {
    void beginTransaction();
    void commitTransaction();
    void save(T entity);
    void delete(T entity);
    public List<T> listAll();
    public T getById(Type id);
}

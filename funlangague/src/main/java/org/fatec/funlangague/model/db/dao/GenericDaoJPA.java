/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.fatec.funlangague.model.db.dao;

import java.lang.reflect.ParameterizedType;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import org.fatec.funlangague.model.AbstractEntity;

/**
 *
 * @author vinicius.lima
 */
public class GenericDaoJPA<E extends AbstractEntity> implements GenericDao<E> {
    
    public static EntityManagerFactory factory = Persistence.createEntityManagerFactory("funlanguage");
    
    private String select;
    private Class<E> type;
    
    public GenericDaoJPA(){
        
        ParameterizedType pt = getParameterizedTypeClass();
        if (pt == null) {
            throw new RuntimeException("Invalid dao class. Not parameterized.");
        }
        
        type = (Class<E>) pt.getActualTypeArguments()[0];
        String className = type.getSimpleName();
        String objName = className.toLowerCase();
        select = String.format("SELECT %1$s FROM %2$s %1$s", objName, className);
        
    }
    
    private ParameterizedType getParameterizedTypeClass() {
        Class<?> clz = getClass();
        
        do{
            if (clz != null && clz.getGenericSuperclass() instanceof ParameterizedType){
                return (ParameterizedType) clz.getGenericSuperclass();
            }
            if (clz != null) {
                clz = clz.getSuperclass();
            }
        } while (clz != null);
        
        return null;
    }

    @Override
    public boolean add(E o) {
        EntityManager em = factory.createEntityManager();   
        try{
            em.getTransaction().begin();
            em.persist(o);
            em.getTransaction().commit();

            em.close();
        
        
        }catch(Exception e){
            e.printStackTrace();
        }
            return true;
    }

    @Override
    public List<E> list() {
        EntityManager em = factory.createEntityManager();
        
        TypedQuery<E> query = em.createQuery(select, type);
        return query.getResultList();
    }

    @Override
    public int remove(long id) {
        int removed = -1;
        EntityManager em = factory.createEntityManager();
        E e = em.find(type, id);
        em.getTransaction().begin();
        em.remove(e);
        em.getTransaction().commit();
        return removed;
    }
    
    @Override
    public int update(E o) {
       int updated = -1;
       EntityManager em = factory.createEntityManager();   
        try{
            //AbstractEntity e = em.find(AbstractEntity.class, e.getId());            

            em.getTransaction().begin();
            em.merge(o);
            em.getTransaction().commit();
            updated += 1;
            em.close();   
        
        }catch(Exception e){
            e.printStackTrace();
        }
        return updated;
    }

    @Override
    public E find(long id) {
        EntityManager em = factory.createEntityManager();
        TypedQuery<E> query = em.createQuery(select,type);
        query.setParameter(1, id);
        return query.getSingleResult();
    }
    
}

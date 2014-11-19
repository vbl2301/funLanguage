package org.fatec.funlangague.model.db.dao;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import org.fatec.funlangague.model.user.User;

public class UserDaoJPA extends GenericDaoJPA<User> implements UserDao{
    
    private String sLogin = "SELECT u FROM User u WHERE u.username = ?";
    
    public UserDaoJPA(){
    }

    @Override
    public User findByLogin(String login) {
        EntityManager em = factory.createEntityManager();
        TypedQuery<User> query = em.createQuery(sLogin,User.class);
        
        query.setParameter(1, login);
        return query.getSingleResult();    
    }
    
}

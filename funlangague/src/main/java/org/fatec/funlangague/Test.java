package org.fatec.funlangague;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import static org.fatec.funlangague.model.db.dao.GenericDaoJPA.factory;
import org.fatec.funlangague.model.db.dao.UserDao;
import org.fatec.funlangague.model.db.dao.UserDaoJPA;
import org.fatec.funlangague.model.user.User;
import org.hibernate.jpa.criteria.expression.UnaryArithmeticOperation.Operation;

public class Test {
    public static void main(String[] args) {
        
        /*User u = new User();
        u.setName("Vinicius Barbosa Lima");
        u.setUsername("vinicius");
        u.setPassword("123");*/
        
        //UserDao dao = new UserDaoJPA();
        
        //dao.add(u);
        
        //User u2 = dao.findByLogin("vinicius");
        
        //System.out.println(u2.getName());
        
        //usando um parâmetro posicional
        String id;
        id="vinicius";
        
        String jpql = "SELECT o FROM User o WHERE o.username = ?";
        EntityManager em = factory.createEntityManager();
        TypedQuery<User> query = em.createQuery(jpql, User.class);
        query.setParameter(1, id);
        User teste =  query.getSingleResult();
        
        System.out.println(teste.getName());
        
        factory.close();
    }
    
}

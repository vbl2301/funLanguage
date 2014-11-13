package org.fatec.funlangague;

import org.fatec.funlangague.model.db.dao.UserDao;
import org.fatec.funlangague.model.db.dao.UserDaoJPA;
import org.fatec.funlangague.model.User;

public class Test {
    public static void main(String[] args) {
        
        User u = new User();
        u.setName("Vinicius Barbosa Lima");
        u.setUsername("vinicius");
        u.setPassword("123");
        
        UserDao dao = new UserDaoJPA();
        
        dao.add(u);

    }
}

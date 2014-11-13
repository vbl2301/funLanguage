package org.fatec.funlangague.model.db.dao;

import java.util.List;
import org.fatec.funlangague.model.User;

public interface UserDao {
    
    boolean add(User user);
    
    List<User> list();
    
    User find(long id);
    
    int remove(long id);
    
    int update(User user);
    
    User findByLogin(String username);
    
}

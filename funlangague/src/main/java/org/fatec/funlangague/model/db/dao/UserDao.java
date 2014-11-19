package org.fatec.funlangague.model.db.dao;

import org.fatec.funlangague.model.user.User;

public interface UserDao extends GenericDao<User>{
    
    User findByLogin(String username);
    
}

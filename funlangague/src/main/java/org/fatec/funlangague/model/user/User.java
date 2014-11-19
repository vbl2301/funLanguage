package org.fatec.funlangague.model.user;

import org.fatec.funlangague.model.gameHistory.GameHistory;
import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import org.fatec.funlangague.model.AbstractEntity;

@Entity
public class User extends AbstractEntity implements Serializable{
    
    private String name;
    private String username;
    private String password;
    @OneToMany(orphanRemoval=true, cascade={CascadeType.ALL}, fetch=FetchType.LAZY,mappedBy="owner")
    private List<GameHistory> games;

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<GameHistory> getGames() {
        return games;
    }

    public void setGames(List<GameHistory> games) {
        this.games = games;
    }
    
}

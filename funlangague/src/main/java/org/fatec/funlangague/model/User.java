package org.fatec.funlangague.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class User implements Serializable{
    
    @Id @GeneratedValue
    private Long id;
    private String name;
    private String username;
    private String password;
    @OneToMany(orphanRemoval=true, cascade={CascadeType.ALL}, fetch=FetchType.LAZY,mappedBy="owner")
    private List<GameHistory> games;

    public User() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

package org.fatec.funlangague.model.gameHistory;

import org.fatec.funlangague.model.AbstractEntity;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import org.fatec.funlangague.model.language.Language;
import org.fatec.funlangague.model.level.Level;
import org.fatec.funlangague.model.user.User;

@Entity
public class GameHistory extends AbstractEntity implements Serializable{
    
    private int hits;
    @ManyToOne
    private User owner;
    @ManyToOne
    private Level level;
    @ManyToOne
    private Language language;
    
    public GameHistory() {
         
    }
    
    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }


    public int getHits() {
        return hits;
    }

    public void setHits(int hits) {
        this.hits = hits;
    }

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }
    
}

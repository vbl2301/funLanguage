package org.fatec.funlangague.model.word;

import org.fatec.funlangague.model.picture.Picture;
import org.fatec.funlangague.model.level.Level;
import org.fatec.funlangague.model.language.Language;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import org.fatec.funlangague.model.AbstractEntity;

@Entity
public class Word extends AbstractEntity implements Serializable {
    
    private String name;
    @ManyToOne
    private Language language;
    @ManyToOne
    private Level level;
    @ManyToOne
    private Picture picture;
    
    public Word() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }

    public Picture getPicture() {
        return picture;
    }

    public void setPicture(Picture picture) {
        this.picture = picture;
    }
    
}

package org.fatec.funlangague.model.level;

import java.io.Serializable;
import javax.persistence.Entity;
import org.fatec.funlangague.model.AbstractEntity;

@Entity
public class Level extends AbstractEntity implements Serializable {
    
    private String name;

    public Level() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}

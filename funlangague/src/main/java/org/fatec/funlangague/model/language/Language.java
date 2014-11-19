package org.fatec.funlangague.model.language;

import java.io.Serializable;
import javax.persistence.Entity;
import org.fatec.funlangague.model.AbstractEntity;

@Entity
public class Language extends AbstractEntity implements Serializable {
    
    private String name;

    public Language() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}

package org.fatec.funlangague.model.picture;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Lob;
import org.fatec.funlangague.model.AbstractEntity;

@Entity
public class Picture extends AbstractEntity implements Serializable{

    @Lob
    private byte[] image;

    public Picture() {
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }
    
}

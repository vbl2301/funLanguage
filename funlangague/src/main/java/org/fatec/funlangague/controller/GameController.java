/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.fatec.funlangague.controller;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.embed.swing.SwingFXUtils;
import javafx.fxml.Initializable;
import javax.imageio.ImageIO;

/**
 * FXML Controller class
 *
 * @author Aluno_Enfase
 */
public class GameController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    public void setImage(byte[] byteArray) throws IOException{
        ByteArrayInputStream in = new ByteArrayInputStream(byteArray);
        BufferedImage read = ImageIO.read(in);
        //imageView.setImage(SwingFXUtils.toFXImage(read, null));
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.fatec.funlangague.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.cell.PropertyValueFactory;
import org.fatec.funlangague.model.db.dao.LanguageDao;
import org.fatec.funlangague.model.db.dao.LanguageDaoJPA;
import org.fatec.funlangague.model.db.dao.LevelDao;
import org.fatec.funlangague.model.db.dao.LevelDaoJPA;
import org.fatec.funlangague.model.language.Language;
import org.fatec.funlangague.model.level.Level;

/**
 * FXML Controller class
 *
 * @author Aluno_Enfase
 */
public class MainController implements Initializable {

    @FXML
    private ChoiceBox chbLingua;
    @FXML
    private ChoiceBox chbNivel;
    @FXML
    private Button btnIniciar;
    @FXML
    private Button btnHistorico;

    private LanguageDao languageDao;
    private LevelDao levelDao;
    
    private Language language;
    private Level level;
    private ObservableList<Language> languages;
    private ObservableList<Level> levels;
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        chbLingua.setCellValueFactory(new PropertyValueFactory<>("name"));
        chbNivel.setCellValueFactory(new PropertyValueFactory<Level, String>("phone"));
        
        chbLingua.
        
        languageDao = new LanguageDaoJPA();
        levelDao = new LevelDaoJPA();
        
        updateView();
        
    }
    
    private void updateView() {
        languages = FXCollections.observableList(languageDao.list());
        chbLingua.setItems(languages);
        
        levels = FXCollections.observableList(levelDao.list());
        chbNivel.setItems(levels);
    }
        
    @FXML
    void handleBtnIniciar(){
    
    }
    
    @FXML
    void handleBtnHistorico(){
        
    }
    
    
}

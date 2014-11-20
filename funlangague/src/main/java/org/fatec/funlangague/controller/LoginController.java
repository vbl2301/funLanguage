package org.fatec.funlangague.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javax.persistence.NoResultException;
import javax.swing.JOptionPane;
import org.fatec.funlangague.model.db.dao.UserDao;
import org.fatec.funlangague.model.db.dao.UserDaoJPA;
import org.fatec.funlangague.model.user.User;

/**
 *
 * @author vinicius.lima
 */
public class LoginController implements Initializable {

    private static final String MAIN_FXML = "/View/Main.fxml";

    @FXML
    private TextField txfUsuario;
    @FXML
    private PasswordField pwfSenha;
    @FXML
    private Button btnLogar;
    @FXML
    private Button btnCancelar;

    private UserDao dao;
    private User user;

    @Override
    public void initialize(URL url, ResourceBundle rb) {

        dao = new UserDaoJPA();

    }

    @FXML
    void handleBtnCancelar(ActionEvent event) {
        close();
    }

    private void close() {
        Stage stage = (Stage) btnLogar.getScene().getWindow();
        stage.close();
    }

    @FXML
    private void handleBtnLogar(ActionEvent actionEvent) throws IOException {
        if (!pwfSenha.getText().trim().isEmpty() && !txfUsuario.getText().trim().isEmpty()) {
            try {
                user = dao.findByLogin(txfUsuario.getText());
                if (pwfSenha.getText().equals(user.getPassword())) {
                    FXMLLoader loader = new FXMLLoader(getClass().getResource(MAIN_FXML));
                    Parent root = loader.load();

                    Stage stage = new Stage();
                    stage.setScene(new Scene(root));
                    stage.show();
                    close();
                } else{
                    throw new NoResultException();
                }
            } catch (NoResultException nre) {
                JOptionPane.showMessageDialog(null, "Usuário ou senha incorretos!");
            }         
        } else {
            JOptionPane.showMessageDialog(null, "Dados inválidos.");
        }
    }

}

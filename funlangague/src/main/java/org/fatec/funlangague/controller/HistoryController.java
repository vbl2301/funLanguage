/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.fatec.funlangague.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;

/**
 * FXML Controller class
 *
 * @author Aluno_Enfase
 */
public class HistoryController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
    
    /*
    
    INICIO DA COPIA DO CODIGO DO PROFESSOR DO MAINCONTROLLER.... 
    
    private static final String USER_FXML = "/fxml/user.fxml";
    @FXML
    private TableView<User> tblUser;
    @FXML
    private TableColumn<User, String> tblColLogin;
    @FXML
    private TableColumn<User, String> tblColPhone;
    @FXML
    private TableColumn<User, String> tblColName;

    @FXML
    private Button btnDelete;
    @FXML
    private Button btnEdit;

    private UserDao dao;
    private User user;
    private ObservableList<User> users;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        tblColLogin.setCellValueFactory(new PropertyValueFactory<User, String>("login"));
        tblColPhone.setCellValueFactory(new PropertyValueFactory<User, String>("phone"));
        tblColName.setCellValueFactory(new PropertyValueFactory<User, String>("name"));

        tblUser.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
        //verifica a selecao de um usuario na lista para habilitar os botoes
        tblUser.getSelectionModel().getSelectedItems().addListener((ListChangeListener.Change<? extends User> change) -> {
            boolean selected = !change.getList().isEmpty();
            user = selected ? change.getList().get(0) : null;
            btnEdit.setDisable(!selected);
            btnDelete.setDisable(!selected);
        });

        dao = new UserDaoJDBC();

        updateView();
    }

    private void updateView() {
        users = FXCollections.observableList(dao.list());
        
        tblUser.setItems(users);
    }

    @FXML
    void handleBtnClose(ActionEvent event) {
        close();
    }

    private void close() {
        Stage stage = (Stage) btnEdit.getScene().getWindow();
        stage.close();
    }

    @FXML
    private void handleBtnEdit(ActionEvent actionEvent) throws IOException {
        //carrrega o FXML de acordo com a constante
        FXMLLoader loader = new FXMLLoader(getClass().getResource(USER_FXML));
        //adicona o painel do FXML a uma nova janela
        Parent root = loader.load();
        
        UserStageController controller = loader.getController();
        controller.setUser(user);

        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.showAndWait();

        dao.update(user);
        
        updateView();
    }

    @FXML
    private void handleBtnAdd(ActionEvent actionEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource(USER_FXML));
        Parent root = loader.load();

        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.showAndWait();

        UserStageController controller = loader.getController();
        user = controller.getUser();

        dao.add(user);

        updateView();
    }

    @FXML
    private void handleBtnDelete(ActionEvent actionEvent) {
        if (user != null && JOptionPane.showConfirmDialog(null, "Remove?") == JOptionPane.OK_OPTION) {
            dao.remove(user.getId());
            users.remove(user);
        }
    }

    @FXML
    private void handleMouseReleasedTable(MouseEvent event) throws IOException {
        if (event.getButton().equals(MouseButton.PRIMARY)
                && event.getClickCount() == 2 && user != null) {
            handleBtnEdit(null);
            event.consume();
        }
    }*/
    
}

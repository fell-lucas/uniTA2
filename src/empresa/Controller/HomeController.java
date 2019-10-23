package Empresa.Controller;

import Empresa.Main;
import Empresa.model.domain.Empresa;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.PasswordField;
import javafx.util.StringConverter;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class HomeController implements Initializable {
    //scene individual do controller, 1 ctrl = 1 view
    private static Scene scene;

    @FXML
    private PasswordField senhaEmpresa;
    @FXML
    private ComboBox<Object> empresaComboBox;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        empresaComboBox.getItems().addAll(new Object(), new Object());
        empresaComboBox.valueProperty().addListener((obs, oldval, newval) -> {
            if (newval != null)
                System.out.println(newval.getClass());
        });
    }

    /**
     * Carrega o arquivo fxml e define a scene (View)
     * @throws IOException
     */
    public static void showView() throws IOException {
        Parent root = FXMLLoader.load(HomeController.class.getResource("../View/home.fxml"));
        if(scene == null)
            scene = new Scene(root, 300, 275);
        Main.stage.setTitle("Login");
        Main.stage.setScene(scene);
    }

    //mostra o nome da empresa
    /*private void filter() {
        empresaComboBox.setConverter(new StringConverter<Empresa>() {
            @Override
            public String toString(Empresa object) {
                if (object != null)
                    return object.getNome();
                return null;
            }

            @Override
            public Empresa fromString(String string) {
                return empresaComboBox.getItems()
                        .stream()
                        .filter(e -> e.getNome().equals(string))
                        .findFirst()
                        .orElse(null);
            }
        });
    }*/

    public void handleLogin(ActionEvent actionEvent) {
        //TODO validação do usuário com o banco de dados

    }

    public void handleNewacc(ActionEvent actionEvent) throws IOException {
        //TODO criação do usuário no banco de dados
        NewEmpresaController.showView();
    }

    public void handleForgotPw(ActionEvent actionEvent) throws IOException {
        ForgotPwController.showView();
    }
}

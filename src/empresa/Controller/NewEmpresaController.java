package Empresa.Controller;

import Empresa.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class NewEmpresaController implements Initializable {
    private static Scene scene;
    public TextField nomeEmpresa;
    public PasswordField senhaEmpresa;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    public static void showView() throws IOException {
        Parent root = FXMLLoader.load(NewEmpresaController.class.getResource("../View/newEmpresa.fxml"));
        if(scene == null)
            scene = new Scene(root, 350,275);
        Main.stage.setTitle("Nova conta");
        Main.stage.setScene(scene);
    }

    public void handleSubmit(ActionEvent actionEvent) {
        //TODO enviar os dados do usuário ao banco de dados
    }

    public void handleReturn(ActionEvent actionEvent) throws IOException {
        HomeController.showView();
    }
}

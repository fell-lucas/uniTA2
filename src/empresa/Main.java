package Empresa;

import Empresa.Controller.LoginController;
import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {
    public static Stage stage = new Stage();

    @Override
    public void start(Stage primaryStage) throws Exception {
        LoginController.showView();
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

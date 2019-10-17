package Empresa;

import Empresa.View.HomeView;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("View/home.fxml"));
        Parent root = loader.load();

        HomeView homeView = loader.getController();

        primaryStage.setTitle("яблоко");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();

        homeView.setDataComboBox();
    }


    public static void main(String[] args) {
        launch(args);
    }
}

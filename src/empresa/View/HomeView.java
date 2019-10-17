package Empresa.View;

import Empresa.Controller.PessoaController;
import Empresa.Controller.ServicoController;
import Empresa.Controller.ServicoPrestadoController;
import Empresa.Model.Empresa;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.util.StringConverter;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;

public class HomeView {
    @FXML private ComboBox<Empresa> empresaComboBox;

    public void setDataComboBox() {
        empresaComboBox.getItems().addAll(
                new Empresa(0, "Empresa do Jão", new ServicoController(), new PessoaController(), new PessoaController(), new ServicoPrestadoController()),
                new Empresa(1, "Empresa de sabão", new ServicoController(), new PessoaController(), new PessoaController(), new ServicoPrestadoController())
        );
        empresaComboBox.setConverter(new StringConverter<Empresa>() {
            @Override
            public String toString(Empresa object) {
                if(object != null)
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
        empresaComboBox.valueProperty().addListener((obs, oldval, newval) -> {
            if(newval != null)
                System.out.println(newval.getNome() + ". ID: " + newval.getId());
        });
    }

    public void handleLogin(ActionEvent actionEvent) {
        
    }

    public void handleNewacc(ActionEvent actionEvent) {

    }

    public void handleForgotPw(ActionEvent actionEvent) {

    }
    public void addEventHandler(EventHandler<ActionEvent> eventHandler) {
        addButton.addEventHandler(ActionEvent.ACTION, eventHandler);
        deleteButton.addEventHandler(ActionEvent.ACTION, eventHandler);
        editButton.addEventHandler(ActionEvent.ACTION, eventHandler);
    }

    public ListView<String> getList() {
        return list;
    }

    public String getText() {
        return text.getText();
    }
}

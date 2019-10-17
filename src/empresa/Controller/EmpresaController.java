package Empresa.Controller;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import Empresa.Model.Empresa;
import Empresa.View.HomeView;

public class EmpresaController {

    public void link(Empresa model, HomeView view) {
        view.getList().setItems(model.getList());
        view.addEventHandler(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {

                switch(((Button)event.getSource()).getId()){
                    case "add":
                        model.add(view.getText());
                        break;
                    case "edit":
                        try{
                            model.edit(view.getText(), view.getList().getSelectionModel().getSelectedItem());
                        }catch(Exception exc) {/**/}
                        break;
                    case "delete":
                        model.delete(view.getList().getSelectionModel().getSelectedItem());
                        break;
                }

            }
        });
    }
}

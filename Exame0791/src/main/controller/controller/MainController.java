package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class MainController {

    @FXML
    private Button btnDetalhes;

    @FXML
    private TextField tfNumEcomenda;

    @FXML
    void detalhes(ActionEvent event) {
        int ID= Integer.parseInt(this.tfNumEcomenda.getText());
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("../view/DetalhesView.fxml"));
            Parent root = loader.load();

            ControllerDetalhes controller = loader.getController();
            controller.getID(ID);

            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.initModality(Modality.WINDOW_MODAL);
            stage.setScene(scene);
            stage.showAndWait();

        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}

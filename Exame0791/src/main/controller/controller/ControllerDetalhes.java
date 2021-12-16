package controller;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import model.MySQlConnection;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ControllerDetalhes {

    @FXML
    private TextField tfID;

    @FXML
    private TextField tfPreco;

    @FXML
    private TextField tfProduto;

    @FXML
    private TextField tfQtd;

    private MySQlConnection connection;

    public void getID(int id)
    {
        connection = new MySQlConnection();
        try{
            ResultSet result = connection.getDetalhes(id);
            while(result.next()) {
                this.tfID.setText(result.getString(1));
                this.tfProduto.setText(result.getString(2));
                this.tfPreco.setText(result.getString(3));
                this.tfQtd.setText(result.getString(4));
            }
        }catch (SQLException throwables)
        {
            throwables.printStackTrace();
        }
    }

}

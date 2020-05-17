package program;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Controller {

    public void toExchange(ActionEvent event) throws IOException {
        Parent showExchange = FXMLLoader.load(getClass().getResource("Exchange.fxml"));
        Scene showExchangeScene = new Scene(showExchange);

        //pakt stage informatie
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(showExchangeScene);
        window.show();
    }

    public void terugLogin(ActionEvent event) throws IOException {
        Parent showLogin = FXMLLoader.load(getClass().getResource("inlogScherm.fxml"));
        Scene showLoginScene = new Scene(showLogin);

        //pakt stage informatie
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(showLoginScene);
        window.show();
    }
    public void toAdress(ActionEvent event) throws IOException{
        Parent toadress = FXMLLoader.load(getClass().getResource("addressCell.fxml"));
        Scene adressScene = new Scene(toadress);

        //pakt stage informatie
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(adressScene);
        window.show();

    }

}
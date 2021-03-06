package program;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;

public class InlogSchermController {
    @FXML
    private TextField inlogUsername;

    @FXML
    private TextField inlogPassword;
    public Label wrongPasswordAlert;

    public void naLogin(ActionEvent event) throws IOException{
        String Gebruikersnaam= "Jan";
        String Wachtwoord = "123";

        if((inlogUsername.getText().equals(Gebruikersnaam))&&(inlogPassword.getText().equals(Wachtwoord))) {
            Parent showMain = FXMLLoader.load(getClass().getResource("Projext zeroXess base design.fxml"));
            Scene showMainScene = new Scene(showMain);

            //pakt stage informatie
            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
            window.setScene(showMainScene);
            window.show();

        }
        else{
            wrongPasswordAlert.setText("Wrong password or username, try again.");
        }
    }
}
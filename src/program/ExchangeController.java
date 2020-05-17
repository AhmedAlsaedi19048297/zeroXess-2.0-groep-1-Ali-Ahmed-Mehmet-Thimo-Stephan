package program;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class ExchangeController {
    public void naarBase(ActionEvent event) throws IOException {
        Parent showExchange = FXMLLoader.load(getClass().getResource("Projext zeroXess base design.fxml"));
        Scene showExchangeScene = new Scene(showExchange);

        //pakt stage informatie
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(showExchangeScene);
        window.show();
    }
}

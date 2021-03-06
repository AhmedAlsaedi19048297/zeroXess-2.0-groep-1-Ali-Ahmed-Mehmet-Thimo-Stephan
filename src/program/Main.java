package program;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("inlogScherm.fxml"));
        primaryStage.setScene(new Scene(root, 800, 600));
        primaryStage.show();



    }

    public static void main(String[] args) throws IOException {
        launch(args);
    }
}

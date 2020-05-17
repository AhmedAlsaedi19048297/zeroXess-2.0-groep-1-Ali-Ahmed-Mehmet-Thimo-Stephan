package program;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Profiel extends Stock{
    public Button editProfileButton;
    public Button saveButton;

    public TextField name;
    public TextField date;
    public TextField phone;
    public TextField email;

    public void editProfile(){
        saveButton.setVisible(true);
        editProfileButton.setVisible(false);
    }
    public void saveProfile(){
        saveButton.setVisible(false);
        editProfileButton.setVisible(true);

        try {
            BufferedWriter writerE = new BufferedWriter(new FileWriter("email.txt"));
            writerE.write(email.getText());
            writerE.close();
            BufferedWriter writerN = new BufferedWriter(new FileWriter("name.txt"));
            writerN.write(name.getText());
            writerN.close();
            BufferedWriter writerD = new BufferedWriter(new FileWriter("date.txt"));
            writerD.write(date.getText());
            writerD.close();
            BufferedWriter writerP = new BufferedWriter(new FileWriter("phone.txt"));
            writerP.write(phone.getText());
            writerP.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void loadProfile() throws IOException {

        String emailL = Files.readString(Paths.get("email.txt"), Charset.defaultCharset());
        String nameL = Files.readString(Paths.get("name.txt"), Charset.defaultCharset());
        String dateL = Files.readString(Paths.get("date.txt"), Charset.defaultCharset());
        String phoneL = Files.readString(Paths.get("phone.txt"), Charset.defaultCharset());

        name.setText(nameL);
        date.setText(dateL);
        phone.setText(phoneL);
        email.setText(emailL);
    }

}

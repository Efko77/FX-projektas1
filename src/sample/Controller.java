package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Labeled;
import javafx.scene.control.TextField;

import java.util.Random;

public class Controller {

    @FXML
    private Labeled textLabel1;

    @FXML
    private TextField textField1;

    @FXML
    private Labeled winerLabel;

    @FXML
    private Labeled numberLabel;

    @FXML
    private Button firstButon;


    public void pushMy(ActionEvent event) {
        Random random = new Random();
        int rand  = random.nextInt(10) + 1;

        int resultNumb = Integer.parseInt(textField1.getText());

        if (rand ==resultNumb) {
            winerLabel.setText("ATSPEJAI");

        }else {
            winerLabel.setText("DAR KARTA PONULI");
        }
        numberLabel.setText(String.valueOf(rand));
        textField1.setText("");
    }
}

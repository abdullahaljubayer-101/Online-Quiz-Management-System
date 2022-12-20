package com.example.onlinequizmanagementsystem;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TeacherController {

    @FXML
    private TextField ans1;

    @FXML
    private TextField ans10;

    @FXML
    private TextField ans2;

    @FXML
    private TextField ans3;

    @FXML
    private TextField ans4;

    @FXML
    private TextField ans5;

    @FXML
    private TextField ans6;

    @FXML
    private TextField ans7;

    @FXML
    private TextField ans8;

    @FXML
    private TextField ans9;

    @FXML
    private Button save;

    @FXML
    private TextArea ta1;

    @FXML
    private TextArea ta10;

    @FXML
    private TextArea ta2;

    @FXML
    private TextArea ta3;

    @FXML
    private TextArea ta4;

    @FXML
    private TextArea ta5;

    @FXML
    private TextArea ta6;

    @FXML
    private TextArea ta7;

    @FXML
    private TextArea ta8;

    @FXML
    private TextArea ta9;

    @FXML
    private TextField tf10a;

    @FXML
    private TextField tf10b;

    @FXML
    private TextField tf10c;

    @FXML
    private TextField tf10d;

    @FXML
    private TextField tf1a;

    @FXML
    private TextField tf1b;

    @FXML
    private TextField tf1c;

    @FXML
    private TextField tf1d;

    @FXML
    private TextField tf2a;

    @FXML
    private TextField tf2b;

    @FXML
    private TextField tf2c;

    @FXML
    private TextField tf2d;

    @FXML
    private TextField tf3a;

    @FXML
    private TextField tf3b;

    @FXML
    private TextField tf3c;

    @FXML
    private TextField tf3d;

    @FXML
    private TextField tf4a;

    @FXML
    private TextField tf4b;

    @FXML
    private TextField tf4c;

    @FXML
    private TextField tf4d;

    @FXML
    private TextField tf5a;

    @FXML
    private TextField tf5b;

    @FXML
    private TextField tf5c;

    @FXML
    private TextField tf5d;

    @FXML
    private TextField tf6a;

    @FXML
    private TextField tf6b;

    @FXML
    private TextField tf6c;

    @FXML
    private TextField tf6d;

    @FXML
    private TextField tf7a;

    @FXML
    private TextField tf7b;

    @FXML
    private TextField tf7c;

    @FXML
    private TextField tf7d;

    @FXML
    private TextField tf8a;

    @FXML
    private TextField tf8b;

    @FXML
    private TextField tf8c;

    @FXML
    private TextField tf8d;

    @FXML
    private TextField tf9a;

    @FXML
    private TextField tf9b;

    @FXML
    private TextField tf9c;

    @FXML
    private TextField tf9d;

    @FXML
    void saveButton(ActionEvent event) {
        try {
            BufferedWriter writer1 = new BufferedWriter(new FileWriter("question.txt"));

            writer1.write(ta1.getText() + "\n");
            ta1.setText("");
            writer1.write(tf1a.getText() + "\n");
            tf1a.setText("");
            writer1.write(tf1b.getText() + "\n");
            tf1b.setText("");
            writer1.write(tf1c.getText() + "\n");
            tf1c.setText("");
            writer1.write(tf1d.getText() + "\n");
            tf1d.setText("");

            writer1.write(ta2.getText() + "\n");
            ta2.setText("");
            writer1.write(tf2a.getText() + "\n");
            tf2a.setText("");
            writer1.write(tf2b.getText() + "\n");
            tf2b.setText("");
            writer1.write(tf2c.getText() + "\n");
            tf2c.setText("");
            writer1.write(tf2d.getText() + "\n");
            tf2d.setText("");

            writer1.write(ta3.getText() + "\n");
            ta3.setText("");
            writer1.write(tf3a.getText() + "\n");
            tf3a.setText("");
            writer1.write(tf3b.getText() + "\n");
            tf3b.setText("");
            writer1.write(tf3c.getText() + "\n");
            tf3c.setText("");
            writer1.write(tf3d.getText() + "\n");
            tf3d.setText("");

            writer1.write(ta4.getText() + "\n");
            ta4.setText("");
            writer1.write(tf4a.getText() + "\n");
            tf4a.setText("");
            writer1.write(tf4b.getText() + "\n");
            tf4b.setText("");
            writer1.write(tf4c.getText() + "\n");
            tf4c.setText("");
            writer1.write(tf4d.getText() + "\n");
            tf4d.setText("");

            writer1.write(ta5.getText() + "\n");
            ta5.setText("");
            writer1.write(tf5a.getText() + "\n");
            tf5a.setText("");
            writer1.write(tf5b.getText() + "\n");
            tf5b.setText("");
            writer1.write(tf5c.getText() + "\n");
            tf5c.setText("");
            writer1.write(tf5d.getText() + "\n");
            tf5d.setText("");

            writer1.write(ta6.getText() + "\n");
            ta6.setText("");
            writer1.write(tf6a.getText() + "\n");
            tf6a.setText("");
            writer1.write(tf6b.getText() + "\n");
            tf6b.setText("");
            writer1.write(tf6c.getText() + "\n");
            tf6c.setText("");
            writer1.write(tf6d.getText() + "\n");
            tf6d.setText("");

            writer1.write(ta7.getText() + "\n");
            ta7.setText("");
            writer1.write(tf7a.getText() + "\n");
            tf7a.setText("");
            writer1.write(tf7b.getText() + "\n");
            tf7b.setText("");
            writer1.write(tf7c.getText() + "\n");
            tf7c.setText("");
            writer1.write(tf7d.getText() + "\n");
            tf7d.setText("");

            writer1.write(ta8.getText() + "\n");
            ta8.setText("");
            writer1.write(tf8a.getText() + "\n");
            tf8a.setText("");
            writer1.write(tf8b.getText() + "\n");
            tf8b.setText("");
            writer1.write(tf8c.getText() + "\n");
            tf8c.setText("");
            writer1.write(tf8d.getText() + "\n");
            tf8d.setText("");

            writer1.write(ta9.getText() + "\n");
            ta9.setText("");
            writer1.write(tf9a.getText() + "\n");
            tf9a.setText("");
            writer1.write(tf9b.getText() + "\n");
            tf9b.setText("");
            writer1.write(tf9c.getText() + "\n");
            tf9c.setText("");
            writer1.write(tf9d.getText() + "\n");
            tf9d.setText("");

            writer1.write(ta10.getText() + "\n");
            ta10.setText("");
            writer1.write(tf10a.getText() + "\n");
            tf10a.setText("");
            writer1.write(tf10b.getText() + "\n");
            tf10b.setText("");
            writer1.write(tf10c.getText() + "\n");
            tf10c.setText("");
            writer1.write(tf10d.getText() + "\n");
            tf10d.setText("");

            writer1.close();


            BufferedWriter writer2 = new BufferedWriter(new FileWriter("answer.txt"));

            writer2.write(ans1.getText() + "\n");
            ans1.setText("");
            writer2.write(ans2.getText() + "\n");
            ans2.setText("");
            writer2.write(ans3.getText() + "\n");
            ans3.setText("");
            writer2.write(ans4.getText() + "\n");
            ans4.setText("");
            writer2.write(ans5.getText() + "\n");
            ans5.setText("");
            writer2.write(ans6.getText() + "\n");
            ans6.setText("");
            writer2.write(ans7.getText() + "\n");
            ans7.setText("");
            writer2.write(ans8.getText() + "\n");
            ans8.setText("");
            writer2.write(ans9.getText() + "\n");
            ans9.setText("");
            writer2.write(ans10.getText() + "\n");
            ans10.setText("");

            writer2.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        save.setDisable(true);
    }

}

package com.example.onlinequizmanagementsystem;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.ToggleGroup;
import javafx.scene.text.Text;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Objects;
import java.util.Timer;
import java.util.TimerTask;

public class StudentController {

    @FXML
    private ToggleGroup g1;

    @FXML
    private ToggleGroup g10;

    @FXML
    private ToggleGroup g2;

    @FXML
    private ToggleGroup g3;

    @FXML
    private ToggleGroup g4;

    @FXML
    private ToggleGroup g5;

    @FXML
    private ToggleGroup g6;

    @FXML
    private ToggleGroup g7;

    @FXML
    private ToggleGroup g8;

    @FXML
    private ToggleGroup g9;

    @FXML
    private Text time;

    @FXML
    private Text mark;

    @FXML
    private RadioButton rb10a;

    @FXML
    private RadioButton rb10b;

    @FXML
    private RadioButton rb10c;

    @FXML
    private RadioButton rb10d;

    @FXML
    private RadioButton rb1a;

    @FXML
    private RadioButton rb1b;

    @FXML
    private RadioButton rb1c;

    @FXML
    private RadioButton rb1d;

    @FXML
    private RadioButton rb2a;

    @FXML
    private RadioButton rb2b;

    @FXML
    private RadioButton rb2c;

    @FXML
    private RadioButton rb2d;

    @FXML
    private RadioButton rb3a;

    @FXML
    private RadioButton rb3b;

    @FXML
    private RadioButton rb3c;

    @FXML
    private RadioButton rb3d;

    @FXML
    private RadioButton rb4a;

    @FXML
    private RadioButton rb4b;

    @FXML
    private RadioButton rb4c;

    @FXML
    private RadioButton rb4d;

    @FXML
    private RadioButton rb5a;

    @FXML
    private RadioButton rb5b;

    @FXML
    private RadioButton rb5c;

    @FXML
    private RadioButton rb5d;

    @FXML
    private RadioButton rb6a;

    @FXML
    private RadioButton rb6b;

    @FXML
    private RadioButton rb6c;

    @FXML
    private RadioButton rb6d;

    @FXML
    private RadioButton rb7a;

    @FXML
    private RadioButton rb7b;

    @FXML
    private RadioButton rb7c;

    @FXML
    private RadioButton rb7d;

    @FXML
    private RadioButton rb8a;

    @FXML
    private RadioButton rb8b;

    @FXML
    private RadioButton rb8c;

    @FXML
    private RadioButton rb8d;

    @FXML
    private RadioButton rb9a;

    @FXML
    private RadioButton rb9b;

    @FXML
    private RadioButton rb9c;

    @FXML
    private RadioButton rb9d;

    @FXML
    private Button save;

    @FXML
    private Button start;

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

    String[] answer = new String[10];

    @FXML
    void RadioButton1(ActionEvent event) {
        if (rb1a.isSelected())
            answer[0] = "A";
        else if (rb1b.isSelected())
            answer[0] = "B";
        else if (rb1c.isSelected())
            answer[0] = "C";
        else if (rb1d.isSelected())
            answer[0] = "D";
    }

    @FXML
    void RadioButton2(ActionEvent event) {
        if (rb2a.isSelected())
            answer[1] = "A";
        else if (rb2b.isSelected())
            answer[1] = "B";
        else if (rb2c.isSelected())
            answer[1] = "C";
        else if (rb2d.isSelected())
            answer[1] = "D";
    }

    @FXML
    void RadioButton3(ActionEvent event) {
        if (rb3a.isSelected())
            answer[2] = "A";
        else if (rb3b.isSelected())
            answer[2] = "B";
        else if (rb3c.isSelected())
            answer[2] = "C";
        else if (rb3d.isSelected())
            answer[2] = "D";
    }

    @FXML
    void RadioButton4(ActionEvent event) {
        if (rb4a.isSelected())
            answer[3] = "A";
        else if (rb4b.isSelected())
            answer[3] = "B";
        else if (rb4c.isSelected())
            answer[3] = "C";
        else if (rb4d.isSelected())
            answer[3] = "D";
    }

    @FXML
    void RadioButton5(ActionEvent event) {
        if (rb5a.isSelected())
            answer[4] = "A";
        else if (rb5b.isSelected())
            answer[4] = "B";
        else if (rb5c.isSelected())
            answer[4] = "C";
        else if (rb5d.isSelected())
            answer[4] = "D";
    }

    @FXML
    void RadioButton6(ActionEvent event) {
        if (rb6a.isSelected())
            answer[5] = "A";
        else if (rb6b.isSelected())
            answer[5] = "B";
        else if (rb6c.isSelected())
            answer[5] = "C";
        else if (rb6d.isSelected())
            answer[5] = "D";
    }

    @FXML
    void RadioButton7(ActionEvent event) {
        if (rb7a.isSelected())
            answer[6] = "A";
        else if (rb7b.isSelected())
            answer[6] = "B";
        else if (rb7c.isSelected())
            answer[6] = "C";
        else if (rb7d.isSelected())
            answer[6] = "D";
    }

    @FXML
    void RadioButton8(ActionEvent event) {
        if (rb8a.isSelected())
            answer[7] = "A";
        else if (rb8b.isSelected())
            answer[7] = "B";
        else if (rb8c.isSelected())
            answer[7] = "C";
        else if (rb8d.isSelected())
            answer[7] = "D";
    }

    @FXML
    void RadioButton9(ActionEvent event) {
        if (rb9a.isSelected())
            answer[8] = "A";
        else if (rb9b.isSelected())
            answer[8] = "B";
        else if (rb9c.isSelected())
            answer[8] = "C";
        else if (rb9d.isSelected())
            answer[8] = "D";
    }

    @FXML
    void RadioButton10(ActionEvent event) {
        if (rb10a.isSelected())
            answer[9] = "A";
        else if (rb10b.isSelected())
            answer[9] = "B";
        else if (rb10c.isSelected())
            answer[9] = "C";
        else if (rb10d.isSelected())
            answer[9] = "D";
    }


    @FXML
    void startButton(ActionEvent event) throws InterruptedException {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("question.txt"));

            ta1.setText(reader.readLine());
            rb1a.setText(reader.readLine());
            rb1b.setText(reader.readLine());
            rb1c.setText(reader.readLine());
            rb1d.setText(reader.readLine());

            ta2.setText(reader.readLine());
            rb2a.setText(reader.readLine());
            rb2b.setText(reader.readLine());
            rb2c.setText(reader.readLine());
            rb2d.setText(reader.readLine());

            ta3.setText(reader.readLine());
            rb3a.setText(reader.readLine());
            rb3b.setText(reader.readLine());
            rb3c.setText(reader.readLine());
            rb3d.setText(reader.readLine());

            ta4.setText(reader.readLine());
            rb4a.setText(reader.readLine());
            rb4b.setText(reader.readLine());
            rb4c.setText(reader.readLine());
            rb4d.setText(reader.readLine());

            ta5.setText(reader.readLine());
            rb5a.setText(reader.readLine());
            rb5b.setText(reader.readLine());
            rb5c.setText(reader.readLine());
            rb5d.setText(reader.readLine());

            ta6.setText(reader.readLine());
            rb6a.setText(reader.readLine());
            rb6b.setText(reader.readLine());
            rb6c.setText(reader.readLine());
            rb6d.setText(reader.readLine());

            ta7.setText(reader.readLine());
            rb7a.setText(reader.readLine());
            rb7b.setText(reader.readLine());
            rb7c.setText(reader.readLine());
            rb7d.setText(reader.readLine());

            ta8.setText(reader.readLine());
            rb8a.setText(reader.readLine());
            rb8b.setText(reader.readLine());
            rb8c.setText(reader.readLine());
            rb8d.setText(reader.readLine());

            ta9.setText(reader.readLine());
            rb9a.setText(reader.readLine());
            rb9b.setText(reader.readLine());
            rb9c.setText(reader.readLine());
            rb9d.setText(reader.readLine());

            ta10.setText(reader.readLine());
            rb10a.setText(reader.readLine());
            rb10b.setText(reader.readLine());
            rb10c.setText(reader.readLine());
            rb10d.setText(reader.readLine());

            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Timer timer = new Timer();
        TimerTask timerTask = new TimerTask() {
            int min = 9;
            int sec = 60;
            @Override
            public void run() {
                if (sec >= 0) {
                    time.setText(min + " : " + sec);
                    sec--;
                } else if (min > 0){
                    sec = 60;
                    min--;
                } else {
                    time.setText("Time Up");
                    save.setDisable(true);
                    timer.cancel();
                }
            }
        };
        timer.scheduleAtFixedRate(timerTask, 0, 1000);
    }

    @FXML
    void saveButton(ActionEvent event) {
        int count = 0;
        try {
            BufferedReader reader = new BufferedReader(new FileReader("answer.txt"));

            for (int i = 0; i < 10; ++i) {
                if (Objects.equals(answer[i], reader.readLine()))
                    count++;
            }

            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        mark.setText("Mark: " + count + "/10");

        save.setDisable(true);
    }
}

package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller {
    private double firNum = 0;
    private double secNum = 0;
    private char operation = ' ';

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button but0;

    @FXML
    private Button but1;

    @FXML
    private Button but2;

    @FXML
    private Button but3;

    @FXML
    private Button but4;

    @FXML
    private Button but5;

    @FXML
    private Button but6;

    @FXML
    private Button but7;

    @FXML
    private Button but8;

    @FXML
    private Button but9;

    @FXML
    private Button but24;

    @FXML
    private Button but13;

    @FXML
    private Button but23;

    @FXML
    private Button but22;

    @FXML
    private Button but21;

    @FXML
    private Button but20;

    @FXML
    private Button but19;

    @FXML
    private Button but18;

    @FXML
    private Button but17;

    @FXML
    private Button but16;

    @FXML
    private Button but14;

    @FXML
    private Button but15;

    @FXML
    private Button but12;

    @FXML
    private Button but10;

    @FXML
    private Button but11;

    @FXML
    private TextField text_field;

    @FXML
    void initialize() {
        but0.setOnAction(event -> {
            String text = text_field.getText();
            text_field.setText(text += String.valueOf(0));
        });

        but1.setOnAction(event -> {
            String text = text_field.getText();
            text_field.setText(text += String.valueOf(1));
        });

        but2.setOnAction(event -> {
            String text = text_field.getText();
            text_field.setText(text += String.valueOf(2));
        });

        but3.setOnAction(event -> {
            String text = text_field.getText();
            text_field.setText(text += String.valueOf(3));
        });

        but4.setOnAction(event -> {
            String text = text_field.getText();
            text_field.setText(text += String.valueOf(4));
        });

        but5.setOnAction(event -> {
            String text = text_field.getText();
            text_field.setText(text += String.valueOf(5));
        });

        but6.setOnAction(event -> {
            String text = text_field.getText();
            text_field.setText(text += String.valueOf(6));
        });

        but7.setOnAction(event -> {
            String text = text_field.getText();
            text_field.setText(text += String.valueOf(7));
        });

        but8.setOnAction(event -> {
            String text = text_field.getText();
            text_field.setText(text += String.valueOf(8));
        });

        but9.setOnAction(event -> {
            String text = text_field.getText();
            text_field.setText(text += String.valueOf(9));
        });

        but10.setOnAction(event -> {
            String text = text_field.getText();
            if (text.contains("."))
                text_field.setText(String.valueOf(Double.parseDouble(text) * -1));
            else text_field.setText(String.valueOf(Long.parseLong(text) * -1));
        });

        but11.setOnAction(event -> {
            String text = text_field.getText();
            text_field.setText(String.valueOf(1.0 / Double.parseDouble(text)));
        });

        but12.setOnAction(event -> {
            String text = text_field.getText();
            if (text.contains(".")) {
                double textDouble = Double.parseDouble(text);
                text_field.setText(String.valueOf(Math.pow(textDouble, 3)));
            } else {
                long textInt = Long.parseLong(text);
                text_field.setText(String.valueOf(((long) ((Math.pow(textInt, 3))))));
            }
        });

        but13.setOnAction(event -> {
            String text = text_field.getText();
            if (text.contains(".")) {
                double textDouble = Double.parseDouble(text);
                text_field.setText(String.valueOf(Math.pow(textDouble, 2)));
            } else {
                long textInt = Long.parseLong(text);
                text_field.setText(String.valueOf(((long) ((Math.pow(textInt, 2))))));
            }
        });

        but14.setOnAction(event -> {
            String text = text_field.getText();
            double textDouble = Double.parseDouble(text);
            text_field.setText(String.valueOf(Math.sqrt(textDouble)));
        });

        but15.setOnAction(event -> {
            String text = text_field.getText();
            double textDouble = Double.parseDouble(text);
            text_field.setText(String.valueOf(textDouble / 100));
        });

        //TODO 16
        but16.setOnAction(event -> {
            firNum = 0;
            secNum = 0;
            operation = ' ';
            text_field.clear();
        });

        but17.setOnAction(event -> {
            firNum = 0;
            secNum = 0;
            operation = ' ';
            text_field.clear();
        });


        but18.setOnAction(event -> {
            String text = text_field.getText();
            if (text.length() > 0)
                text_field.setText(text.substring(0, text.length() - 1));
        });

        but19.setOnAction(event -> {
            operation = '/';
            String text = text_field.getText();
            if (text.contains("."))
                firNum = Double.parseDouble(text);
            else firNum = Long.parseLong(text);

            text_field.setText("");
        });

        but20.setOnAction(event -> {
            operation = '*';
            String text = text_field.getText();
            if (text.contains("."))
                firNum = Double.parseDouble(text);
            else firNum = Long.parseLong(text);

            text_field.setText("");
        });

        but21.setOnAction(event -> {
            operation = '-';
            String text = text_field.getText();
            if (text.contains("."))
                firNum = Double.parseDouble(text);
            else firNum = Long.parseLong(text);

            text_field.setText("");
        });

        but22.setOnAction(event -> {
            operation = '+';
            String text = text_field.getText();
            if (text.contains("."))
                firNum = Double.parseDouble(text);
            else firNum = Long.parseLong(text);

            text_field.setText("");
        });

        but23.setOnAction(event -> {
            String text = text_field.getText();
            if (text.contains("."))
                secNum = Double.parseDouble(text);
            else secNum = Long.parseLong(text);

            if(operation != ' ')
            text_field.setText(String.valueOf(doOperation(firNum, secNum, operation)));
        });

        but24.setOnAction(event -> {
            String text = text_field.getText();
            if (!text.contains(".") && text.length() > 0) {
                text_field.setText(text + ".");
            }
        });
    }

    private double doOperation(double firNum, double secNum, char operation) {
        switch (operation) {
            case '/':
                return firNum / secNum;

            case '*':
                return firNum * secNum;
            case '-':
                return firNum - secNum;
            case '+':
                return firNum + secNum;
        }

        return 0;
    }
}

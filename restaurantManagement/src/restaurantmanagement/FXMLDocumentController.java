/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package restaurantmanagement;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.transform.Translate;
import javafx.util.Duration;

/**
 *
 * @author ACER
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private Button createAcc;

    @FXML
    private Hyperlink forgot;

    @FXML
    private Button loginBtn;

    @FXML
    private AnchorPane loginForm;

    @FXML
    private TextField password;

    @FXML
    private AnchorPane side_form;

    @FXML
    private Button signupBtn;

    @FXML
    private AnchorPane signupForm;

    @FXML
    private TextField su_answer;

    @FXML
    private TextField su_password;

    @FXML
    private ComboBox<?> su_question;

    @FXML
    private TextField su_username;

    @FXML
    private TextField username;

    @FXML
    private Button alreadyHave;

    public void switchForm(ActionEvent event) {
        TranslateTransition slider = new TranslateTransition();

        if (event.getSource() == createAcc) {
            slider.setNode(side_form);
            slider.setToX(300);
            slider.setDuration(Duration.seconds(.5));
            slider.setOnFinished((ActionEvent e) -> {
                alreadyHave.setVisible(true);
                createAcc.setVisible(false);
            });
            slider.play();
        } else if (event.getSource() == alreadyHave) {
            slider.setNode(side_form);
            slider.setToX(0);
            slider.setDuration(Duration.seconds(.5));
            slider.setOnFinished((ActionEvent e) -> {
                alreadyHave.setVisible(false);
                createAcc.setVisible(true);
            });
            slider.play();

        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
}

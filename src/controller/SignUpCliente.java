package controller;

import application.Client;
import application.UserFileHandler;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class SignUpCliente {
	
	@FXML
    private TextField firstId;

    @FXML
    private TextField secondId;

    @FXML
    private TextField userID;

    @FXML
    private TextField passwordId;

    @FXML
    private TextField directioId;

    @FXML
    private TextField emailId;

    @FXML
    private TextField confirmPasswordId;
    
    @FXML
    private TextField phoneId;
    
    @FXML
    private Button botonSignUp;

    @FXML
    void saveProfile(ActionEvent event) {
    	
    	String first = firstId.getText();
    	String second = secondId.getText();
    	String user = userID.getText();
    	String password = passwordId.getText();
    	String direction = directioId.getText();
    	String email = emailId.getText();
    	int number = Integer.parseInt(phoneId.getText());
    	
    	Client c = new Client(first, second, user, password, email,number, direction);
    	UserFileHandler.writeToFile("./logi.txt", c);

    }

}

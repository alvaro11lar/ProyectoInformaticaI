package controller;

import application.Client;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class HomepageClienteController {

    @FXML
    private Button buttonPurchaseHistory;

    @FXML
    private Button buttonReturnProduct;

    @FXML
    private Button buttonTechSupport;

    @FXML
    private Button buttonCard;

    @FXML
    private Button buttonCash;

    @FXML
    private Button buttonPay;
    
    @FXML
    private Label user;

    @FXML
    private Label firstName;

    @FXML
    private Label SecondName;

    @FXML
    private Label phoneNumber;

    @FXML
    private Label emailId;

    @FXML
    private Label DirerctionId;
    
    private Client c;

    @FXML
    void showProfile(ActionEvent event) {

		user.setText(c.getUsername());
		firstName.setText(c.getFirstName());
		SecondName.setText(c.getSecondsName());
		phoneNumber.setText(String.valueOf(c.getNumero()));
		emailId.setText(c.getEmail());
		DirerctionId.setText(c.getDirection());
    }

	public Client getC() {
		return c;
	}

	public void setC(Client c) {
		this.c = c;
	}
    
    


	
}

package controller;

import java.awt.image.DirectColorModel;
import java.net.URL;
import java.util.ResourceBundle;

import application.Client;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class HomepageClienteController {

	@FXML
	private ResourceBundle resources;

	@FXML
	private URL location;

	@FXML
	private Button buttonPurchaseHistory;

	@FXML
	private Button buttonId;

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
	private TextField user;

	@FXML
	private TextField firstName;

	@FXML
	private TextField SecondName;

	@FXML
	private TextField phoneNumber;

	@FXML
	private TextField emailId;

	@FXML
	private TextField DirerctionId;

	@FXML
	void showProfile(ActionEvent event) {
		Client c = new Client("a","b","c","d","f",11, "d");
		user.setText(c.getUsername());
		firstName.setText(c.getFirstName());
		SecondName.setText(c.getSecondsName());
		phoneNumber.setText(String.valueOf(c.getNumero()));
		emailId.setText(c.getEmail());
		DirerctionId.setText(c.getDirection());
	}

	@FXML
	void initialize() {
		assert buttonPurchaseHistory != null : "fx:id=\"buttonPurchaseHistory\" was not injected: check your FXML file 'HomepageCliente.fxml'.";
		assert buttonId != null : "fx:id=\"buttonId\" was not injected: check your FXML file 'HomepageCliente.fxml'.";
		assert buttonReturnProduct != null : "fx:id=\"buttonReturnProduct\" was not injected: check your FXML file 'HomepageCliente.fxml'.";
		assert buttonTechSupport != null : "fx:id=\"buttonTechSupport\" was not injected: check your FXML file 'HomepageCliente.fxml'.";
		assert buttonCard != null : "fx:id=\"buttonCard\" was not injected: check your FXML file 'HomepageCliente.fxml'.";
		assert buttonCash != null : "fx:id=\"buttonCash\" was not injected: check your FXML file 'HomepageCliente.fxml'.";
		assert buttonPay != null : "fx:id=\"buttonPay\" was not injected: check your FXML file 'HomepageCliente.fxml'.";

	}

}

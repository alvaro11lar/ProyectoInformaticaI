package controller;

import application.Client;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;

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
    
    @FXML
    private ImageView image1;

    @FXML
    private ImageView image2;

    @FXML
    private ImageView image3;

    @FXML
    private ImageView image4;

    @FXML
    private ImageView image5;

    @FXML
    private ImageView image6;

    @FXML
    private ImageView image9;

    @FXML
    private ImageView image8;

    @FXML
    private ImageView image7;
    
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

	public ImageView getImage1() {
		return image1;
	}

	public void setImage1(ImageView image1) {
		this.image1 = image1;
	}

	public ImageView getImage2() {
		return image2;
	}

	public void setImage2(ImageView image2) {
		this.image2 = image2;
	}

	public ImageView getImage3() {
		return image3;
	}

	public void setImage3(ImageView image3) {
		this.image3 = image3;
	}

	public ImageView getImage4() {
		return image4;
	}

	public void setImage4(ImageView image4) {
		this.image4 = image4;
	}

	public ImageView getImage5() {
		return image5;
	}

	public void setImage5(ImageView image5) {
		this.image5 = image5;
	}

	public ImageView getImage6() {
		return image6;
	}

	public void setImage6(ImageView image6) {
		this.image6 = image6;
	}

	public ImageView getImage9() {
		return image9;
	}

	public void setImage9(ImageView image9) {
		this.image9 = image9;
	}

	public ImageView getImage8() {
		return image8;
	}

	public void setImage8(ImageView image8) {
		this.image8 = image8;
	}

	public ImageView getImage7() {
		return image7;
	}

	public void setImage7(ImageView image7) {
		this.image7 = image7;
	}
    
    


	
}

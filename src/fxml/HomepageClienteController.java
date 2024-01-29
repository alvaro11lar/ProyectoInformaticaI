package fxml;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class HomepageClienteController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

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
    void initialize() {
        assert buttonPurchaseHistory != null : "fx:id=\"buttonPurchaseHistory\" was not injected: check your FXML file 'HomepageCliente.fxml'.";
        assert buttonReturnProduct != null : "fx:id=\"buttonReturnProduct\" was not injected: check your FXML file 'HomepageCliente.fxml'.";
        assert buttonTechSupport != null : "fx:id=\"buttonTechSupport\" was not injected: check your FXML file 'HomepageCliente.fxml'.";
        assert buttonCard != null : "fx:id=\"buttonCard\" was not injected: check your FXML file 'HomepageCliente.fxml'.";
        assert buttonCash != null : "fx:id=\"buttonCash\" was not injected: check your FXML file 'HomepageCliente.fxml'.";
        assert buttonPay != null : "fx:id=\"buttonPay\" was not injected: check your FXML file 'HomepageCliente.fxml'.";

    }
}

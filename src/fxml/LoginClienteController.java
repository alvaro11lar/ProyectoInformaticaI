package fxml;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class LoginClienteController {

    @FXML
    private Button buttonLogin;

    @FXML
    private Button buttonSignup;

    @FXML
    private TextField userTest;

    @FXML
    private PasswordField passTest;

    @FXML
    private Hyperlink forgotPasswordLink;

    @FXML
    void mostrarHomepagecliente(ActionEvent event) {

    	try {
			FXMLLoader loader2 = new FXMLLoader(getClass().getResource("/fxml/HomepageCliente.fxml"));
			
			HomepageClienteController control2 = new HomepageClienteController();
			
			loader2.setController(control2);
			
			Parent root2 = loader2.load();			
			Stage stage = new Stage();
			
			stage.setScene(new Scene(root2));
			stage.initModality(Modality.WINDOW_MODAL);
			stage.initOwner(((Node)(event.getSource())).getScene().getWindow());
			stage.show();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
    }

}
package controller;


import java.util.List;

import application.Client;
import application.FileUtilAlmacen;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
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

	FileUtilAlmacen fu = new FileUtilAlmacen();

	@FXML
	void mostrarHomepagecliente(ActionEvent event) {

		System.out.println(userTest.getText());
		System.out.println(passTest.getText());

		List<Client> clientes = fu.leer();

			System.out.println(clientes.size());
	
		for(Client c : clientes) {
			if(c.getUsername().equals(userTest.getText()) & c.getPassword().equals(passTest.getText())) {
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
			}else {
			     Alert alert = new Alert(Alert.AlertType.INFORMATION);
			        alert.setTitle("Mensaje de Alerta");
			        alert.setHeaderText(null);
			        alert.setContentText("Este es un mensaje de alerta.");

			        // Mostrar y esperar
			        alert.showAndWait();
			        break;
			   

			}
		}
	}




	@FXML
	void mostrarSignupCliente(ActionEvent event) {

		try {
			FXMLLoader loader3 = new FXMLLoader(getClass().getResource("/fxml/SignupCliente.fxml"));

			SignupClienteController control3 = new SignupClienteController();

			loader3.setController(control3);

			Parent root3 = loader3.load();			
			Stage stage = new Stage();

			stage.setScene(new Scene(root3));
			stage.initModality(Modality.WINDOW_MODAL);
			stage.initOwner(((Node)(event.getSource())).getScene().getWindow());
			stage.show();

		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
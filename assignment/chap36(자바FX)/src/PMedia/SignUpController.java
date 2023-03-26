package PMedia;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class SignUpController implements Initializable {

	// SignUp Button
	@FXML
	private Button btnSignUp;
	@FXML
	private Button btnSignUpCancle;

	// SignUp TextField
	@FXML
	private TextField idField;
	@FXML
	private TextField passwordField;
	@FXML
	private TextField nicnameField;
	@FXML
	private TextField addressField;

	@Override
	public void initialize(URL location, ResourceBundle resources) {

	}

	public void handleSignup(ActionEvent event) {
		System.out.println("아이디 : " + idField.getText());
		System.out.println("별명 : " + nicnameField.getText());
		System.out.println("비밀번호 : " + passwordField.getText());
		System.out.println("이메일 : " + addressField.getText());
	}

}

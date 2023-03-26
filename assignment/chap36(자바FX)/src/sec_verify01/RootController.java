package sec_verify01;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.binding.Bindings;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Circle;

public class RootController implements Initializable {

	@FXML private TextArea result;
	
	@FXML private Button k1; //´Ü¼ÒÃÑ
	@FXML private Button k2; //¼ÒÃÑ
	@FXML private Button k3;
	@FXML private Button k4;
	@FXML private Button k5; //±ÇÃÑ
	@FXML private Button k6;//12.7mm
	@FXML private Button k7; //À¯Åº¹ß»ç±â
	@FXML private Button k8;
	@FXML private Button k9; //ÀÚÁÖÆ÷ //±â°üÃÑ
	
	@FXML private Button ks;
	@FXML private Button kt;
	@FXML private Button km;
	@FXML private Button kp;
	
	
	
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		

	}
	public void pressNumber() {
		result.setText(k1.getText());
	}
	
}

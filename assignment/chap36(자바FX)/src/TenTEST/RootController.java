package TenTEST;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
 
public class RootController implements Initializable {
	
	static String number2 = "";
	static String number8 = "";
	static String number10 = "";
	static String number16 = "";

	@FXML 
	Button textClear;	
	@FXML
	TextField tenF;
	@FXML
	TextField twoF;
	@FXML
	TextField eigF;
	@FXML
	TextField sixF;
	
	public void btntextClear(ActionEvent event) {
		tenF.clear();
		twoF.clear();
		eigF.clear();
		sixF.clear();
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {

		tenF.textProperty().addListener(new ChangeListener<String>() {
			@Override
			public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
				number2 = Integer.toBinaryString(Integer.parseInt(newValue));
				//twoF.setEditable(false); // 텍스트 필드에 입력할수 없게 만든다
				twoF.setText(number2);
				number8 = Integer.toOctalString(Integer.parseInt(newValue));
				eigF.setText(number8);
				number16 = Integer.toHexString(Integer.parseInt(newValue));
				sixF.setText(number16);
			}	
		});
		
		twoF.textProperty().addListener(new ChangeListener<String>() {

			@Override
			public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
				
				number10 = Integer.parseInt(newValue,2)+"";
				tenF.setText(number10);				
				number8 = Integer.toOctalString(Integer.parseInt(newValue,2));
				eigF.setText(number8);
				number16 = Integer.toHexString(Integer.parseInt(newValue,2));
				sixF.setText(number16);
			}		
		});
		eigF.textProperty().addListener(new ChangeListener<String>() {

			@Override
			public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
			
				number10 = Integer.parseInt(newValue,8)+"";
				tenF.setText(number10);
				number2 = Integer.toBinaryString(Integer.parseInt(newValue,8));
				twoF.setText(number2);
				number16 = Integer.toHexString(Integer.parseInt(newValue,8));
				sixF.setText(number16);	
			}			
		});
		
		sixF.textProperty().addListener(new ChangeListener<String>() {
			@Override
			public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
				
				number10 = Integer.parseInt(newValue,16)+"";
				tenF.setText(number10);
				number2 = Integer.toBinaryString(Integer.parseInt(newValue,16));
				twoF.setText(number2);
				number8 = Integer.toOctalString(Integer.parseInt(newValue,16));
				eigF.setText(number8);
			}
		});

	}

}

package sec_verify02;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.binding.Bindings;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.StringProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.util.converter.IntegerStringConverter;
import javafx.util.converter.NumberStringConverter;

public class RootController implements Initializable {

	@FXML
	private TextField Ta101;
	@FXML
	private TextField Ta21;
	@FXML
	private TextField Ta102;
	@FXML
	private TextField Ta81;
	@FXML
	private TextField Ta103;
	@FXML
	private TextField Ta161;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		//ChangeListener »ç¿ë
			Ta101.textProperty().addListener(new ChangeListener<String>() {
				@Override
				public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
					String no = "";
					no = Integer.toBinaryString(Integer.parseInt(newValue));
					Ta21.setText(no);
					
				}
			});
			
			
			
			
		


	}
}

package sec_verify03;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.binding.Bindings;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Circle;

public class RootController implements Initializable {

	@FXML
	AnchorPane ap;
	@FXML
	Circle cc;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		cc.centerXProperty().bind(Bindings.divide(ap.widthProperty(),2));
		cc.centerYProperty().bind(Bindings.divide(ap.heightProperty(),2));
		
		ap.widthProperty().addListener(new ChangeListener<Number>() {
			@Override
			public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
				double x = newValue.doubleValue()/2.0;
				System.out.println("xÁÂÇ¥ - "+x);			
			}
		});
		
		ap.heightProperty().addListener(new ChangeListener<Number>() {
			@Override
			public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
				double y = newValue.doubleValue()/2.0;
				System.out.println("yÁÂÇ¥ - "+y);			
			}
		});
		
		cc.centerXProperty().addListener(new ChangeListener<Number>() {
			@Override
			public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
				double x = newValue.doubleValue();
				System.out.println("¿øÀÇ"+x);
				
			}
		});

	}
}

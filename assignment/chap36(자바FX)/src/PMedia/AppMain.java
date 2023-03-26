package PMedia;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AppMain extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {

		FXMLLoader loader = new FXMLLoader(getClass().getResource("MediaRoot.fxml"));
		Parent root = loader.load();
		MediaController rootController = loader.getController();
		rootController.setPrimaryStage(primaryStage);

		Scene scene = new Scene(root);
		primaryStage.setScene(scene);
		primaryStage.setTitle("AppMain");
		primaryStage.show();

	}

	public static void main(String[] args) {
		Application.launch(args);
	}
}

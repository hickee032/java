package sec_verify01;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AppMain extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		Parent parent = FXMLLoader.load(getClass().getResource("root.fxml"));
		Scene scene = new Scene(parent);

		/*
		 * 아래와 같이 primaryStage의 크기 즉 윈도우의 크기를 미리 설정해놓고 fxml파일의 루트 컨테이너의 크기를 설정해 봐야 윈도우창의
		 * 크기가 미리 정해져 있기 떄문에 의미가 없어진다. 사용자는 윈도우 창을 기준으로 크기를 설정할것인지 아니면 루트 컨테이너를 기준으로
		 * fxml파일에서 크기를 설정 할것인지 정해서 코딩하는 게 바람직하다.
		 */

		// primaryStage.setWidth(500);
		// primaryStage.setHeight(400);
		primaryStage.setScene(scene);
	
		primaryStage.show();
	}

	public static void main(String[] args) {
		Application.launch(args);

	}

}

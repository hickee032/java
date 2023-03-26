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
		 * �Ʒ��� ���� primaryStage�� ũ�� �� �������� ũ�⸦ �̸� �����س��� fxml������ ��Ʈ �����̳��� ũ�⸦ ������ ���� ������â��
		 * ũ�Ⱑ �̸� ������ �ֱ� ������ �ǹ̰� ��������. ����ڴ� ������ â�� �������� ũ�⸦ �����Ұ����� �ƴϸ� ��Ʈ �����̳ʸ� ��������
		 * fxml���Ͽ��� ũ�⸦ ���� �Ұ����� ���ؼ� �ڵ��ϴ� �� �ٶ����ϴ�.
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

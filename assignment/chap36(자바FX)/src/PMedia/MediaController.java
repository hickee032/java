package PMedia;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Slider;
import javafx.scene.image.ImageView;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Duration;

public class MediaController implements Initializable {

	private MediaPlayer mediaPlayer;

	private Stage primaryStage;
	private boolean endOfMedia;
	private boolean login;

	// 툴바 버튼
	@FXML
	private Button btnOpen;
	@FXML
	private Button btnSave;
	@FXML
	private Button btnEdit;
	@FXML
	private Button btnHelp;

	// 미디어&이미지 뷰
	@FXML
	private MediaView mediaView;
	@FXML
	private ImageView imageView;

	// 플레이버튼
	@FXML
	private Button btnPrivious;
	@FXML
	private Button btnPause;
	@FXML
	private Button btnPlay;
	@FXML
	private Button btnStop;
	@FXML
	private Button btnNext;

	// 슬라이더
	@FXML
	private Slider sliderMedia;
	@FXML
	private Slider sliderVolume;
	@FXML
	private Slider sliderSpeed;

	@Override
	public void initialize(URL location, ResourceBundle resources) {

	}

	// primaryStage setter
	public void setPrimaryStage(Stage primaryStage) {
		this.primaryStage = primaryStage;
	}

	// ToolBar Button Event
	public void handleOpen(ActionEvent event) {
		FileChooser fileChooser = new FileChooser();
		fileChooser.getExtensionFilters().addAll(new ExtensionFilter("Media Files(*.avi,*.mp4)", "*.avi", "*.mp4"),
				new ExtensionFilter("ALL Files(*.*)", "*.*"));
		File selectedFile = fileChooser.showOpenDialog(primaryStage);
		if (selectedFile != null) {
			System.out.println("선택된 파일의 경로 : " + selectedFile.getPath());

			Media media = new Media(selectedFile.toURI().toString());
			mediaPlayer = new MediaPlayer(media);
			mediaView.setMediaPlayer(mediaPlayer);

		}
		mediaPlayer.setOnReady(() -> {
			btnPlay.setDisable(false); // 재생버튼
			btnPause.setDisable(true); // 일시정지
			btnStop.setDisable(true); // 중지

			// 슬라이더 설정
			sliderMedia.setMin(0.0);
			sliderMedia.setValue(0.0);
			sliderMedia.setMax(mediaPlayer.getTotalDuration().toSeconds());

			mediaPlayer.currentTimeProperty().addListener(new ChangeListener<Duration>() {
				@Override
				public void changed(ObservableValue<? extends Duration> observable, Duration oldValue,
						Duration newValue) {
					sliderMedia.setValue(mediaPlayer.getCurrentTime().toSeconds());

				}

			});

			sliderMedia.valueProperty().addListener(new ChangeListener<Number>() {

				@Override
				public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
					sliderMedia.setValueChanging(true);

					if (sliderMedia.isPressed()) {
						mediaPlayer.seek(Duration.seconds(sliderMedia.getValue()));
					}
				}
			});

			sliderVolume.valueProperty().addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
					mediaPlayer.setVolume(sliderVolume.getValue() / 100.0);
				}
			});
			sliderVolume.setValue(50.0);

			sliderSpeed.valueProperty().addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
					mediaPlayer.setRate(sliderSpeed.getValue());
				}
			});

		});

		mediaPlayer.setOnPlaying(() -> {
			btnPlay.setDisable(true);
			btnPause.setDisable(false);
			btnStop.setDisable(false);
		});

		mediaPlayer.setOnPaused(() -> {
			btnPlay.setDisable(false);
			btnPause.setDisable(true);
			btnStop.setDisable(false);
		});

		mediaPlayer.setOnStopped(() -> {
			btnPlay.setDisable(false);
			btnPause.setDisable(true);
			btnStop.setDisable(true);
		});

		// EndOfMedia
		mediaPlayer.setOnEndOfMedia(() -> {
			btnPlay.setDisable(false);
			btnPause.setDisable(true);
			btnStop.setDisable(true);
			endOfMedia = true;

		});
	}

	public void handleExit(ActionEvent event) {
		System.exit(0);
	}

	// SignUp Button
	public void handleSignUp(ActionEvent event) throws IOException {

		Stage SignUpDialog = new Stage(StageStyle.UNIFIED);

		SignUpDialog.initModality(Modality.WINDOW_MODAL);

		SignUpDialog.initOwner(primaryStage);

		SignUpDialog.setTitle("회원가입");

		Parent parent = FXMLLoader.load(getClass().getResource("SignUpDialog.fxml"));

		Scene scene = new Scene(parent);

		SignUpDialog.setScene(scene);

		SignUpDialog.setResizable(false);

		SignUpDialog.show();

	}

	@FXML
	public void priviousVideo(ActionEvent event) {

	}

	@FXML
	public void pauseVideo(ActionEvent event) {
		mediaPlayer.pause();
	}

	@FXML
	public void playVideo(ActionEvent event) {
		if (endOfMedia) {
			mediaPlayer.stop();
			mediaPlayer.seek(mediaPlayer.getStartTime());
			endOfMedia = false;
		}
		mediaPlayer.play();
	}

	@FXML
	public void stopVideo(ActionEvent event) {
		mediaPlayer.stop();
	}

	@FXML
	public void nextVideo(ActionEvent event) {

	}

	public void handlebtnOk(ActionEvent event) {

	}

}
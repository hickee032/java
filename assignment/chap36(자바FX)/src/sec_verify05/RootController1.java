package sec_verify05;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.Slider;
import javafx.scene.image.ImageView;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;
import javafx.util.Duration;

public class RootController1 implements Initializable {

	@FXML
	private MediaView mediaView;
	@FXML
	private ImageView imageView;
	@FXML
	private Button btnPlay;
	@FXML
	private Button btnPause;
	@FXML
	private Button btnStop;
	@FXML
	private Button btnOpen;

	@FXML
	private Slider sliderVolum;
	@FXML
	private Slider sliderRate;
	@FXML
	private Slider sliderMedia;

	@FXML
	private ProgressBar progressBar;

	// endOfMedia flag
	private boolean endOfMedia;

	MediaPlayer mediaPlayer = null;
	Media media = null;

	public void fileChoose() {

		FileChooser fc = new FileChooser();

		fc.getExtensionFilters().addAll(new ExtensionFilter("All Files", "*.*"));

		File fileSelect = fc.showOpenDialog(null);
		String selectedFilePath = fileSelect.getPath();

		// 확인
		System.out.println(selectedFilePath);

		Media media = new Media(selectedFilePath);
		MediaPlayer mediaPlayer = new MediaPlayer(media);
		mediaView.setMediaPlayer(mediaPlayer);

		btnActivation();

	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {

		fileChoose();

//		Media media = new Media(getClass().getResource("media/twice.mp4").toString());
//		MediaPlayer mediaPlayer = new MediaPlayer(media);
//		mediaView.setMediaPlayer(mediaPlayer);

		btnActivation();

		btnPause.setOnAction(event -> {
			mediaPlayer.pause();
		});
		btnStop.setOnAction(event -> {
			mediaPlayer.stop();
		});
		btnOpen.setOnAction(event -> {
			fileChoose();
			btnActivation();

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

		sliderVolum.valueProperty().addListener(new ChangeListener<Number>() {
			@Override
			public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
				// mediaPlayer.setVolume(newValue.doubleValue()/100.0);
				mediaPlayer.setVolume(sliderVolum.getValue() / 100.0);
			}
		});
		sliderVolum.setValue(50.0);

		sliderRate.valueProperty().addListener(new ChangeListener<Number>() {
			@Override
			public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
				mediaPlayer.setRate(sliderRate.getValue());
			}
		});
	}

	public void btnActivation() {

		mediaPlayer.setOnReady(() -> {
			// false활성화 true비활성화
			btnPlay.setDisable(false);
			btnPause.setDisable(true);
			btnStop.setDisable(true);

			sliderMedia.setMin(0.0);
			sliderMedia.setValue(0.0);
			sliderMedia.setMax(mediaPlayer.getTotalDuration().toSeconds());

			mediaPlayer.currentTimeProperty().addListener(new ChangeListener<Duration>() {
				@Override
				public void changed(ObservableValue<? extends Duration> observable, Duration oldValue,
						Duration newValue) {
					double progress = mediaPlayer.getCurrentTime().toSeconds()
							/ mediaPlayer.getTotalDuration().toSeconds();
					System.out.println(progress);

					progressBar.setProgress(progress);

					sliderMedia.setValue(mediaPlayer.getCurrentTime().toSeconds());

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
			btnStop.setDisable(true);
		});

		mediaPlayer.setOnStopped(() -> {
			btnPlay.setDisable(false);
			btnPause.setDisable(true);
			btnStop.setDisable(true);
		});

		mediaPlayer.setOnEndOfMedia(() -> {
			btnPlay.setDisable(false);
			btnPause.setDisable(true);
			btnStop.setDisable(true);
			endOfMedia = true;

			progressBar.setProgress(1.0);

		});

		btnPlay.setOnAction(event -> {
			if (endOfMedia) {
				mediaPlayer.stop();
				mediaPlayer.seek(mediaPlayer.getStartTime());
				endOfMedia = false;
			}
			mediaPlayer.play();
		});

	}

}

package sec_verify04;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class RootController implements Initializable {

	String fName = null;
	String sName = null;

	@FXML
	private TableView<Pizza> tableView;
	@FXML
	private ImageView imageView;
	@FXML
	private ComboBox<String> comBo;
	private ObservableList<String> comlist = FXCollections.observableArrayList("없음", "오징어링", "리조또", "스파게티", "쇼콜라");

//	private ObservableList<SideMenu> comlist = FXCollections.observableArrayList(
//			new SideMenu("오징어링","3000"),
//			new SideMenu("리조또","7000"),
//			new SideMenu("스파게티","8000"),
//			new SideMenu("쇼콜라","5000")
//			);
	@FXML
	private TextField moneyT;
	@FXML
	private TextField addText;
	@FXML
	private CheckBox cheB;
	@FXML
	private Button btnSumit;

	@Override
	public void initialize(URL location, ResourceBundle resources) {

		comBo.setItems(comlist);

		ObservableList<Pizza> pizzaList = FXCollections.observableArrayList(new Pizza("문어밤 슈림프", "34900", "OCT.jpg"),
				new Pizza("이베리코", "34900", "IBE.jpg"), new Pizza("베스트 콰트로", "34900", "BEST.jpg"),
				new Pizza("블랙앵거스", "34900", "STAKE.jpg"), new Pizza("블랙타이거", "33900", "TIGER.jpg"),
				new Pizza("글램핑 바비큐", "33900", "BBQ.jpg"), new Pizza("와규 앤 비스테카", "33900", "WG.jpg"),
				new Pizza("와규 앤 비스테카2", "33900", "FIRE.jpg"));

		TableColumn tcPizza = tableView.getColumns().get(0);
		tcPizza.setCellValueFactory(new PropertyValueFactory("pizza"));

		TableColumn tcPrice = tableView.getColumns().get(1);
		tcPrice.setCellValueFactory(new PropertyValueFactory("price"));

		TableColumn tcImage = tableView.getColumns().get(2);
		tcImage.setCellValueFactory(new PropertyValueFactory("image"));

		tableView.setItems(pizzaList);

		tableView.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<Pizza>() {
			@Override
			public void changed(ObservableValue<? extends Pizza> observable, Pizza oldValue, Pizza newValue) {
				// System.out.println(newValue.getImage());확인
				if (newValue != null) {
					imageView.setImage(new Image(getClass().getResource("Images/" + newValue.getImage()).toString()));
					moneyT.setText(newValue.getPrice());
					fName = newValue.getPizza();
					cheB.setSelected(false);
					comBo.getSelectionModel().select(0); // 일단 되기는한데 경고빡
				}
			}
		});

	}

	public void handleChkAction(ActionEvent event) {
		if (cheB.isSelected()) {
			int a = Integer.parseInt(moneyT.getText()) + 500;
			moneyT.setText(Integer.toString(a));
		} else {
			int a = Integer.parseInt(moneyT.getText()) - 500;
			moneyT.setText(Integer.toString(a));
		}
	}

	public void handlesideAction(ActionEvent event) {
		if (comBo.getValue().equals("스파게티")) {
			int a = Integer.parseInt(moneyT.getText()) + 8000;
			moneyT.setText(Integer.toString(a));
			sName = comBo.getValue();
		} else if (comBo.getValue().equals("리조또")) {
			int a = Integer.parseInt(moneyT.getText()) + 6000;
			moneyT.setText(Integer.toString(a));
			sName = comBo.getValue();
		} else if (comBo.getValue().equals("오징어링")) {
			int a = Integer.parseInt(moneyT.getText()) + 5000;
			moneyT.setText(Integer.toString(a));
			sName = comBo.getValue();
		} else if (comBo.getValue().equals("쇼콜라")) {
			int a = Integer.parseInt(moneyT.getText()) + 3000;
			moneyT.setText(Integer.toString(a));
			sName = comBo.getValue();
		}
	}

	public void handleSumitAction(ActionEvent event) {
		System.out.println("----- 주문 내역 -----");
		System.out.println("메뉴 : " + fName);
		System.out.println("사이드 메뉴 : " + sName);
		System.out.println("배송 주소 : " + addText.getText());
		System.out.println("가격 : " + moneyT.getText());
	}

}

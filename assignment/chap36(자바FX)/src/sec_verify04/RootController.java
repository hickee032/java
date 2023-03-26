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
	private ObservableList<String> comlist = FXCollections.observableArrayList("����", "��¡�", "������", "���İ�Ƽ", "���ݶ�");

//	private ObservableList<SideMenu> comlist = FXCollections.observableArrayList(
//			new SideMenu("��¡�","3000"),
//			new SideMenu("������","7000"),
//			new SideMenu("���İ�Ƽ","8000"),
//			new SideMenu("���ݶ�","5000")
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

		ObservableList<Pizza> pizzaList = FXCollections.observableArrayList(new Pizza("����� ������", "34900", "OCT.jpg"),
				new Pizza("�̺�����", "34900", "IBE.jpg"), new Pizza("����Ʈ ��Ʈ��", "34900", "BEST.jpg"),
				new Pizza("���ްŽ�", "34900", "STAKE.jpg"), new Pizza("��Ÿ�̰�", "33900", "TIGER.jpg"),
				new Pizza("�۷��� �ٺ�ť", "33900", "BBQ.jpg"), new Pizza("�ͱ� �� ����ī", "33900", "WG.jpg"),
				new Pizza("�ͱ� �� ����ī2", "33900", "FIRE.jpg"));

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
				// System.out.println(newValue.getImage());Ȯ��
				if (newValue != null) {
					imageView.setImage(new Image(getClass().getResource("Images/" + newValue.getImage()).toString()));
					moneyT.setText(newValue.getPrice());
					fName = newValue.getPizza();
					cheB.setSelected(false);
					comBo.getSelectionModel().select(0); // �ϴ� �Ǳ���ѵ� ����
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
		if (comBo.getValue().equals("���İ�Ƽ")) {
			int a = Integer.parseInt(moneyT.getText()) + 8000;
			moneyT.setText(Integer.toString(a));
			sName = comBo.getValue();
		} else if (comBo.getValue().equals("������")) {
			int a = Integer.parseInt(moneyT.getText()) + 6000;
			moneyT.setText(Integer.toString(a));
			sName = comBo.getValue();
		} else if (comBo.getValue().equals("��¡�")) {
			int a = Integer.parseInt(moneyT.getText()) + 5000;
			moneyT.setText(Integer.toString(a));
			sName = comBo.getValue();
		} else if (comBo.getValue().equals("���ݶ�")) {
			int a = Integer.parseInt(moneyT.getText()) + 3000;
			moneyT.setText(Integer.toString(a));
			sName = comBo.getValue();
		}
	}

	public void handleSumitAction(ActionEvent event) {
		System.out.println("----- �ֹ� ���� -----");
		System.out.println("�޴� : " + fName);
		System.out.println("���̵� �޴� : " + sName);
		System.out.println("��� �ּ� : " + addText.getText());
		System.out.println("���� : " + moneyT.getText());
	}

}

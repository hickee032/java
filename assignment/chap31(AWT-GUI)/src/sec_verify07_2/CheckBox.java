package sec_verify07_2;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.Frame;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

@SuppressWarnings("serial")
public class CheckBox extends Frame {

	CheckboxGroup colorMenu = new CheckboxGroup();

	Checkbox red = new Checkbox("red", colorMenu, true);
	Checkbox green = new Checkbox("green", colorMenu, false);
	Checkbox blue = new Checkbox("blue", colorMenu, false);

	public CheckBox(String name) {
		super(name);
		this.setSize(500, 500);
		this.setLayout(null);
		this.setBackground(Color.RED);
		this.add(red);
		this.red.setBounds(110, 10, 100, 60);
		this.red.setBackground(Color.RED);
		this.add(green);
		this.green.setBounds(210, 10, 100, 60);
		this.green.setBackground(Color.GREEN);
		this.add(blue);
		this.blue.setBounds(310, 10, 100, 60);
		this.blue.setBackground(Color.BLUE);

		this.red.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				setBackground(Color.RED);
			}
		});
		this.green.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				setBackground(Color.GREEN);
			}
		});
		this.blue.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				setBackground(Color.BLUE);
			}
		});
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		this.setVisible(true);
	}

}

package sec01.exam03_choice;

import java.awt.Choice;
import java.awt.Frame;

public class ChoiceExample {

	public static void main(String[] args) {
		Frame frame = new Frame("Choice 선택");
		frame.setSize(300, 200);
		frame.setLayout(null);
		
		Choice day = new Choice();
		day.add("월");
		day.add("화");
		day.add("수");
		day.add("목");
		day.add("금");
		
		day.setSize(100, 50);
		day.setLocation(100, 70);
		
		frame.add(day);
		frame.setVisible(true);
	}

}

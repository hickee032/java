package sec01.exam03_choice;

import java.awt.Choice;
import java.awt.Frame;

public class ChoiceExample {

	public static void main(String[] args) {
		Frame frame = new Frame("Choice ����");
		frame.setSize(300, 200);
		frame.setLayout(null);
		
		Choice day = new Choice();
		day.add("��");
		day.add("ȭ");
		day.add("��");
		day.add("��");
		day.add("��");
		
		day.setSize(100, 50);
		day.setLocation(100, 70);
		
		frame.add(day);
		frame.setVisible(true);
	}

}

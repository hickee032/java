package sec01.exam04_List;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.List;
import java.awt.Toolkit;

public class ListExample {

	public static void main(String[] args) {
		Frame frame = new Frame("List ����");
		frame.setSize(300, 200);
		frame.setLayout(null);

		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension screensize = tk.getScreenSize();

		frame.setLocation((screensize.width / 2) - 150, (screensize.height / 2) - 100);
		frame.setVisible(true);

		List list = new List();
		list.setLocation(20, 40);
		list.setSize(100, 120);

		list.add("�л�");
		list.add("������");
		list.add("���α׷���");
		list.add("�������");
		list.add("�����");
		list.add("����?");

		List list2 = new List(100, true);
		list2.setLocation(150, 40);
		list2.setSize(100, 120);

		list2.add("�л�");
		list2.add("������");
		list2.add("���α׷���");
		list2.add("�������");
		list2.add("�����");
		list2.add("����?");

		frame.add(list); frame.add(list2);

	}

}

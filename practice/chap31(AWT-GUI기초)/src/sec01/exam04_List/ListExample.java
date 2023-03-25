package sec01.exam04_List;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.List;
import java.awt.Toolkit;

public class ListExample {

	public static void main(String[] args) {
		Frame frame = new Frame("List 예제");
		frame.setSize(300, 200);
		frame.setLayout(null);

		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension screensize = tk.getScreenSize();

		frame.setLocation((screensize.width / 2) - 150, (screensize.height / 2) - 100);
		frame.setVisible(true);

		List list = new List();
		list.setLocation(20, 40);
		list.setSize(100, 120);

		list.add("학생");
		list.add("선생님");
		list.add("프로그래머");
		list.add("운전기사");
		list.add("대통령");
		list.add("머지?");

		List list2 = new List(100, true);
		list2.setLocation(150, 40);
		list2.setSize(100, 120);

		list2.add("학생");
		list2.add("선생님");
		list2.add("프로그래머");
		list2.add("운전기사");
		list2.add("대통령");
		list2.add("머지?");

		frame.add(list); frame.add(list2);

	}

}

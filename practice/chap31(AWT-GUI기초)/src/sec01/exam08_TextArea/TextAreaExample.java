package sec01.exam08_TextArea;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextArea;

public class TextAreaExample {

	public static void main(String[] args) {
		Frame f = new Frame("Comments");
		f.setSize(400, 220);
		f.setLayout(new FlowLayout());

		/*
		 * text - TextArea�� ������ text�� �����Ѵ�. row - TextArea�� ��(row) ���� �����Ѵ�. col -
		 * TextArea�� ��(column) ���� ���´�.
		 */
		TextArea comments = new TextArea("�ϰ� ���� ���� ��������.", 10, 50, TextArea.SCROLLBARS_BOTH);
		f.add(comments);
		// TextArea�� text ��ü�� ���� �ǵ��� �Ѵ�.
		comments.selectAll();
		f.setVisible(true);

	}

}

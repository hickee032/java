package sec01.exam06_CheckBox;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;

public class CheckBoxExample {

	public static void main(String[] args) {

		Frame f = new Frame("üũ�ڽ� ����");
		f.setSize(305, 250);

		/*
		 * Frame�� LayoutManager�� FlowLayout���� �����Ѵ�. FlowLayout����� ��ġ�� �� ������� �������� ��������
		 * ������Ʈ�� ���Ľ�Ų��. ������ ���� ������ �����ߴ�.
		 */

		f.setLayout(new FlowLayout(FlowLayout.LEFT));

		// Checkbox�� ���������� �����ϸ�, ���� ������ �Ǿ�����.
		Label q1 = new Label("1.����� ���� �оߴ�?(���� �� ���ð���)");
		// true�� ���õ� ���·� ����
		Checkbox news = new Checkbox("news", true);
		Checkbox sports = new Checkbox("sports");
		Checkbox movies = new Checkbox("movies");
		Checkbox music = new Checkbox("music");
		f.add(q1);
		f.add(news);
		f.add(sports);
		f.add(movies);
		f.add(music);

		// üũ�ڽ� �׷��� �����ϸ�, �⺻������ 1�� �ۿ� ������ ���ϰ� �ȴ�.
		Label q2 = new Label("2.�󸶳� ���� ���忡 ���ʴϱ�?");
		CheckboxGroup group1 = new CheckboxGroup();

		// Checkbox�� �����Ͽ� �Ҽ��� group1���� �����. true�� �� ���õ� ���� �ǹ��Ѵ�.
		Checkbox movie1 = new Checkbox("�� �޿� �� �� ���ϴ�.", group1, true);
		Checkbox movie2 = new Checkbox("�����Ͽ� �� �� ���ϴ�.", group1, false);
		Checkbox movie3 = new Checkbox("�����Ͽ� �� �� ���ϴ�.", group1, false);

		f.add(q2);
		f.add(movie1);
		f.add(movie2);
		f.add(movie3);

		Label q3 = new Label("3.�Ϸ翡 �󸶳� ��ǻ�͸� ����Ͻʴϱ�?");
		CheckboxGroup group2 = new CheckboxGroup();

		// Checkbox�� �����Ͽ� �Ҽ��� group2���� �����. true�� �� ���õ� ���� �ǹ��Ѵ�.
		Checkbox com1 = new Checkbox("5�ð� ���� ", group2, true);
		Checkbox com2 = new Checkbox("10�ð� ����", group2, false);
		Checkbox com3 = new Checkbox("15�ð� �̻�", group2, false);

		f.add(q3);
		f.add(com1);
		f.add(com2);
		f.add(com3);
		f.setVisible(true);

	}

}

package sec_verify16;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		
		TreeSet<Student> treeSet = new TreeSet<Student>();

		
		treeSet.add(new Student("���ּ�", 86));
		treeSet.add(new Student("�赿��", 68));
		treeSet.add(new Student("�̴�ȣ", 100));
		treeSet.add(new Student("��ȣ��", 59));
		treeSet.add(new Student("������", 77));
		treeSet.add(new Student("������", 96));

		System.out.println("��ü �л� ����Ʈ�Դϴ�.\n");
		Iterator<Student> iterator = treeSet.iterator();
		while (iterator.hasNext()) {
			Student st = iterator.next();
			System.out.println("�л� �̸� : "+st.getName() + " , ���� : " + st.getScore());
		}
		
		System.out.println();
		Student ls = treeSet.last();
		System.out.println("�ְ� ���� : "+ ls.getScore()+" , �л��̸� : "+ls.getName());
	}

}

package sec02_Set.exam01_HashSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {

		Set<String> set = new HashSet<String>();

//		set.add("JAVA");
//		set.add("JAVA");
//		set.add("JAVA");
//		set.add("JAVA");
//		set.add("JAVA");
//		String���� equal ,hashcode�� �������̵� �Ǿ��ִ�. ���� ���ü �ߺ� ������ �ȵȴ�.
//		System.out.println("����� ��ü��"+set.size());

		set.add("JAVA");
		set.add("JDBC");
		set.add("JSP");
		set.add("JAVA");
		set.add("MySQL");
		System.out.println("����� ��ü��" + set.size());

		Iterator<String> iterator = set.iterator();
		while (iterator.hasNext()) {
			String element = iterator.next();
			System.out.println(element);
			// set�� ������ ���� �ʴ� �� --> remove�� ���� �ʴ� �̻�
			System.out.println("����� ��ü�� " + set.size());
		}

		set.remove("JDBC");
		set.remove("JSP");
		// ���� ��
		System.out.println("����� ��ü�� " + set.size());

		set.clear();
		if (set.isEmpty()) {
			System.out.println("��ü�� ����.");
		} else {
			System.out.println("��ü�� �����մϴ�.");
		}
	}

}

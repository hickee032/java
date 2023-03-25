package sec05.exam07_Comparable;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

public class ComparableExample {

	public static void main(String[] args) {

		TreeSet<Person> treeSet = new TreeSet<Person>();

		treeSet.add(new Person("������", 9));
		treeSet.add(new Person("ȫ�浿", 35));
		treeSet.add(new Person("�տ���", 19));
		//������ ����� �ʴ� ������ TreeSet�� ��쿡�� �ƾ� ������ ����� �ϱ⶧���̴�.��
		treeSet.add(new Person("����", 19));
		treeSet.add(new Person("�ڿ���", 25));
		treeSet.add(new Person("������", 21));
		treeSet.add(new Person("�չμ�", 29));
		treeSet.add(new Person("������", 51));
		treeSet.add(new Person("�ڱ���", 61));
		
		/*
		 * ������������ ������ �Ȱ��� Ȯ�� �Ҽ� �ִ�. �������� ��� �ߺ� ������� �ʴ� ��.
		 * ���� ����Ȱ͸� ��µȴ�.�ڿ� ���� ���� ���õȴ�.
		 */

		System.out.println("����� �� ��ü�� :" + treeSet.size());
		for (Person person : treeSet) {
			String str = person.getName();
			int age = person.getAge();
			System.out.println("�̸� : " + str + ", ���� : " + age);
		}
		System.out.println();
		NavigableSet<Person> nSet = treeSet.descendingSet();
		Iterator<Person> iterator = nSet.iterator();
		while(iterator.hasNext()) {
			Person person = iterator.next();
			System.out.println("�̸� : " + person.getName() + ", ���� : " + person.getAge());
		}

	}

}

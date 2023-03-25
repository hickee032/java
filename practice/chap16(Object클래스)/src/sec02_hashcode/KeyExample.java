package sec02_hashcode;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.Vector;

public class KeyExample {

	public static void main(String[] args) {
		/*
		 * HashMap, HashSet, HashTable, LinkedHashSet(�÷��� list�迭 treeset�迭����)�� 
		 * equals()�� ȣ���ϱ����� hashcode()�� ���� ȣ���Ѵ�. 
		 * �׷��� ������ new�� ���� person�ν��Ͻ��� ��������Ƿ� ���� ���� ����Ǵ� ������ �޶� ���ϴ� ���� ���� �ʴ� ��.
		 * ���ϴ� ���� ��� ���ؼ��� objectŬ������ hashcode()�� ������ (�������̵�)�ؼ� ���� ����
		 * �� 1���� ���� ������ �����Ѵ�. 
		 * �׸��� equals()�� ������ �ؼ� �� ���� ���� �����μ� ���ü�� �Ǿ� ���ϴ� ���� ��´�.
		 */
		
		HashMap<Person, String> hashMap = new HashMap<Person, String>();
		hashMap.put(new Person(10), "ȫ�浿");
		hashMap.put(new Person(3), "�̼�ȣ");

		// get()���� hashcode() �� equals() ���� �ҷ���.
		String str1 = hashMap.get(new Person(10));
		System.out.println(str1);
		String str2 = hashMap.get(new Person(3));
		System.out.println(str2);

		// hashcode�� �θ��� �ʴ� ��.
		Vector<Person> v = new Vector<Person>();
		v.add(new Person(15));
		Person p = (Person) v.get(0);
		System.out.println(p.number);

		Set<Person> set = new LinkedHashSet<Person>();
		set.add(new Person(50));
	}

}

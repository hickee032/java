package sec03_Map.exam02_UserDifine_hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		// key ->Student, value->Integer
		Map<Student, Integer> map = new HashMap<Student, Integer>();

		/*
		 * �Ʒ� �ΰ��� Map.Entry�� ���ü�� �ȴ�. Ű�� ���� Student��ü�� sno�� name �� ���� ����. �׷��� �������� �����
		 * ������ ��ü�ȴ�. ������ hashcode()�� equals()�� �������̵� ���� �ʾҴٸ� �ٸ���ü�� �ν��Ͽ� ����ȴ� ---> new
		 * ������(���� �Ҵ�)
		 */

		map.put(new Student(1, "ȫ�浿"), 95);
		map.put(new Student(1, "ȫ�浿"), 90);
		map.put(new Student(1, "������"), 100);
		map.put(new Student(1, "���ּ�"), 58);

		System.out.println("�� MapEntry �� : " + map.size());
		System.out.println("ȫ�浿 : " + map.get(new Student(1, "ȫ�浿")));

		System.out.println("-----key.set-----");
		Set<Student> keySet = map.keySet();
		Iterator<Student> keyIterator = keySet.iterator();
		while (keyIterator.hasNext()) {
			Student key = keyIterator.next();
			System.out.println("Student(sno)" + key.getSno() + "Student(name)" + key.getName() + ", Integer"
					+ map.get(new Student(key.getSno(), key.getName())));
		}

		// map.entry
		System.out.println("-----map.entry-----");
		Set<Map.Entry<Student, Integer>> entries = map.entrySet();
		Iterator<Map.Entry<Student, Integer>> entryiter = entries.iterator();
		while (entryiter.hasNext()) {
			Map.Entry<Student, Integer> en = entryiter.next();
			// entryset�� ��쿡�� key�� value ���� ��� �;��Ѵ�.�׷��� keyset�� �޸� key���� value���� ���;��Ѵ�.
			Student key = en.getKey();
			Integer value = en.getValue();

			System.out.println("Student(sno)" + key.getSno() + "Student(name)" + key.getName() + ", Integer" + value);
		}

	}

}

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
		 * 아래 두개의 Map.Entry는 동등객체가 된다. 키로 사용된 Student객체의 sno와 name 의 값이 같다. 그래서 마지막에 저장된
		 * 값으로 대체된다. 하지만 hashcode()와 equals()를 오버라이딩 하지 않았다면 다른객체로 인식하여 저장된다 ---> new
		 * 때문에(새로 할당)
		 */

		map.put(new Student(1, "홍길동"), 95);
		map.put(new Student(1, "홍길동"), 90);
		map.put(new Student(1, "신은혁"), 100);
		map.put(new Student(1, "김주성"), 58);

		System.out.println("총 MapEntry 수 : " + map.size());
		System.out.println("홍길동 : " + map.get(new Student(1, "홍길동")));

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
			// entryset의 경우에는 key와 value 값을 얻어 와야한다.그래서 keyset과 달리 key값과 value값을 얻어와야한다.
			Student key = en.getKey();
			Integer value = en.getValue();

			System.out.println("Student(sno)" + key.getSno() + "Student(name)" + key.getName() + ", Integer" + value);
		}

	}

}

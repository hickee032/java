package sec02_hashcode;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.Vector;

public class KeyExample {

	public static void main(String[] args) {
		/*
		 * HashMap, HashSet, HashTable, LinkedHashSet(컬렉션 list계열 treeset계열제외)은 
		 * equals()를 호출하기전에 hashcode()를 먼저 호출한다. 
		 * 그렇기 때문에 new을 통해 person인스턴스를 만들었으므로 각기 힙에 저장되는 번지가 달라 원하는 값을 주지 않는 다.
		 * 원하는 값을 얻기 위해서는 object클래스의 hashcode()를 재정의 (오버라이딩)해서 값이 같을
		 * 때 1차적 논리적 동등을 인정한다. 
		 * 그리고 equals()를 재정의 해서 그 값을 같게 함으로서 동등객체가 되어 원하는 값을 얻는다.
		 */
		
		HashMap<Person, String> hashMap = new HashMap<Person, String>();
		hashMap.put(new Person(10), "홍길동");
		hashMap.put(new Person(3), "이수호");

		// get()에서 hashcode() 와 equals() 같이 불러옴.
		String str1 = hashMap.get(new Person(10));
		System.out.println(str1);
		String str2 = hashMap.get(new Person(3));
		System.out.println(str2);

		// hashcode를 부르지 않는 다.
		Vector<Person> v = new Vector<Person>();
		v.add(new Person(15));
		Person p = (Person) v.get(0);
		System.out.println(p.number);

		Set<Person> set = new LinkedHashSet<Person>();
		set.add(new Person(50));
	}

}

package sec05.exam07_Comparable;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

public class ComparableExample {

	public static void main(String[] args) {

		TreeSet<Person> treeSet = new TreeSet<Person>();

		treeSet.add(new Person("신은혁", 9));
		treeSet.add(new Person("홍길동", 35));
		treeSet.add(new Person("손연재", 19));
		//김기수가 덮어쓰지 않는 이유는 TreeSet의 경우에는 아얘 들어오지 말라고 하기때문이다.ㄴ
		treeSet.add(new Person("김기수", 19));
		treeSet.add(new Person("박연수", 25));
		treeSet.add(new Person("손은정", 21));
		treeSet.add(new Person("손민수", 29));
		treeSet.add(new Person("김춘자", 51));
		treeSet.add(new Person("박길후", 61));
		
		/*
		 * 오름차순으로 정렬이 된것을 확인 할수 있다. 같은나이 라면 중복 저장되지 않는 다.
		 * 먼저 저장된것만 출력된다.뒤에 오는 것은 무시된다.
		 */

		System.out.println("저장된 총 객체수 :" + treeSet.size());
		for (Person person : treeSet) {
			String str = person.getName();
			int age = person.getAge();
			System.out.println("이름 : " + str + ", 나이 : " + age);
		}
		System.out.println();
		NavigableSet<Person> nSet = treeSet.descendingSet();
		Iterator<Person> iterator = nSet.iterator();
		while(iterator.hasNext()) {
			Person person = iterator.next();
			System.out.println("이름 : " + person.getName() + ", 나이 : " + person.getAge());
		}

	}

}

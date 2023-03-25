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
//		String에는 equal ,hashcode가 오버라이딩 되어있다. 논리적 동등객체 중복 저장이 안된다.
//		System.out.println("저장된 객체수"+set.size());

		set.add("JAVA");
		set.add("JDBC");
		set.add("JSP");
		set.add("JAVA");
		set.add("MySQL");
		System.out.println("저장된 객체수" + set.size());

		Iterator<String> iterator = set.iterator();
		while (iterator.hasNext()) {
			String element = iterator.next();
			System.out.println(element);
			// set은 삭제를 하지 않는 다 --> remove를 하지 않는 이상
			System.out.println("저장된 객체수 " + set.size());
		}

		set.remove("JDBC");
		set.remove("JSP");
		// 삭제 후
		System.out.println("저장된 객체수 " + set.size());

		set.clear();
		if (set.isEmpty()) {
			System.out.println("객체가 없다.");
		} else {
			System.out.println("객체가 존재합니다.");
		}
	}

}

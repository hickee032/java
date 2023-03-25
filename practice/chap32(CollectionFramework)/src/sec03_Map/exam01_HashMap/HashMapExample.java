package sec03_Map.exam01_HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		// 여기서 String Integer는 객체이다
		Map<String, Integer> map = new HashMap<String, Integer>();

		// string에는 hashcode와 equal이 오버라이딩되어있다.
		map.put("신은혁", 85);
		map.put("홍길동", 90);
		map.put("동장군", 80);
		map.put("홍길동", 95); // <--덮어써진다. 키값을 찾아 값을 덮어쓰게 된다.
		map.put("동장군", 1000);

		System.out.println("총 MapEntry 수 : " + map.size());
		System.out.println("홍길동 : " + map.get("홍길동"));
		System.out.println();
		System.out.println("동장군 : " + map.get("동장군"));
		System.out.println();

		// map은 컬렉션을 구현 하지 않았다. 그러므로 key값으로 set형태로 바꾸어 준다.
		Set<String> keyset = map.keySet();
		// keyset에 대한 반복자를 얻어낸다.
		Iterator<String> iterator = keyset.iterator();
		System.out.println("ketset으로 출력");

		// iterator.hasNext() 가져올 키가 있는지 묻는다.
		while (iterator.hasNext()) {
			// key가 스트링 타입 == 스트링 타입으로 받아야한다.
			String key = iterator.next();
			// 얻은키로 값 얻어오기
			// get()으로 가져온다 하더라도 그값이 삭제 되지 않고 유지된다.
			int value = map.get(key);
			System.out.println("\t" + key + "," + value);
		}
		// key가 홍길동인 MapEntry를 삭제한다.
		map.remove("홍길동");
		// null이라는 것은 그 맵에 아애 존재하지 않는 다는 뜻이다. -->맵에 엔트리가 존재하지 않는 다면
		// null값을 리턴한다.
		// -->nullPointEception이 발생하지 않는 다.
		System.out.println("삭제 후");
		System.out.println("홍길동 : " + map.get("홍길동"));
		// 2개가 나온다.
		System.out.println("총 MapEntry 수 : " + map.size());
		System.out.println();

		// entryset을 통해서 출력하는 방법 --> 속도가 keyset보다 느리다.

		Set<Map.Entry<String, Integer>> entryset = map.entrySet();

		Iterator<Map.Entry<String, Integer>> entryiterator = entryset.iterator();

		System.out.println("entryset 이용");
		while (entryiterator.hasNext()) {

			Map.Entry<String, Integer> entry = entryiterator.next();
			String key = entry.getKey();
			int value = entry.getValue();
			System.out.println("\t" + key + "," + value);
		}
		System.out.println();

		map.clear();
		System.out.println("총 MapEntry 수 : " + map.size());

	}

}

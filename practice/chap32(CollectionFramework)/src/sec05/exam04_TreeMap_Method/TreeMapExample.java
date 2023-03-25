package sec05.exam04_TreeMap_Method;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {
		TreeMap<Integer, String> scores = new TreeMap<Integer, String>();
		// map객체 5개를 무작위로 저장했지만 TreeMap의 이진트리에 의해서 자동정렬
		scores.put(new Integer(87), "홍길동");
		// scores.put(87, "홍길동"); //가능
		scores.put(new Integer(98), "신은혁");
		scores.put(new Integer(75), "김연아");
		scores.put(new Integer(95), "손연재");
		scores.put(new Integer(80), "김삼순");
//		--> 키값으로 정렬되어있다.
		Map.Entry<Integer, String> entry = null;

		entry = scores.firstEntry();
		System.out.println("가장 낮은 점수 : " + entry.getKey() + "-" + entry.getValue());
		System.out.println();

		entry = scores.lastEntry();
		System.out.println("가장 높은 점수 : " + entry.getKey() + "-" + entry.getValue());
		System.out.println();

		// 이진트리중 주어진 객체 즉 95점 보다 낮은 entry 리턴 (95미포함)
		entry = scores.lowerEntry(new Integer(95));
		System.out.println("95점보다 바로 아래 미포함: " + entry.getKey() + "-" + entry.getValue());
		System.out.println();
		// 이진트리중 주어진 객체 즉 95점 보다 큰 entry 리턴 (95미포함)
		entry = scores.higherEntry(new Integer(95));
		System.out.println("95점보다 바로 위  점수 미포함: " + entry.getKey() + "-" + entry.getValue());
		System.out.println();

		// 이진트리 중 주어진 객체 95점보다 작은 Entry를 리턴 (95점 포함)
		entry = scores.floorEntry(new Integer(95));
		System.out.println("95점이거나 바로 아래 점수: " + entry.getKey() + "-" + entry.getValue());
		System.out.println();
		// 이진트리 중 주어진 객체 95점보다 큰 Entry를 리턴 (95점 포함)
		entry = scores.ceilingEntry(new Integer(95));
		System.out.println("95점이거나 바로 위 점수: " + entry.getKey() + "-" + entry.getValue());
		System.out.println();

		while (!scores.isEmpty()) {
//			역시  treeset과 유사하게 pollFirstEntry()는 treemap에서 가장 낮은 점수를 entry를 가져오고 map에서 제거한다 
//			poll이 붙으면 제거한다고 생각하자.
//			오름차순
			entry = scores.pollFirstEntry();
			int value = entry.getKey();
			String str = entry.getValue();
			System.out.println("키 : " + value + " - 값 : " + str + "( 남아있는 객체 수 : " + scores.size() + ")");
		}

		while (!scores.isEmpty()) {
//			역시  treeset과 유사하게 pollLastEntry()는 treemap에서 가장 낮은 점수를 entry를 가져오고 map에서 제거한다 
//			내림차순
			entry = scores.pollLastEntry();
			int value = entry.getKey();
			String str = entry.getValue();
			System.out.println("키 : " + value + " - 값 : " + str + "( 남아있는 객체 수 : " + scores.size() + ")");
		}

//		treemap에 대한 keyset을 얻고 반복자를 얻은후에 전체객체를 출력해봄
//		위와 차이가 있는 것은 반복자를 통해서 얻어 출력하는 것은 treemap에서 객체의 제거가 되지 않는 다는 것을 알도록하자

		Set<Integer> keyset = scores.keySet();
		Iterator<Integer> iterator = keyset.iterator();
		while (iterator.hasNext()) {
			int value = iterator.next();
			String str = scores.get(value);

			// 명시적으로 호출함으로써 treemap에서 제거할수 있다.
			// iterator.remove();
			System.out.println("키 : " + value + " - 값 : " + str + "( 남아있는 객체 수 : " + scores.size() + ")");
		}

//		treemap에 대한 Map.Entryset을 얻고 반복자를 얻은 후에 전체 객체를 출력해봄
//		위와 차잉가 있는 것은 반복자를 통해 얻어 출력하는 것은 treemap에서 객체의 제거가 안됨을 알자.

//		Set<Map.Entry<Integer, String>> entryset = scores.entrySet();
//		Iterator<Map.Entry<Integer, String>> iterator = entryset.iterator();
//		while(iterator.hasNext()) {
//			Map.Entry<Integer, String> mapentry = iterator.next();
//			int value = mapentry.getKey();
//			String str = mapentry.getValue();

		// 명시적으로 호출함으로써 treemap에서 제거할수 있다.
		// iterator.remove();
//			System.out.println("키 : " + value + " - 값 : " + str + "( 남아있는 객체 수 : " + scores.size() + ")");
	}

}

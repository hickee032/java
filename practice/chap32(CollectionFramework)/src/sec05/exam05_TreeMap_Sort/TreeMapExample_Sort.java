package sec05.exam05_TreeMap_Sort;

import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapExample_Sort {

	public static void main(String[] args) {
		
		TreeMap<Integer, String> scores = new TreeMap<Integer, String>();
		
		scores.put(new Integer(87), "홍길동");
		// scores.put(87, "홍길동"); //가능 //그림을 그려보도록하자.
		scores.put(new Integer(98), "신은혁");
		scores.put(new Integer(75), "김연아");
		scores.put(new Integer(95), "손연재");
		scores.put(new Integer(80), "김삼순");
		
		//키를 가지고 내림차순 하지만 리턴시에는 내림차순이된 Map.Entry객체를 리턴
		NavigableMap<Integer, String> decendingMap = scores.descendingMap();
		//내림차순이된 decendingMap의 entryset을 얻어 set에 대입
		Set<Map.Entry<Integer, String>> decendingEntrySet = decendingMap.entrySet();
		//내림차순이된  Map.Entry 하나씩 출력	
		System.out.println("-- 내림차순 --");
		for(Map.Entry<Integer, String> entry : decendingEntrySet) {
			int value = entry.getKey();
			String str = entry.getValue();
			//System.out.println();
			System.out.println("키 : " + value + " - 값 : " + str);
		}
		System.out.println();
		//내림차순이 되어있는 Map컬렉션을 다시 내림차순으로 정렬하면 오름차순이 된다.
		//NavigableMap--sorted 확장?
		NavigableMap<Integer, String> ascendingMap = decendingMap.descendingMap();
		//내림차순이된 ascendingMap의 entryset을 얻어 set에 대입
		Set<Map.Entry<Integer, String>> ascendingEntrySet = ascendingMap.entrySet();
		//오름차순이 된 Map.Entry를 하나씩 출력
		System.out.println("-- 오름차순 --");
		for(Map.Entry<Integer, String> entry : ascendingEntrySet) {
			int value = entry.getKey();
			String str = entry.getValue();
			//System.out.println();
			System.out.println("키 : " + value + " - 값 : " + str);
		}
		System.out.println();
		
		//아래 부분은 키만 가져와서 반복자로 출력 - 물론 내림차순
		System.out.println("-Iterator Keyset-");
		System.out.println("-- 내림차순 --");
		NavigableSet<Integer> keyset = scores.descendingKeySet();
		Iterator<Integer>iterator = keyset.iterator();
		while(iterator.hasNext()) {
			int value = iterator.next();
			String str = scores.get(value);
			System.out.println("키 : " + value + " - 값 : " + str);
		}

	}

}

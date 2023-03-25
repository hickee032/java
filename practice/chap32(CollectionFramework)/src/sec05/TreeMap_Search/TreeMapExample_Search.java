package sec05.TreeMap_Search;

import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapExample_Search {

	public static void main(String[] args) {
		//Map ==>예를 들어서 사전검색같은것으로 사용될수 있다.
		TreeMap<String, Integer> treeMap = new TreeMap<String, Integer>();

		// Map.Entry객체를 무작위로 저장하지만 저장될때에는 이진트리 형식으로
		// 알파벳 유니코드에 의해 자동정렬
		treeMap.put("apple", new Integer(10));
		treeMap.put("forever", new Integer(60));
		treeMap.put("f", new Integer(64));
		treeMap.put("description", new Integer(40));
		treeMap.put("ever", new Integer(50));
		treeMap.put("zoo", new Integer(100));
		treeMap.put("guess", new Integer(80));
		treeMap.put("banana", new Integer(90));
		treeMap.put("kbd", new Integer(80));
		treeMap.put("lherry", new Integer(15));

		System.out.println("[c ~ f] 사이의 단어 검색");
		//c ~ f사이의 Map.Entry객체를 가져오기 위해 subMap을 이용한다.
		NavigableMap<String, Integer> rangeMap = treeMap.subMap("c", true, "f", true);
		//다시 rangeMap의 entryset을 얻고 출력해본다.
		Set<Map.Entry<String, Integer>> entrySet = rangeMap.entrySet();
		for (Map.Entry<String, Integer> entry : entrySet) {
			String str = entry.getKey();
			int value = entry.getValue();
			System.out.println("단어 : " + str + "-" + "페이지 :" + value);
		}
		System.out.println();
		// K를 포함하고 이후값들만 가지는 Map.entry객체를 리턴한다.
		//-->tailMap 어떠한 값을 기준으로 (범위 검색의 잦대가 된다.) 그이후(포함하고)
		System.out.println("[k 포함하고 그 이후 단어 검색]");
		NavigableMap<String, Integer> tailMap = treeMap.tailMap("k", true);
		for (Map.Entry<String, Integer> entry : tailMap.entrySet()) {
			String str = entry.getKey();
			int value = entry.getValue();
			System.out.println("단어 : " + str + "-" + "페이지 :" + value);
		}
		System.out.println();
		// g를 포함하고 이전 값들만 가지는 Map.entry객체를 리턴한다.
		//-->headMap 어떠한 값을 기준으로 (범위 검색의 잦대가 된다.) 그이후(포함하고)
		System.out.println("[g 포함하고 그 이전 단어 검색]");
		NavigableMap<String, Integer> headMap = treeMap.headMap("g", true);
		for (Map.Entry<String, Integer> entry : headMap.entrySet()) {
			String str = entry.getKey();
			int value = entry.getValue();
			System.out.println("단어 : " + str + "-" + "페이지 :" + value);
		}

	}

}

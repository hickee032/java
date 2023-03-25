package sec05.exam03_TreeSet_Search;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetExample_Search {

	public static void main(String[] args) {
		TreeSet<String> treeSet = new TreeSet<String>();

		treeSet.add("apple");
		treeSet.add("f");
		treeSet.add("fo rever");
		treeSet.add("description");
		treeSet.add("ever");
		treeSet.add("zoo");
		treeSet.add("guess");
		treeSet.add("cherry");
		
//		treeSet.add("가라");
//		treeSet.add("나가");
//		treeSet.add("다시");
//		treeSet.add("라");
//		treeSet.add("마");
//		treeSet.add("바");
//		treeSet.add("사");

//		여기서 헷갈릴수가 있는 데 c~f사이라는 것은 시작이 c부터 해서 끝이 f부분이 f를넘어서면 안된다는 것이다. 
//		다시 말해서 f는 허용하나 forever즉 orever때문에 forever가 출력이 되지 않는다.
//		한글 역시 마찬가지이다.
		
//		subSet = NavigableSet으로 리턴 subSet(c부터~(from), true(c포함여부), f까지(to), true(f 포함여부))
//		-->포함하더라고 단어형태로 되어 있다면은 출력되지 않는 다.
		
		System.out.println("c ~ f 사이의 단어 검색");
		NavigableSet<String> rangeSet = treeSet.subSet("c", true, "f", true);
		for (String str : rangeSet)
			System.out.println(str + " ");
		
//		System.out.println("가 ~ 라 사이의 단어 검색");
//		NavigableSet<String> rangeSet = treeSet.subSet("가", true, "라", true);
//		for (String str : rangeSet)
//			System.out.println(str + " ");

	}

}

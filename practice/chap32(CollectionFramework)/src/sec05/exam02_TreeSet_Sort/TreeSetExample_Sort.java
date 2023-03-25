package sec05.exam02_TreeSet_Sort;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetExample_Sort {

	public static void main(String[] args) {
		TreeSet<Integer> scores = new TreeSet<Integer>();
		//저장시에는 무작위로 저장되지만 컬렉션에 들어갈때는 이진트리로 들어감을 잊지않도록 하자.
		scores.add(87);
		scores.add(new Integer(98));
		scores.add(new Integer(75));
		scores.add(new Integer(95));
		scores.add(new Integer(80));

		for (Integer score : scores)
			System.out.print(score + " ");
		System.out.println("\n객체수 : " + scores.size());

		// TreeSet의 descendingSet()는 내림차순으로 정렬된 개체들을 NavigableSet저장
		NavigableSet<Integer> decendingSet = scores.descendingSet();
		System.out.println("내림차순 결과");
		for (Integer score : decendingSet)
			System.out.print(score + " ");
		System.out.println("\n객체수 : " + scores.size());
		System.out.println();
		
		//다시 descendingSet()을 호출함으로서 오름차순으로 바꿀수도 있다.
		//pollFirst(),pollLast()를 이용해도 된다.
		//프로그래머 가 상황에 맞게끔 선택하여 사용하면된다.

		NavigableSet<Integer> ascendingSet = decendingSet.descendingSet();
		System.out.println("오름차순 결과");
		for (Integer score : ascendingSet)
			System.out.print(score + " ");
		System.out.println("\n객체수 : " + scores.size());
		System.out.println();

	}

}

package sec01_List.exam01_ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList02 {

	public static void main(String[] args) {
		
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		list1.add(5);
		list1.add(4);
		list1.add(2);
		list1.add(0);
		list1.add(1);
		list1.add(new Integer(3));
		System.out.println("list1 - " + list1);
		// sublist()는 마지막 인덱스를 포함하지 않고 list타입을 반환한다.
		ArrayList<Integer> list2 = new ArrayList<Integer>(list1.subList(1, 4));
		System.out.println("subList - " + list2);
		
		//Collections 정적메서드로 구성되어있다.
		//sort()를 하고 난후에 reverse()를 하면 내림차순이 된다.
		Collections.sort(list1); //오름차순
		Collections.sort(list2);
		System.out.println(list1);
		System.out.println(list2);
		
		//Collections.reverse(list1); //역순으로 출력
		//System.out.println(list1);
		
		//컬렉션에 포함 여부를 확인하는 방법 -->요소가 들어 있다면 true
		System.out.println(list1.containsAll(list2));
		
		//컬렉션에 겹치는 부분 -->교집합 부분만 남기고 삭제한다.
		list1.retainAll(list2);
		System.out.println(list1);
	}

}

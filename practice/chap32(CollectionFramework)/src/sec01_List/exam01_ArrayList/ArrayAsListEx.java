package sec01_List.exam01_ArrayList;

import java.util.Arrays;
import java.util.List;

public class ArrayAsListEx {

	public static void main(String[] args) {
		// asList() 리스트로 리턴을 하지만 컬렉션이 아니라 배열형식으로 된 컬렉션을 리턴한다.
		List<String> list1 = Arrays.asList("홍길동", "신길동", "배길동");
		// 아래와 같이 객체추가 삭제시에 java.lang.UnsupportedOperationException 발생한다.
		// list1.add("김길동"); -->오류가 난다. aslist()는 더 이상 추가할수 없다.
		// list1.remove(1);

		for (String str : list1)
			System.out.println(str);

		System.out.println();

		List<Integer> list2 = Arrays.asList(100, 200, 300);
		Integer[] arr = (Integer[]) list2.toArray();

		for (int value : arr)
			System.out.println(value);

		for (int value : list2)
			System.out.println(value);

	}

}

package sec_verify01;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();

		list.add(5);
		list.add(4);
		list.add(-775);
		list.add(100);
		list.add(-1);

		int i = 0;
		System.out.println("ArrayList 내의 요소 객체 수 : " + list.size());
		System.out.println("ArrayList 내의 수를 출력합니다.");
		for (int x : list) {
			i += x;
			System.out.println(x);
		}
		System.out.println("ArrayList 내에 있는 정수들의 합 : -" + i);
	}

}

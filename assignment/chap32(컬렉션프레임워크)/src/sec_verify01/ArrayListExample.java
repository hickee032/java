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
		System.out.println("ArrayList ���� ��� ��ü �� : " + list.size());
		System.out.println("ArrayList ���� ���� ����մϴ�.");
		for (int x : list) {
			i += x;
			System.out.println(x);
		}
		System.out.println("ArrayList ���� �ִ� �������� �� : -" + i);
	}

}

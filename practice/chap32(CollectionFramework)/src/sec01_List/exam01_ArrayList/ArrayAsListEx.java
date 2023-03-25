package sec01_List.exam01_ArrayList;

import java.util.Arrays;
import java.util.List;

public class ArrayAsListEx {

	public static void main(String[] args) {
		// asList() ����Ʈ�� ������ ������ �÷����� �ƴ϶� �迭�������� �� �÷����� �����Ѵ�.
		List<String> list1 = Arrays.asList("ȫ�浿", "�ű浿", "��浿");
		// �Ʒ��� ���� ��ü�߰� �����ÿ� java.lang.UnsupportedOperationException �߻��Ѵ�.
		// list1.add("��浿"); -->������ ����. aslist()�� �� �̻� �߰��Ҽ� ����.
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

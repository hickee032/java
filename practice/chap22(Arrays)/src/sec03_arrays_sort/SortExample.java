package sec03_arrays_sort;

import java.util.Arrays;
import java.util.Comparator;

public class SortExample {

	public static void main(String[] args) {

		int[] scores = new int[] { 55, 100, 8, 8, 23 };

		// �⺻�� Ÿ���̳� stringŬ������ Arrays.sort()�ϸ� �⺻������ �������� ������ �̷������.
		Arrays.sort(scores);

		System.out.println("�⺻�� Ÿ�� ���� �� - " + Arrays.toString(scores));

		String[] names = new String[] { "�谩��", "������", "�ֹ���", "��ټ�", "������" };

		Arrays.sort(names);
		System.out.println("String Ÿ�� ���� �� - " + Arrays.toString(names));

		Member m1 = new Member("ȫ�浿");
		Member m2 = new Member("�ڵ���");
		Member m3 = new Member("�迬��");

		Member[] members = { m1, m2, m3 };

//		new Comparator<>()�� �͸�����ü�� ������ ����
		
//		Arrays.sort(members, new Comparator<Member>() {
//
//			@Override
//			public int compare(Member o1, Member o2) {
//
//				return o1.name.compareTo(o2.name);
//			}
//
//		});

		Arrays.sort(members);
		System.out.println("Members ���� �� - " + Arrays.toString(members));
		int index = Arrays.binarySearch(members, m1);
		System.out.println("m1 �ν��Ͻ��� �ִ� �ε��� : "+index+" ã�� ��ü :  "+members[index]);
	}

}

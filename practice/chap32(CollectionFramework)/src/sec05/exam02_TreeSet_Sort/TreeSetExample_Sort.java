package sec05.exam02_TreeSet_Sort;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetExample_Sort {

	public static void main(String[] args) {
		TreeSet<Integer> scores = new TreeSet<Integer>();
		//����ÿ��� �������� ��������� �÷��ǿ� ������ ����Ʈ���� ���� �����ʵ��� ����.
		scores.add(87);
		scores.add(new Integer(98));
		scores.add(new Integer(75));
		scores.add(new Integer(95));
		scores.add(new Integer(80));

		for (Integer score : scores)
			System.out.print(score + " ");
		System.out.println("\n��ü�� : " + scores.size());

		// TreeSet�� descendingSet()�� ������������ ���ĵ� ��ü���� NavigableSet����
		NavigableSet<Integer> decendingSet = scores.descendingSet();
		System.out.println("�������� ���");
		for (Integer score : decendingSet)
			System.out.print(score + " ");
		System.out.println("\n��ü�� : " + scores.size());
		System.out.println();
		
		//�ٽ� descendingSet()�� ȣ�������μ� ������������ �ٲܼ��� �ִ�.
		//pollFirst(),pollLast()�� �̿��ص� �ȴ�.
		//���α׷��� �� ��Ȳ�� �°Բ� �����Ͽ� ����ϸ�ȴ�.

		NavigableSet<Integer> ascendingSet = decendingSet.descendingSet();
		System.out.println("�������� ���");
		for (Integer score : ascendingSet)
			System.out.print(score + " ");
		System.out.println("\n��ü�� : " + scores.size());
		System.out.println();

	}

}

package sec01_List.exam03_LinkedList;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListExample {

	// ������� �������� �߰��� �������� ArrayList ���� LinkedList�� �ξ� �� ���� ������.

	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<String>();
		LinkedList<String> list2 = new LinkedList<String>();

		DecimalFormat dFormat = new DecimalFormat("#,###");
		long startTime = 0;
		long endTime = 0;

		System.out.println("������� ������ �߰�");
		startTime = System.nanoTime();
		for (int i = 0; i < 100000; i++) {
			// ArrayList 0��°�� ��� i ���� �ִ� ��. ---> ������� 0��°�� �ֱ� ������
			// �ڷ� ��� �з�����.
			list1.add(0, String.valueOf(i));

		}
		endTime = System.nanoTime();
		System.out.println("ArrayList �ɸ��ð� - " + dFormat.format(endTime - startTime) + "ns");
		startTime = System.nanoTime();
		for (int i = 0; i < 100000; i++) {
			// LinkedList 0��°�� ��� i���� �ִ´�.
			list2.add(0, String.valueOf(i));
		}

		endTime = System.nanoTime();
		System.out.println("LinkedList �ɸ��ð� - " + dFormat.format(endTime - startTime) + "ns");

		// ������ ������

		System.out.println("\n������ ������ �߰�");
		startTime = System.nanoTime();
		for (int i = 0; i < 1000000; i++) {
			// ArrayList ���������� i ���� �ִ� ��.
			list1.add(String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("ArrayList �ɸ��ð� - " + dFormat.format(endTime - startTime) + "ns");

		startTime = System.nanoTime();
		for (int i = 0; i < 1000000; i++) {
			// LinkedList 0��°�� ��� i���� �ִ´�.
			list2.add(String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("LinkedList �ɸ��ð� - " + dFormat.format(endTime - startTime) + "ns");

		// ���ٽð� �׽�Ʈ
		System.out.println("\n���ٽð� �׽���");
		startTime = System.nanoTime();
		for (int i = 0; i < 100000; i++) {
			// ArrayList ����
			list1.get(i);
		}
		endTime = System.nanoTime();
		System.out.println("ArrayList �ɸ��ð� - " + dFormat.format(endTime - startTime) + "ns");

		startTime = System.nanoTime();
		for (int i = 0; i < 100000; i++) {
			// LinkedList ����
			list2.get(i);
		}
		endTime = System.nanoTime();
		System.out.println("LinkedList �ɸ��ð� - " + dFormat.format(endTime - startTime) + "ns");

		// ������ �����ͻ���
		System.out.println("\n������ ������ ����");
		startTime = System.nanoTime();
		for (int i = list1.size() - 1; i >= 0; i--) {
			// ArrayList ���������� ����
			list1.remove(i);
		}
		endTime = System.nanoTime();
		System.out.println("ArrayList �ɸ��ð� - " + dFormat.format(endTime - startTime) + "ns");

		startTime = System.nanoTime();
		for (int i = list2.size() - 1; i >= 0; i--) {
			// LinkedList ���������� ����
			list2.remove(i);
		}
		endTime = System.nanoTime();
		System.out.println("LinkedList �ɸ��ð� - " + dFormat.format(endTime - startTime) + "ns");
		
		/* ���
		 * 
		 * ���ݱ��� ���캻 ������ ���� ���������� ���� ���� ������ ArrayList�� ������.
		 *  �ݸ鿡 �߰����� ������ LinkedList�� �����ٴ� ���� �˼��ִ�. 
		 *  -->��Ȳ�� ���� �ڷ� ���������� ArrayList�� LinkedList�� �˸°� ����� �Ұ��̴�.
		 */ 

	}

}

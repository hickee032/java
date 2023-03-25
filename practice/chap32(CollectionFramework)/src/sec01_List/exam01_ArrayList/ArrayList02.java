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
		// sublist()�� ������ �ε����� �������� �ʰ� listŸ���� ��ȯ�Ѵ�.
		ArrayList<Integer> list2 = new ArrayList<Integer>(list1.subList(1, 4));
		System.out.println("subList - " + list2);
		
		//Collections �����޼���� �����Ǿ��ִ�.
		//sort()�� �ϰ� ���Ŀ� reverse()�� �ϸ� ���������� �ȴ�.
		Collections.sort(list1); //��������
		Collections.sort(list2);
		System.out.println(list1);
		System.out.println(list2);
		
		//Collections.reverse(list1); //�������� ���
		//System.out.println(list1);
		
		//�÷��ǿ� ���� ���θ� Ȯ���ϴ� ��� -->��Ұ� ��� �ִٸ� true
		System.out.println(list1.containsAll(list2));
		
		//�÷��ǿ� ��ġ�� �κ� -->������ �κи� ����� �����Ѵ�.
		list1.retainAll(list2);
		System.out.println(list1);
	}

}

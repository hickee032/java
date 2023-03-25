package sec01_List.exam01_ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEx01 {

	public static void main(String[] args) {
		/*
		 * ArrayList�� warring�� �ߴ� �� (���׸� Ÿ���̶�) quick acces���� error�˻� ���׸� �� �� ����
		 * ignore�ϸ�ȴ� ���δ� �ٲ�Ƿ� ��������
		 */
		
		ArrayList list = new ArrayList(); //�⺻������ 10���� ���� �����ȴ�.
		System.out.println("����� ��ü�� : "+list.size());
		
		list.add("111");  //boolean add(object obj)
		list.add("222");
		list.add("333");
		
		System.out.println("����� ��ü�� : "+list.size());
		
		//add(new Integer(333)); JDK 1.5���� �߰��� �ڵ��ڽ̱�� �̿�(���� Ŭ����
		list.add(333); //Integer type ---> �ڵ��ڽ�
		
		System.out.println("����� ��ü�� : "+list.size());
		
		System.out.println(list);
		System.out.println(list.hashCode()); //--> �ּ�

		list.add(0, "333");
		System.out.println(list);
		
		list.remove(3); 
		list.remove("333"); //�ε����� �������� ������ ���� ���� �ȴ�.
		System.out.println("1 - "+list);
		
		list.add(0, "333");
		System.out.println(list);
		
		System.out.println(list.contains("333"));  //-->���ԵǾ� �ִ��� Ȯ�� ������ true �ƴϸ� flase
		System.out.println(list.indexOf("333")); //-->���ԵǾ� �ִ��� Ȯ�� ������ -1
		
		//ArrayList�� �� �ε����� ���� ���� set(index,object obj)
		for (int i = 0; i < list.size(); i++) {
			list.set(i, i+"");
		}
		
		Iterator iterator = list.iterator();
		while (iterator.hasNext()) {
			String str = (String) iterator.next();
			System.out.println("Iterator �̿� - "+str);		
		}
		
		System.out.println(list);
		
		//�� ������ ���� �ʴ� �� ��?-->������ ��������. �� 0���� ���� �Ǹ� �� �ε����� ���� ����.
		for (int i = 0; i < list.size(); i++) {
			list.remove(i);
		}
		
		//for������ �� ���� �ҷ��� �̷���
		//for (int i = list.size()-1; i >=0; i--) {
		//	list.remove(i);
		//}
		
		//list.clear(); -->list ������ ������ 
		System.out.println(list);
	}

}

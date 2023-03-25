package sec05.exam03_TreeSet_Search;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetExample_Search {

	public static void main(String[] args) {
		TreeSet<String> treeSet = new TreeSet<String>();

		treeSet.add("apple");
		treeSet.add("f");
		treeSet.add("fo rever");
		treeSet.add("description");
		treeSet.add("ever");
		treeSet.add("zoo");
		treeSet.add("guess");
		treeSet.add("cherry");
		
//		treeSet.add("����");
//		treeSet.add("����");
//		treeSet.add("�ٽ�");
//		treeSet.add("��");
//		treeSet.add("��");
//		treeSet.add("��");
//		treeSet.add("��");

//		���⼭ �򰥸����� �ִ� �� c~f���̶�� ���� ������ c���� �ؼ� ���� f�κ��� f���Ѿ�� �ȵȴٴ� ���̴�. 
//		�ٽ� ���ؼ� f�� ����ϳ� forever�� orever������ forever�� ����� ���� �ʴ´�.
//		�ѱ� ���� ���������̴�.
		
//		subSet = NavigableSet���� ���� subSet(c����~(from), true(c���Կ���), f����(to), true(f ���Կ���))
//		-->�����ϴ���� �ܾ����·� �Ǿ� �ִٸ��� ��µ��� �ʴ� ��.
		
		System.out.println("c ~ f ������ �ܾ� �˻�");
		NavigableSet<String> rangeSet = treeSet.subSet("c", true, "f", true);
		for (String str : rangeSet)
			System.out.println(str + " ");
		
//		System.out.println("�� ~ �� ������ �ܾ� �˻�");
//		NavigableSet<String> rangeSet = treeSet.subSet("��", true, "��", true);
//		for (String str : rangeSet)
//			System.out.println(str + " ");

	}

}

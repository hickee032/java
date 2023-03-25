package sec05.TreeMap_Search;

import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapExample_Search {

	public static void main(String[] args) {
		//Map ==>���� �� �����˻����������� ���ɼ� �ִ�.
		TreeMap<String, Integer> treeMap = new TreeMap<String, Integer>();

		// Map.Entry��ü�� �������� ���������� ����ɶ����� ����Ʈ�� ��������
		// ���ĺ� �����ڵ忡 ���� �ڵ�����
		treeMap.put("apple", new Integer(10));
		treeMap.put("forever", new Integer(60));
		treeMap.put("f", new Integer(64));
		treeMap.put("description", new Integer(40));
		treeMap.put("ever", new Integer(50));
		treeMap.put("zoo", new Integer(100));
		treeMap.put("guess", new Integer(80));
		treeMap.put("banana", new Integer(90));
		treeMap.put("kbd", new Integer(80));
		treeMap.put("lherry", new Integer(15));

		System.out.println("[c ~ f] ������ �ܾ� �˻�");
		//c ~ f������ Map.Entry��ü�� �������� ���� subMap�� �̿��Ѵ�.
		NavigableMap<String, Integer> rangeMap = treeMap.subMap("c", true, "f", true);
		//�ٽ� rangeMap�� entryset�� ��� ����غ���.
		Set<Map.Entry<String, Integer>> entrySet = rangeMap.entrySet();
		for (Map.Entry<String, Integer> entry : entrySet) {
			String str = entry.getKey();
			int value = entry.getValue();
			System.out.println("�ܾ� : " + str + "-" + "������ :" + value);
		}
		System.out.println();
		// K�� �����ϰ� ���İ��鸸 ������ Map.entry��ü�� �����Ѵ�.
		//-->tailMap ��� ���� �������� (���� �˻��� ��밡 �ȴ�.) ������(�����ϰ�)
		System.out.println("[k �����ϰ� �� ���� �ܾ� �˻�]");
		NavigableMap<String, Integer> tailMap = treeMap.tailMap("k", true);
		for (Map.Entry<String, Integer> entry : tailMap.entrySet()) {
			String str = entry.getKey();
			int value = entry.getValue();
			System.out.println("�ܾ� : " + str + "-" + "������ :" + value);
		}
		System.out.println();
		// g�� �����ϰ� ���� ���鸸 ������ Map.entry��ü�� �����Ѵ�.
		//-->headMap ��� ���� �������� (���� �˻��� ��밡 �ȴ�.) ������(�����ϰ�)
		System.out.println("[g �����ϰ� �� ���� �ܾ� �˻�]");
		NavigableMap<String, Integer> headMap = treeMap.headMap("g", true);
		for (Map.Entry<String, Integer> entry : headMap.entrySet()) {
			String str = entry.getKey();
			int value = entry.getValue();
			System.out.println("�ܾ� : " + str + "-" + "������ :" + value);
		}

	}

}

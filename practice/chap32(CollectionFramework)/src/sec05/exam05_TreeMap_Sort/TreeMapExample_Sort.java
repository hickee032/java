package sec05.exam05_TreeMap_Sort;

import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapExample_Sort {

	public static void main(String[] args) {
		
		TreeMap<Integer, String> scores = new TreeMap<Integer, String>();
		
		scores.put(new Integer(87), "ȫ�浿");
		// scores.put(87, "ȫ�浿"); //���� //�׸��� �׷�����������.
		scores.put(new Integer(98), "������");
		scores.put(new Integer(75), "�迬��");
		scores.put(new Integer(95), "�տ���");
		scores.put(new Integer(80), "����");
		
		//Ű�� ������ �������� ������ ���Ͻÿ��� ���������̵� Map.Entry��ü�� ����
		NavigableMap<Integer, String> decendingMap = scores.descendingMap();
		//���������̵� decendingMap�� entryset�� ��� set�� ����
		Set<Map.Entry<Integer, String>> decendingEntrySet = decendingMap.entrySet();
		//���������̵�  Map.Entry �ϳ��� ���	
		System.out.println("-- �������� --");
		for(Map.Entry<Integer, String> entry : decendingEntrySet) {
			int value = entry.getKey();
			String str = entry.getValue();
			//System.out.println();
			System.out.println("Ű : " + value + " - �� : " + str);
		}
		System.out.println();
		//���������� �Ǿ��ִ� Map�÷����� �ٽ� ������������ �����ϸ� ���������� �ȴ�.
		//NavigableMap--sorted Ȯ��?
		NavigableMap<Integer, String> ascendingMap = decendingMap.descendingMap();
		//���������̵� ascendingMap�� entryset�� ��� set�� ����
		Set<Map.Entry<Integer, String>> ascendingEntrySet = ascendingMap.entrySet();
		//���������� �� Map.Entry�� �ϳ��� ���
		System.out.println("-- �������� --");
		for(Map.Entry<Integer, String> entry : ascendingEntrySet) {
			int value = entry.getKey();
			String str = entry.getValue();
			//System.out.println();
			System.out.println("Ű : " + value + " - �� : " + str);
		}
		System.out.println();
		
		//�Ʒ� �κ��� Ű�� �����ͼ� �ݺ��ڷ� ��� - ���� ��������
		System.out.println("-Iterator Keyset-");
		System.out.println("-- �������� --");
		NavigableSet<Integer> keyset = scores.descendingKeySet();
		Iterator<Integer>iterator = keyset.iterator();
		while(iterator.hasNext()) {
			int value = iterator.next();
			String str = scores.get(value);
			System.out.println("Ű : " + value + " - �� : " + str);
		}

	}

}

package sec05.exam04_TreeMap_Method;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {
		TreeMap<Integer, String> scores = new TreeMap<Integer, String>();
		// map��ü 5���� �������� ���������� TreeMap�� ����Ʈ���� ���ؼ� �ڵ�����
		scores.put(new Integer(87), "ȫ�浿");
		// scores.put(87, "ȫ�浿"); //����
		scores.put(new Integer(98), "������");
		scores.put(new Integer(75), "�迬��");
		scores.put(new Integer(95), "�տ���");
		scores.put(new Integer(80), "����");
//		--> Ű������ ���ĵǾ��ִ�.
		Map.Entry<Integer, String> entry = null;

		entry = scores.firstEntry();
		System.out.println("���� ���� ���� : " + entry.getKey() + "-" + entry.getValue());
		System.out.println();

		entry = scores.lastEntry();
		System.out.println("���� ���� ���� : " + entry.getKey() + "-" + entry.getValue());
		System.out.println();

		// ����Ʈ���� �־��� ��ü �� 95�� ���� ���� entry ���� (95������)
		entry = scores.lowerEntry(new Integer(95));
		System.out.println("95������ �ٷ� �Ʒ� ������: " + entry.getKey() + "-" + entry.getValue());
		System.out.println();
		// ����Ʈ���� �־��� ��ü �� 95�� ���� ū entry ���� (95������)
		entry = scores.higherEntry(new Integer(95));
		System.out.println("95������ �ٷ� ��  ���� ������: " + entry.getKey() + "-" + entry.getValue());
		System.out.println();

		// ����Ʈ�� �� �־��� ��ü 95������ ���� Entry�� ���� (95�� ����)
		entry = scores.floorEntry(new Integer(95));
		System.out.println("95���̰ų� �ٷ� �Ʒ� ����: " + entry.getKey() + "-" + entry.getValue());
		System.out.println();
		// ����Ʈ�� �� �־��� ��ü 95������ ū Entry�� ���� (95�� ����)
		entry = scores.ceilingEntry(new Integer(95));
		System.out.println("95���̰ų� �ٷ� �� ����: " + entry.getKey() + "-" + entry.getValue());
		System.out.println();

		while (!scores.isEmpty()) {
//			����  treeset�� �����ϰ� pollFirstEntry()�� treemap���� ���� ���� ������ entry�� �������� map���� �����Ѵ� 
//			poll�� ������ �����Ѵٰ� ��������.
//			��������
			entry = scores.pollFirstEntry();
			int value = entry.getKey();
			String str = entry.getValue();
			System.out.println("Ű : " + value + " - �� : " + str + "( �����ִ� ��ü �� : " + scores.size() + ")");
		}

		while (!scores.isEmpty()) {
//			����  treeset�� �����ϰ� pollLastEntry()�� treemap���� ���� ���� ������ entry�� �������� map���� �����Ѵ� 
//			��������
			entry = scores.pollLastEntry();
			int value = entry.getKey();
			String str = entry.getValue();
			System.out.println("Ű : " + value + " - �� : " + str + "( �����ִ� ��ü �� : " + scores.size() + ")");
		}

//		treemap�� ���� keyset�� ��� �ݺ��ڸ� �����Ŀ� ��ü��ü�� ����غ�
//		���� ���̰� �ִ� ���� �ݺ��ڸ� ���ؼ� ��� ����ϴ� ���� treemap���� ��ü�� ���Ű� ���� �ʴ� �ٴ� ���� �˵�������

		Set<Integer> keyset = scores.keySet();
		Iterator<Integer> iterator = keyset.iterator();
		while (iterator.hasNext()) {
			int value = iterator.next();
			String str = scores.get(value);

			// ��������� ȣ�������ν� treemap���� �����Ҽ� �ִ�.
			// iterator.remove();
			System.out.println("Ű : " + value + " - �� : " + str + "( �����ִ� ��ü �� : " + scores.size() + ")");
		}

//		treemap�� ���� Map.Entryset�� ��� �ݺ��ڸ� ���� �Ŀ� ��ü ��ü�� ����غ�
//		���� ���װ� �ִ� ���� �ݺ��ڸ� ���� ��� ����ϴ� ���� treemap���� ��ü�� ���Ű� �ȵ��� ����.

//		Set<Map.Entry<Integer, String>> entryset = scores.entrySet();
//		Iterator<Map.Entry<Integer, String>> iterator = entryset.iterator();
//		while(iterator.hasNext()) {
//			Map.Entry<Integer, String> mapentry = iterator.next();
//			int value = mapentry.getKey();
//			String str = mapentry.getValue();

		// ��������� ȣ�������ν� treemap���� �����Ҽ� �ִ�.
		// iterator.remove();
//			System.out.println("Ű : " + value + " - �� : " + str + "( �����ִ� ��ü �� : " + scores.size() + ")");
	}

}

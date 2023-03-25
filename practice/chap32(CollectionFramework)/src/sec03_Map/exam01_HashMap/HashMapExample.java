package sec03_Map.exam01_HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		// ���⼭ String Integer�� ��ü�̴�
		Map<String, Integer> map = new HashMap<String, Integer>();

		// string���� hashcode�� equal�� �������̵��Ǿ��ִ�.
		map.put("������", 85);
		map.put("ȫ�浿", 90);
		map.put("���屺", 80);
		map.put("ȫ�浿", 95); // <--���������. Ű���� ã�� ���� ����� �ȴ�.
		map.put("���屺", 1000);

		System.out.println("�� MapEntry �� : " + map.size());
		System.out.println("ȫ�浿 : " + map.get("ȫ�浿"));
		System.out.println();
		System.out.println("���屺 : " + map.get("���屺"));
		System.out.println();

		// map�� �÷����� ���� ���� �ʾҴ�. �׷��Ƿ� key������ set���·� �ٲپ� �ش�.
		Set<String> keyset = map.keySet();
		// keyset�� ���� �ݺ��ڸ� ����.
		Iterator<String> iterator = keyset.iterator();
		System.out.println("ketset���� ���");

		// iterator.hasNext() ������ Ű�� �ִ��� ���´�.
		while (iterator.hasNext()) {
			// key�� ��Ʈ�� Ÿ�� == ��Ʈ�� Ÿ������ �޾ƾ��Ѵ�.
			String key = iterator.next();
			// ����Ű�� �� ������
			// get()���� �����´� �ϴ��� �װ��� ���� ���� �ʰ� �����ȴ�.
			int value = map.get(key);
			System.out.println("\t" + key + "," + value);
		}
		// key�� ȫ�浿�� MapEntry�� �����Ѵ�.
		map.remove("ȫ�浿");
		// null�̶�� ���� �� �ʿ� �ƾ� �������� �ʴ� �ٴ� ���̴�. -->�ʿ� ��Ʈ���� �������� �ʴ� �ٸ�
		// null���� �����Ѵ�.
		// -->nullPointEception�� �߻����� �ʴ� ��.
		System.out.println("���� ��");
		System.out.println("ȫ�浿 : " + map.get("ȫ�浿"));
		// 2���� ���´�.
		System.out.println("�� MapEntry �� : " + map.size());
		System.out.println();

		// entryset�� ���ؼ� ����ϴ� ��� --> �ӵ��� keyset���� ������.

		Set<Map.Entry<String, Integer>> entryset = map.entrySet();

		Iterator<Map.Entry<String, Integer>> entryiterator = entryset.iterator();

		System.out.println("entryset �̿�");
		while (entryiterator.hasNext()) {

			Map.Entry<String, Integer> entry = entryiterator.next();
			String key = entry.getKey();
			int value = entry.getValue();
			System.out.println("\t" + key + "," + value);
		}
		System.out.println();

		map.clear();
		System.out.println("�� MapEntry �� : " + map.size());

	}

}

package sec_verify13;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExample {

	public static void main(String[] args) {

		int sum = 0;
		int maxscore = 0;
		String maxkey = null;

		int minsocre = 100;
		String minkey = null;

		Map<String, Integer> map = new HashMap<String, Integer>();

		map.put("������", 96);
		map.put("���ּ�", 86);
		map.put("�迬��", 92);
		map.put("��⸮", 88);
		map.put("��ȫ��", 90);
		map.put("���ֿ�", 44);
		map.put("����ȯ", 55);
		map.put("�ڼ���", 2);
		map.put("����ȣ", 9);
		map.put("����ȫ", 12);

		System.out.println("���� �л��� : " + map.size());

		Set<String> keyset = map.keySet();
		Iterator<String> keyIterator = keyset.iterator();
		while (keyIterator.hasNext()) {
			String key = keyIterator.next();
			sum += map.get(key);
			
			if (map.get(key) > maxscore) {
				maxscore = map.get(key);
				maxkey = key;
			}
			if (map.get(key) < minsocre) {
				minsocre = map.get(key);
				minkey = key;
				// System.out.println(minsocre + "," + minkey);
			}

		}
		System.out.println("��� ���� : " + sum / 10);
		System.out.println(maxscore + "," + maxkey);
		System.out.println(minsocre + "," + minkey);

	}

}

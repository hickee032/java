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

		map.put("신은혁", 96);
		map.put("김주성", 86);
		map.put("김연안", 92);
		map.put("김기리", 88);
		map.put("안홍범", 90);
		map.put("박주영", 44);
		map.put("안정환", 55);
		map.put("박성식", 2);
		map.put("윤두호", 9);
		map.put("엄기홍", 12);

		System.out.println("종합 학생수 : " + map.size());

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
		System.out.println("평균 점수 : " + sum / 10);
		System.out.println(maxscore + "," + maxkey);
		System.out.println(minsocre + "," + minkey);

	}

}

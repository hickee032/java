package sec05.exam08_Comparator;

import java.util.Comparator;
import java.util.TreeSet;

public class ComparatorExample {

	public static void main(String[] args) {

//		TreeSet<Fruit> treeSet = new TreeSet<Fruit>();

		TreeSet<Fruit> treeSet = new TreeSet<Fruit>(new Comparator<Fruit>() {

			// name 기준
			@Override
			public int compare(Fruit o1, Fruit o2) {
				return o1.getName().compareTo(o2.getName()) * 1;
			}

			// price 기준
//			public int compare(Fruit o1, Fruit o2) {
//
//				return o1.getPrice() - o2.getPrice();
//
//			};

		});
		try {
			treeSet.add(new Fruit("포도", 6500));
			treeSet.add(new Fruit("딸기", 4200));
			treeSet.add(new Fruit("복숭아", 3500));
			treeSet.add(new Fruit("바나나", 3400));
			treeSet.add(new Fruit("자두", 2500));
			treeSet.add(new Fruit("호박", 1000));
		} catch (Exception e) {
			System.out.println("정렬기준이 없음");
			System.out.println(e.getMessage());
		}
		for (Fruit f : treeSet) {
			System.out.println("과일이름 : " + f.getName() + ", 가격 : " + f.getPrice());
		}

	}

}

package sec05.exam08_Comparator;

import java.util.Comparator;
import java.util.TreeSet;

public class ComparatorExample {

	public static void main(String[] args) {

//		TreeSet<Fruit> treeSet = new TreeSet<Fruit>();

		TreeSet<Fruit> treeSet = new TreeSet<Fruit>(new Comparator<Fruit>() {

			// name ����
			@Override
			public int compare(Fruit o1, Fruit o2) {
				return o1.getName().compareTo(o2.getName()) * 1;
			}

			// price ����
//			public int compare(Fruit o1, Fruit o2) {
//
//				return o1.getPrice() - o2.getPrice();
//
//			};

		});
		try {
			treeSet.add(new Fruit("����", 6500));
			treeSet.add(new Fruit("����", 4200));
			treeSet.add(new Fruit("������", 3500));
			treeSet.add(new Fruit("�ٳ���", 3400));
			treeSet.add(new Fruit("�ڵ�", 2500));
			treeSet.add(new Fruit("ȣ��", 1000));
		} catch (Exception e) {
			System.out.println("���ı����� ����");
			System.out.println(e.getMessage());
		}
		for (Fruit f : treeSet) {
			System.out.println("�����̸� : " + f.getName() + ", ���� : " + f.getPrice());
		}

	}

}

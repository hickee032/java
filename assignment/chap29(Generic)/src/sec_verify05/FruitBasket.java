package sec_verify05;

public class FruitBasket {

	static <K, V> Fruit<K, V> basketing(K k, V v) {
		
		Fruit<K, V> fruit = new Fruit<K, V>();

		fruit.setK(k);
		fruit.setV(v);
		
//		System.out.println("Fruit�ٱ��Ͽ� ������ ���׿�.");
//		System.out.println("���ϸ� : " + fruit.getK() + "\n���� : " + fruit.getV());
		
		return fruit;
	}

}

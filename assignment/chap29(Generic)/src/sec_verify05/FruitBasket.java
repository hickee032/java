package sec_verify05;

public class FruitBasket {

	static <K, V> Fruit<K, V> basketing(K k, V v) {
		
		Fruit<K, V> fruit = new Fruit<K, V>();

		fruit.setK(k);
		fruit.setV(v);
		
//		System.out.println("Fruit바구니에 과일이 담겼네요.");
//		System.out.println("과일명 : " + fruit.getK() + "\n가격 : " + fruit.getV());
		
		return fruit;
	}

}

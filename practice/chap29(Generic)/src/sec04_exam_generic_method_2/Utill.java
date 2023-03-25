package sec04_exam_generic_method_2;

public class Utill {

	// 제네릭 메서드인 compare()는 Pair라는 2개의 제네릭 객체를 받아서 K,V라는 객체의 값을 비교 하는 메서드 이다.
	public static <K, V> boolean compare(Pair<K, V> p1, Pair<K, V> p2) {

		// K,V는 반드시 equals()가 오버라이딩이 되어있어야만 아래 코드가 적용이 가능하다.
		boolean kCompare = p1.getK().equals(p2.getK());
		boolean vCompare = p1.getV().equals(p2.getV());

		// 둘다 true여야 true를 리턴한다.
		return kCompare && vCompare;
	}

}

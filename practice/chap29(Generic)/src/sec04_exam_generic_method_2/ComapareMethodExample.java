package sec04_exam_generic_method_2;

public class ComapareMethodExample {

	public static void main(String[] args) {
		Pair<Integer, String> p1 = new Pair<Integer, String>(1, "Apple");
		Pair<Integer, String> p2 = new Pair<Integer, String>(1, "Apple");
		// boolean result = Utill.<Integer,String>compare(p1, p2);

		Pair<Integer, Apple> a1 = new Pair<Integer, Apple>(1, new Apple(10));
		Pair<Integer, Apple> a2 = new Pair<Integer, Apple>(1, new Apple(10));
		// boolean result = Utill.<Integer, Apple>compare(a1, a2);

		Pair<Tv, Car> c1 = new Pair<Tv, Car>(new Tv(20), new Car(4));
		Pair<Tv, Car> c2 = new Pair<Tv, Car>(new Tv(20), new Car(4));
		boolean result = Utill.<Tv, Car>compare(c1, c2);

		if (result) {
			System.out.println("���� ���� ��ü �̴�.");
		} else {
			System.out.println("���� ���� ��ü �ƴϴ�.");
		}
		// Quiz
		// Tv Car Ŭ������ ���� compare()�� ���� ���� ���� ��ü�� ������.

	}

}

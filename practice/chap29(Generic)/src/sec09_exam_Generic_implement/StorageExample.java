package sec09_exam_Generic_implement;

public class StorageExample {

	public static void main(String[] args) {
		Storage<String> st = new StorageImp<>(10);

		// 제네릭 인터페이스의 참조변수로 구현클래스의 메서드 호출
		for (int i = 0; i < 10; i++) {
			st.add("마이카 -" + (i + 1), i);

		}
		for (int i = 0; i < 10; i++) {
			System.out.println(st.get(i));

		}

		StorageImp<String> st1 = new StorageImp<>(10);
		int i = 0;
		for (Object str : st1.getT()) {
			st1.add((String) "슈퍼카-" + (i + 1), i++);
		}

		for (Object str : st1.getT()) {
			System.out.println((String) str);
		}

	}

}

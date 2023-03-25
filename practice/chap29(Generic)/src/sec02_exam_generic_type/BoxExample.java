package sec02_exam_generic_type;

public class BoxExample {

	public static void main(String[] args) {
		
		/*Box<T>에서 T는 String이다 즉 Box클래스는 제네릭 타입의 클래스이며 
		 * 무조건 값을 값을 String으로만 지정해야한다.(컴파일러에게 알리는 것)
		 * -타입 변화을 제거하면서 아울러 현업에서는 데이터의 통일화를 한다.
		 */
		Box<String> box1 = new Box<String>();
		box1.setT("홍길동");
		String name = box1.getT();
		System.out.println(name);
		
		Box<Integer> box2 = new Box<Integer>();
		box2.setT(new Integer(100));
		//box2.setT(100); //자동 박싱
		int num = box2.getT(); //언 박싱 코드
		System.out.println(num);
		
		Box<Apple> box3 = new Box<Apple>();
		box3.setT(new Apple());
		Apple a = box3.getT();
		System.out.println(a); //toString 오버라이딩 해놓음
	}

}

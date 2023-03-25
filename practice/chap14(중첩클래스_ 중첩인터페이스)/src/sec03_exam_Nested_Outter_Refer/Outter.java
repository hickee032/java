package sec03_exam_Nested_Outter_Refer;

public class Outter {

	// 외부 클래스(Outter)멤버
	String field = "Outter_field";

	public void method() {
		System.out.println("외부 클래스 메서드 호출");
	}

	class Nested {
		String field = "Nested_field";

		public void method() {
			System.out.println("내부 클래스 메서드 호출");
		}

		public void print() {

			// 외부 클래스 멤버 접근 방법 (외부 클래스 명 . this . 멤버)
			System.out.println(Outter.this.field);
			Outter.this.method();

			// 내부 클래스 멤버 접근 방법 (this . 멤버)
			System.out.println(this.field);
			this.method();
		}
	}

}

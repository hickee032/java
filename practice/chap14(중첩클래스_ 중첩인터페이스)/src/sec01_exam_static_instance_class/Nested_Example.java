package sec01_exam_static_instance_class;

public class Nested_Example {

	// 인스턴스 멤버 클래스
	class instanceClass {
		int iv = 100;
		// static int cv = 500;

		/*
		 * Nested_Example가 생성되어야만 접근할수 있는 데 static 인스턴스 생성이되지않아도 접근해야한다. 앞 뒤가 맞지 않는 다.
		 */
		public instanceClass() {

			System.out.println("인스턴스 클래스 생성자 호출");
		}

		void instance_Method() {
			System.out.println("인스턴스 클래스 Method() 호출");
		}
	}

	static class staticClass {
		public staticClass() {
			System.out.println("static클래스 생성자 호출");
		}

		static int cv = 300;
		int iv = 15; // 정적 멤버 클래스 라고 해도 인스턴스 필드를 가질수 있다.
						// 정적 클래스도 생성자가 존재하므로 인스턴스를 생성할수 있으므로
						// 인스턴스 필드나 메서드가 존재할수 있다.
	}

	public void Method() {
		class LocalClass {

			int iv = 300;
			// static int cv = 500;

			static final int LOCAL = 1000;

			public LocalClass() {
				System.out.println("로컬클래스 생성자 호출");
			}

			void method() {
				System.out.println("로컬클래스 메서드 호출" + this.iv);
			}
		}

		LocalClass lc = new LocalClass();
		lc.method();

	}

	public static void main(String[] args) {
		// 외부 클래스 생성
		Nested_Example ne = new Nested_Example();
		// 인스턴스 멤버 클래스 생성
		Nested_Example.instanceClass ic = ne.new instanceClass();

		System.out.println(ic.iv);
		ic.instance_Method();

		Nested_Example.staticClass sc = new staticClass();
		System.out.println(Nested_Example.staticClass.cv);
		System.out.println(sc.iv);

	}
}

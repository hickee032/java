package sec02_exam_Nested_Class;

public class A {
	// 생성자
	public A() {
		System.out.println("A 객체 생성");
		B b = new B(); // 이게 왜 가능할까..? *멤버* 클래스 이다.
					   // 멤버들은 다 선언이 가능하다.
		b.a = 20;
		b.method1();
	}

	class B {
		int a = 10;

		// static int b = 20; static선언불가
		public B() {
			System.out.println("B 객체생성");
		}

		void method1() {
			System.out.println("B 클래스의 멤버메서드 method1 호출");
		}
		// static void methid2(){}; // 에러발생
	}

	static class C {

		public C() {
			System.out.println("static C 객체 생성");

		}

		int b = 10;
		static int c = 20;

		void method2() {
			System.out.println("static C클래스 멤버메서드 method2() 호출");

		}

		static void method3() {
			System.out.println("static C클래스 static 멤버메서드 method3() 호출");
		}
	}

	void method() {

		class D {
			public D() {
				System.out.println("D 객체 생성");
			}

			int e = 30;

			// static int f = 30;
			void localmethod() {
				System.out.println("로컬 클래스 D클래스의 멤버 메서드 mehtod 호출");
				System.out.println(e);
			}
		}
		D d = new D();
		d.e = 50;
		d.localmethod();
	}
}

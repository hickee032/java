package sec01.exam01_no_arg_no_return;

public class MyFuntionalInterfaceExample {
	public static void main(String[] args) {

		MyFuntionalInterface fi1 = new MyFuntionalInterface() {

			@Override
			public void method() {
				String str = "직접 익명구현객체 생성함";
				System.out.println(str);

			}
		};
		fi1.method();
		// 람다식을 이용해서 익명구현객체를 생성하고 있다.
		// 매개변수가 없을때()생략 불가인걸 알고있다.
		// {}안에는 추상메서드의 재정의 부 -즉 구현부가 들어가야한다.

		// 람다식

		fi1 = () -> {
			String str = "람다식 익명구현객체 생성함";
			System.out.println(str);
		};
		fi1.method();
		// 실행문이 1개 일 경우에는 {}생략이 가능하다.
		fi1 = () -> System.out.println("약식 람다식 익명구현객체 생성함");
		fi1.method();

		// 결론 익명구현객체를 생성할때 코드의 절감으로 람다식을 사용할수있다.
	}

}

package sce01.exam02_arugment;

public class MyFuntionalInterfaceExample {

	public static void main(String[] args) {
		MyFuntionalInterface fi = null;
		fi = (x) -> {
			int result = x * 5;
			System.out.println("result : " + result);
		};
		fi.method(10);

		// 약식표현
		// 매개변수가 하나일 경우에는()생략
		// 아울러 실행문 하난일경우도 {} 생략가능
		fi = x -> System.out.println("result : " + x * 5);
		fi.method(10);
	}

}

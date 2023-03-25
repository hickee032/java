package sec01.exam03_return;

public class MyFuntionalInterfaceExample {

	public static void main(String[] args) {

		MyFuntionalInterface fi = null;

		// fi = x,y,->{}; //매개변수가 2개일경우에는 ()생략 불가하다.

		fi = (x, y) -> {
			int result = x + y;
			return result;
		};

		int result = fi.method(10, 100);
		System.out.println("매개변수가 2개 그리고 리턴값이 있는 함수적 인터페이스를 구현한 값"+result);

		//약식 표현
		fi=(x,y) -> {return x+y;};
		System.out.println("매개변수가 2개 그리고 리턴값이 있는 함수적 인터페이스를 구현한 값"+fi.method(50, 100));
		
		fi = (x,y)->x+y;
		System.out.println("매개변수가 2개 그리고 리턴값이 있는 함수적 인터페이스를 구현한 값"+fi.method(150, 100));
		
		fi = (x,y)->sum(x,y);
		System.out.println("매개변수가 2개 그리고 리턴값이 있는 함수적 인터페이스를 구현한 값"+fi.method(350, 100));
	}

	public static int sum(int x, int y) {
		return x + y;

	}

}

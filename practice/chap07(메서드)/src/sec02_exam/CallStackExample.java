package sec02_exam;

public class CallStackExample {

	public static void main(String[] args) {
		
		int a = 0;
		
		System.out.println("main() 실행");
		CallStackExample.firstMethod();
		System.out.println("main() 종료");
	}

	//static은 static만 부를수있다.
	public static void firstMethod() {
		System.out.println("firstMethod() 실행");
		secondMethod();
		System.out.println("firstMethod() 종료");
		
	}
	
	public static void secondMethod() {
		System.out.println("secondMethod() 실행");
		System.out.println("secondMethod() 종료");
	}
}

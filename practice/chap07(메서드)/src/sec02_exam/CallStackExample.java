package sec02_exam;

public class CallStackExample {

	public static void main(String[] args) {
		
		int a = 0;
		
		System.out.println("main() ����");
		CallStackExample.firstMethod();
		System.out.println("main() ����");
	}

	//static�� static�� �θ����ִ�.
	public static void firstMethod() {
		System.out.println("firstMethod() ����");
		secondMethod();
		System.out.println("firstMethod() ����");
		
	}
	
	public static void secondMethod() {
		System.out.println("secondMethod() ����");
		System.out.println("secondMethod() ����");
	}
}

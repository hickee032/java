package sec04_exam;

public class Member {
	
	int iv = 100;
	
	static int cv = 200;
	
	//인스턴스 메서드
	public void instanceMethod() {
		System.out.println("instance 멤버변수 호출" + this.iv);
		System.out.println("instanceMethod()호출");
	}	
	public static void staticMethod() {
		System.out.println("static 멤버변수 호출" + Member.cv);
		System.out.println("staticMethod()호출");
	}

}

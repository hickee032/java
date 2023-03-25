package sec01_exam;

public class MyMath {
	
	//인스턴스 메서드
	public long add(long a,long b) {
		return a+b;
	}
	
	public long substract(long a,long b) {
		return a-b;
	}
	
	//정적 (static) 메서드, 클래스 메서드
	public static long multhply(long a,long b) {
		return a*b;
	}
	
	public static long divide(long a,long b) {
		return a/b;
	}
	
	public String studyJava() {
		//지역변수 로컬변수 static을 절대 붙일수 없다
		//static int = 0;
		
		return "Java 수업";
	}
	


}

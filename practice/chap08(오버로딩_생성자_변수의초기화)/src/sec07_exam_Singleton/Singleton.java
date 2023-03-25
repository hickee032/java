package sec07_exam_Singleton;

public class Singleton {
	
	//접근제어자의 범위가 가장 좁은  private 이기에 외부에서 접근을 할수 없다.
	private static Singleton sl = new Singleton(); 
	
	//싱글 톤 패턴은 그 핵심이 하나의 인스턴스 공유하는 것이다. 하여 생성자에  private 를 통해 외부에서 싱글톤 객체 생성을 막는 다.
	private Singleton() {
		System.out.println("생성자 호출");
	}
	
	//getInstance()하는 역할은
	//공유 변수의 주소만 리턴해주므로 싱글톤 객체를 사용하게끔 해준다.
	public static Singleton getInstance() {
		return sl;
	}

}

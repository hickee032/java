package sec07_exam_Singleton;

public class SingletonExample {

	public static void main(String[] args) {
		
		//싱글 톤이라는 클래스의 기본생성자를 프라이빗으로 설정 했기 때문에 기본생성자 호출이 안된다.
		//Singleton s1 = new Singleton();
		
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();

		if(s1==s2) {
			System.out.println("같은 주소 싱글톤");
			System.out.print("s1의 주소   "+s1);
			System.out.println();
			System.out.print("s2의 주소   "+s2);
		}
		else {
			System.out.println("다른 주소 싱글톤");
			System.out.print("s1의 주소   "+s1);
			System.out.println();
			System.out.print("s2의 주소   "+s2);
		}
	}

}

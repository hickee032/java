package sec01_Class;

public class ClassExample {

	public static void main(String[] args) {
		
		//객체로 부터 클래스 정보를 얻는 방법 Object클래스의 getclass()이용
		
		System.out.println("1. 생성한 객체로 부터 클래스의 정보를 얻는 방법");
		
		Car car = new Car();
		Class cls1 = car.getClass();
		
		//Class<? extends Car> cls1 = car.getClass();	
		//cls1.stop(); -->cls1의 근본은 Class다 근본에 stop()가 없다.
		
		System.out.println(cls1.getName()); // 패키지명 + 클래스명
		System.out.println(cls1.getSimpleName()); // 클래스 명
		
		
		System.out.println("2. 문자열로부터 생성된 클래스의 정보를 얻는 방법");
		try {
			Class cls2 = Class.forName("sec01_Class.Car");
			
			System.out.println(cls2.getName()); // 패키지명 + 클래스명
			System.out.println(cls2.getSimpleName()); // 클래스 명
		} catch (ClassNotFoundException e) {
			System.out.println("존재하지 않는 클래스입니다.");
			e.printStackTrace();
		}
		
		

	}

}

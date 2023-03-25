package sec02_exam;

public class ReferranceReturnClass {

	public static void main(String[] args) {

		Data d = new Data();
		d.x = 10;
		
		//copy()메서드는 매개변수로 data타입의 인스턴스주소를 던지고 있다
		//아울러 리턴을 받는데 data클래스 타입으로 받고있다.
		Data result = ReferranceReturnClass.copy(d);
		
		System.out.println("메인 메서드에서 d 주소값 : "+result);
		System.out.println("메인 메서드에서 copy()메서드를 호출하고 리턴 받은 주소값 : "+result);
		System.out.println("d.x :" + d.x);
		System.out.println("result.x :" + result.x);
	}
	
	public static Data copy(Data d) {
		Data d2 = new Data();
			d2.x=d.x;
			System.out.println("copy 메서드에서 만든 d2 : "+d2);		
		
			//리턴 타입 데이터 클래스 타입이므로 리턴 값은 반드시 데이터 클래스의 인스턴스에 주소가 된다. 
		return d2;
	}

}

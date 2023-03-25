package sec02_Exam;

public class Tv_Example02_1 {

	public static void main(String[] args) {

		//new 라는 연산자가 오면 아무 이유 없이 힙에다가 클래스의 크기 만큼 메모리를 할당한다.
		
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		System.out.println(t1.channel);
		System.out.println(t2.channel);
		
		System.out.println("t1의 주소 :" +t1.toString());
		System.out.println("t1의 주소 :" +t2.toString());
		
		t1=t2;
		
			
	
	}

}

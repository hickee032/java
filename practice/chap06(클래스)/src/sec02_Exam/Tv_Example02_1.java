package sec02_Exam;

public class Tv_Example02_1 {

	public static void main(String[] args) {

		//new ��� �����ڰ� ���� �ƹ� ���� ���� �����ٰ� Ŭ������ ũ�� ��ŭ �޸𸮸� �Ҵ��Ѵ�.
		
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		System.out.println(t1.channel);
		System.out.println(t2.channel);
		
		System.out.println("t1�� �ּ� :" +t1.toString());
		System.out.println("t1�� �ּ� :" +t2.toString());
		
		t1=t2;
		
			
	
	}

}

package sec02_Exam;

public class Tv_Example02 {

	public static void main(String[] args) {

		
		int i = 7;
		Tv t1 = null; 
		t1 = new Tv();
		
		Tv t2 = null; 
		t2 = new Tv();
		
		t1=t2;//t2�� �ּҰ� ����
		
		System.out.println("t1.channel �� :"+t1.channel);
		System.out.println("t2.channel �� :"+t2.channel);
		
		t1.channel=i;
		System.out.println("t1.channel �� ��" + i +"�� ����");
		
		System.out.println("t1.channel �� :"+t1.channel);
		System.out.println("t2.channel �� :"+t2.channel);

	}

}

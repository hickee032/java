package sec01_exam;

public class MyMathExample {

	public static void main(String[] args) {

		MyMath mm = new MyMath();
		
		//�ν��Ͻ��޼��� ȣ���̹Ƿ� ���������� ������ �����ϴ�
		long result1 = mm.add(5L, 3L);
		long result2 = mm.substract(5L, 3L);
		
		
		//�����޼��� static�޼���� Ŭ������.static�޼�������� ���� �ݵ��
		long result3 = MyMath.multhply(5L, 3L);
		double result4 = MyMath.divide(5L, 3L);
		
		System.out.println("add = " + result1);
		System.out.println("substract = " + result2);
		System.out.println("multhply = " + result3);
		System.out.println("divide = " + result4);
		System.out.println(mm.studyJava());
		
	}

}

package sec03_exam_Nested_Outter_Refer;

public class OutterExample {

	public static void main(String[] args) {
		//�ܺ� Ŭ���� �ν��Ͻ� ����
		Outter outter = new Outter();
		
		//���� Ŭ���� �ν��Ͻ� ����
		Outter.Nested nested = outter.new Nested();
		
		nested.print();

	}

}

package sec04_exam_Car;

public class CarExample {

	public static void main(String[] args) {
		
		Car c1 = new Car(); 
		
		//�⺻�����ڸ� ȣ���ߴµ� �� �ʱ�ȭ�� �Ǿ ����̵ǳ�?
		//�⺻�����ڰ� this()�� ���� �Ű������� 3���� �����ڸ� ȣ�� �ϰ��ִ�.
		//this("white", "auto", 8);
		//�ڵ��� ���뼺.
		
		Car c2 = new Car("blue");//�Ű������� 1���� ������
		Car c3 = new Car("Green","����");//�Ű������� 2���� ������
		
		System.out.println(c1.toString()); //���⼭ ������ �޼���� �����ϱ�.tostring
		System.out.println(c2);
		System.out.println(c3);
	}
}

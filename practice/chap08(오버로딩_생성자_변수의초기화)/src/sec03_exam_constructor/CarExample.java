package sec03_exam_constructor;

public class CarExample {

	public static void main(String[] args) {
		//�����ڴ� ������ �������� ����. void�� �����������  ���ϰ��� ����.
		//this() ���� Ŭ���� �� - ����Ʈ��
		Car c = new Car(); //�⺻������
		
		c.color = "white";
		c.door = 5;
		c.gearType = "����";
		System.out.println(c);
		
		Car c1 = new Car("black", "�ڵ�", 4);//�Ű������� �ִ� ������
		System.out.println(c1);
	}

}

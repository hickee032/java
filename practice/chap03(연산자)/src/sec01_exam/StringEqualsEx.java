package sec01_exam;

public class StringEqualsEx {

	public static void main(String[] args) {
		
		Object obj1 = new Object();
		Object obj2 = new Object();
		
		//Object�� ������������ ==����� equals()�� ���� ����(�ּҰ� ��)�� �Ѵ�.
		System.out.println(obj1 == obj2);
		System.out.println(obj1.equals(obj2));
		System.out.println();

		String strVar1 = "�Ź�ö";
		String strVar2 = "�Ź�ö";
		//���ο� ��ü ���� (�ּҰ� �޶���)
		String strVar3 = new String("�Ź�ö");
		
		//�ּҰ� �� (�ڹٿ����� String�� ���ͷ� ���� ���� ��� ���� ���� ������)
		
		System.out.println(strVar1 == strVar2);
		System.out.println(strVar1 == strVar3); //�ּҰ� ��
		System.out.println();
		
		//���� ������ �� (equals�� �񱳴��� ���� ������ ��)
		System.out.println(strVar1.equals(strVar2));
		System.out.println(strVar1.equals(strVar3)); //���� ������ ��

	}

}

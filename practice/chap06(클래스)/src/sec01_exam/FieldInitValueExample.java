package sec01_exam;

public class FieldInitValueExample {

	public static void main(String[] args) {

		//�Ʒ� �ڵ�� FieldInitValue�ν��Ͻ��� �ϳ� heap�� ����� ��
		//fiv�� �� �ν��Ͻ��� �ּҸ� �˰��ִ� �Ͽ� �� FieldInitValueŬ������
		//����鿡�� ���� �����ϴ�
			FieldInitValue fiv = new FieldInitValue();
			
			System.out.println("�⺻�� ����");
			System.out.println("byteField: " + fiv.byteField);
			System.out.println("shortField: " + fiv.shortField);
			System.out.println("intField: " + fiv.intField);
			System.out.println("longField: " + fiv.longField);
			System.out.println("booleanField: " + fiv.booleanField);
			
			//char�� ���� ����
			
			System.out.println("charFileld" + fiv.charField);
			System.out.println("floatFileld" + fiv.floatField);
			System.out.println("doubleFileld" + fiv.doubleField );
			System.out.println();
			
			
			System.out.println("������ ����");
			System.out.println("arrField: " + fiv.arrField);
			System.out.println("referenceField" + fiv.referanceField);
		/*
		 * �ν��Ͻ� ������ ����� �ϸ� �ν��Ͻ��� �ּҰ� ����� �ȴ� object�� ��� �ޱ� ������ ��¹��� ���������� ������ ��
		 * objectŬ������ toString
		 */
			System.out.println("Class referanceValiable :" +fiv);

			FieldInitValue fiv2 = new FieldInitValue();
			
			System.out.println("�⺻�� ����");
			System.out.println("byteField: " + fiv2.byteField);
			
			System.out.println("������ ����");
			System.out.println("arrField: " + fiv2.arrField);
			
			System.out.println(fiv);
			
			
	}

}

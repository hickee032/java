package sec06_exam_initializeblock;

public class Product {

	static int count = 0; //������ �ν��Ͻ� �� ����
	int serialNO; //�ν��Ͻ� ���� ��ȣ

	{
		++count;
		serialNO = count;
	}

	//�⺻������ ���� ����
	public Product() {

	}
}

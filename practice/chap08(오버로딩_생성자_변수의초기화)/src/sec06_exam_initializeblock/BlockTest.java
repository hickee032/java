package sec06_exam_initializeblock;

//�ʱ�ȭ �� �׽�Ʈ Ŭ����
public class BlockTest {
	
	//static�ʱ�ȭ ���� ������ �������� ���� ���� �޸𸮿� �ö󰣴�.
	static {
		System.out.println("���� �ʱ�ȭ �� ȣ��~");
	}
	//�ν��Ͻ�  �ʱ�ȭ �� �ν��Ͻ� �����Ҷ����� ȣ��
	{
		System.out.println("�ν��Ͻ� �ʱ�ȭ �� ȣ��~");
	}
	
	public BlockTest() {
		System.out.println("������ ȣ��~");
		
	}

	/*
	 * �ʱ�ȭ ���� Ŭ���� �ʱ�ȭ 
	 * �⺻��>����� �ʱ�ȭ>Ŭ���� �ʱ�ȭ �� 
	 * �ν��Ͻ� �ʱ�ȭ (���������� �� ������� �ʴ� ��.OCJP����)
	 * �⺻��>����� �ʱ�ȭ>�ν��Ͻ� �ʱ�ȭ>������
	 */
	
	public static void main(String[] args) {
		
		BlockTest bt = new BlockTest();
		
	}
	

}

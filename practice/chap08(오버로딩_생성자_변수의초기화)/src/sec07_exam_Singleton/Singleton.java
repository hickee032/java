package sec07_exam_Singleton;

public class Singleton {
	
	//������������ ������ ���� ����  private �̱⿡ �ܺο��� ������ �Ҽ� ����.
	private static Singleton sl = new Singleton(); 
	
	//�̱� �� ������ �� �ٽ��� �ϳ��� �ν��Ͻ� �����ϴ� ���̴�. �Ͽ� �����ڿ�  private �� ���� �ܺο��� �̱��� ��ü ������ ���� ��.
	private Singleton() {
		System.out.println("������ ȣ��");
	}
	
	//getInstance()�ϴ� ������
	//���� ������ �ּҸ� �������ֹǷ� �̱��� ��ü�� ����ϰԲ� ���ش�.
	public static Singleton getInstance() {
		return sl;
	}

}

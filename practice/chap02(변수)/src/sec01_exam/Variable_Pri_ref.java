package sec01_exam;

public class Variable_Pri_ref {

	public static void main(String[] args) {
		//�⺻�� ����
		int a;
		a = 10;
		
		Object obj = new Object();
		System.out.println(obj.toString());//obj�� �ּ� ���
		//toString�� ���� �ʾƵ� ������. Object�� ��� Ŭ������ �ֻ�Ŭ����  (obj.toString)�� ������Ʈ Ŭ����(obj)�� �ּҸ� ��Ÿ����.
		
		//������ ����
		//�ּҰ��� ������ �ִ�. �Ͽ� null�� �ʱ�ȭ�� �����ϴ�.
		String str = null; //str�� �ּ� ����? null ��������
		str = new String("�ڹ�"); //string�� �ּ� ���� (str)
		//str�� '�ڹ�'��� �ּҸ� �����Ѵ� ���â�� �ּҰ� �ƴ� �ڹٰ� �ߴ� ������ �������̵�(�����) ������
		//���� toString()�� �����Ұ�� �ֱٿ� ���� ���� ���� ����� ���� �Ӽ�(?)�� ���ϰ� �ȴ�.
		
		//�ڹٷ� ��µǴ°� Ȯ���Ҽ� �ִ�.
		System.out.println(str);
		System.out.println("a�� �� : " + a);
		System.out.println("���� �ڹ�!");
		
		String str2 = null;
		System.out.println(str2);
		//str2�� �ּҰ� null�̹Ƿ� null�� ��µȴ�.
	}
}

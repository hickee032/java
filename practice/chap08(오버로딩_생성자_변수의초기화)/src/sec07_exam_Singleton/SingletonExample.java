package sec07_exam_Singleton;

public class SingletonExample {

	public static void main(String[] args) {
		
		//�̱� ���̶�� Ŭ������ �⺻�����ڸ� �����̺����� ���� �߱� ������ �⺻������ ȣ���� �ȵȴ�.
		//Singleton s1 = new Singleton();
		
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();

		if(s1==s2) {
			System.out.println("���� �ּ� �̱���");
			System.out.print("s1�� �ּ�   "+s1);
			System.out.println();
			System.out.print("s2�� �ּ�   "+s2);
		}
		else {
			System.out.println("�ٸ� �ּ� �̱���");
			System.out.print("s1�� �ּ�   "+s1);
			System.out.println();
			System.out.print("s2�� �ּ�   "+s2);
		}
	}

}

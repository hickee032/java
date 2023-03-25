package sec01_Class;

public class ClassExample {

	public static void main(String[] args) {
		
		//��ü�� ���� Ŭ���� ������ ��� ��� ObjectŬ������ getclass()�̿�
		
		System.out.println("1. ������ ��ü�� ���� Ŭ������ ������ ��� ���");
		
		Car car = new Car();
		Class cls1 = car.getClass();
		
		//Class<? extends Car> cls1 = car.getClass();	
		//cls1.stop(); -->cls1�� �ٺ��� Class�� �ٺ��� stop()�� ����.
		
		System.out.println(cls1.getName()); // ��Ű���� + Ŭ������
		System.out.println(cls1.getSimpleName()); // Ŭ���� ��
		
		
		System.out.println("2. ���ڿ��κ��� ������ Ŭ������ ������ ��� ���");
		try {
			Class cls2 = Class.forName("sec01_Class.Car");
			
			System.out.println(cls2.getName()); // ��Ű���� + Ŭ������
			System.out.println(cls2.getSimpleName()); // Ŭ���� ��
		} catch (ClassNotFoundException e) {
			System.out.println("�������� �ʴ� Ŭ�����Դϴ�.");
			e.printStackTrace();
		}
		
		

	}

}

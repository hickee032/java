package sec04_exam;

public class Member {
	
	int iv = 100;
	
	static int cv = 200;
	
	//�ν��Ͻ� �޼���
	public void instanceMethod() {
		System.out.println("instance ������� ȣ��" + this.iv);
		System.out.println("instanceMethod()ȣ��");
	}	
	public static void staticMethod() {
		System.out.println("static ������� ȣ��" + Member.cv);
		System.out.println("staticMethod()ȣ��");
	}

}

package sec_verify02;

public class OuterExample {

	public static void main(String[] args) {
		
		System.out.print("�ܺ�Ŭ������ �������� �ʰ�, �������Ŭ����(Inner)�� ���� ��� CV�� : ");
		System.out.println(Outer.Inner.cv);
		
		Outer.Inner i = new Outer.Inner();
		
		System.out.print("�ܺ�Ŭ������ �����ϰ�, �������Ŭ����(Inner)�� �ν��Ͻ� ��� IV�� : ");
		System.out.println(i.iv);
		
		
		

	}

}

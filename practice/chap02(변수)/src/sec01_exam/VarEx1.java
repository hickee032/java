package sec01_exam;

public class VarEx1 {
	
	public static void main(String[] args) {
		
		int year = 0;
		int age = 14;
		boolean t = true;
		
		System.out.println("year =" + year + " age =" + age);
		System.out.println(year);
		//������ �����ϰ� �����, �����Ѵ�.
		System.out.println(age + " " + "����ȯ" +" " + t);
		System.out.println();
		
		year = age +2000; //���� age���� 2000�� ���ؼ� ���� year�� ����
		age = age + 1; //���� age�� ����� ���� 1������ĭ��.
		
		System.out.println(year);
		System.out.println(age);		
	}
}

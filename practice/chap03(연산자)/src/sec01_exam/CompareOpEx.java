package sec01_exam;

public class CompareOpEx {

	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 10;
		
		boolean result1 = (num1 == num2); //boolean �� true false ���� �ΰ� ��Ÿ����.
		boolean result2 = (num1 != num2); //���� ���� ������ true�� ������ false�� �����Ѵ�.
		boolean result3 = (num1 <= num2); //num2�� num1���� ũ�ų� ������ true�� �����Ѵ�.
		
		System.out.println("result1=" + result1); //��� â�� ��Ÿ����.
		System.out.println("result2=" + result2);
		System.out.println("result3=" + result3);
		
		char char1 = 'A';
		char char2 = 'B';
		
		//�ᱹ ���⼭�� �񱳴� �ƽ�Ű �ڵ� ���� ���ΰ��̴�.
		
		boolean result4 = (char1 < char2);
		System.out.println("result4=" + result4);
		
		//���ڸ� �ƽ�Ű �ڵ� ������ ������ ��
		
		System.out.println((int)char1);
		System.out.println((int)char2);
	}
}

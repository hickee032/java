package sec01_exam;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
	
		//�Է½�Ʈ���� ����ϰڴٰ� ScannerŬ������ ������.
		Scanner scanner = new Scanner(System.in);
		System.out.print("���ڸ� ������ �ϳ� �Է����ּ���.>");
		//num���ٰ� 4����Ʈ �޸� ������ ���� (int��)�� �ްڴ�.
		int num = scanner.nextInt();
		System.out.println("num = " + num);
		
		//dnum���ٰ� 8��Ʈ �޸� ������ �Ǽ� (double)���� �ްڴ�
		System.out.print("���ڸ� �Ǽ��� �ϳ� �Է����ּ���.>");
		double dnum = scanner.nextDouble();
		System.out.println("dnum = " + dnum);
		scanner.nextLine();
		System.out.print("���ϴ� ���ڸ� �Է��ϼ���>");
		//����Ű�� �Է��Ҷ������� ���ڿ��� �������ִ� �޼���
		String input = scanner.nextLine();
		//�Է¹��� ���ڿ��� ���ڷ� ��ȯ
		int num1 = Integer.parseInt(input);
		System.out.println("String���� �Է��� ���� : " +input);
		System.out.println(num1);
		//scanner.nextLine();
		
		System.out.print("Line() :");
		//next�� �Է��� ������ ������ ������ �������������� �Է��� ���� �޴� ��.
		String input1 = scanner.next();
		System.out.println("input1�� ���� : " + input1);
		//���ҽ� ���� 
		scanner.close();
	}
}

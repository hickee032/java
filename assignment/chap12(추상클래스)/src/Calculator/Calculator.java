package Calculator;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		boolean run = true;

		while (run) {
			
			System.out.println("�� ������ �����ڸ� �Է��Ͻÿ�.");
			System.out.print("(���Ḧ ���Ͻø� -1�� �Է����ּ���)>>");

			double a = scan.nextDouble();
			double b = scan.nextDouble();
			String key = scan.nextLine();
			
			System.out.println(a+","+b+","+key);  //Ȯ�ο�
			
			if (key == "+") {
				System.out.println(1);
				
			}
			if (key == "-1") {
				System.out.println("���α׷� ����");
			}

			

		}
	}

}

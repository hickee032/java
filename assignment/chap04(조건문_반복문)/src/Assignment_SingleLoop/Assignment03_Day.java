package Assignment_SingleLoop;

import java.util.Scanner;

public class Assignment03_Day {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		char sel;
		
		System.out.println("M,m ����, A,a ����, E,e ����");
		System.out.println("�Է�  : ");
		sel = scan.next().charAt(1);
		
		//switch case break�� ��Ʈ��
		switch (sel) {
		case 'M':
		case 'm':
			System.out.println("����");
			break;
			
		case 'A':
		case 'a':
			System.out.println("����");
			break;
			
		case 'E':
		case 'e':
			System.out.println("����");
			break;		
		}
		scan.close();
	}

}

package Assignment_SingleLoop;

import java.util.Scanner;

public class Assignment02_Season {

	public static void main(String[] args) {
		
		int month = 0; //�ʱ�ȭ
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("���� �Է��ϼ���  : "); 

		month = scan.nextInt(); //�Է��� �޴´�
		
		switch (month) {
		case 3:
		case 4:
		case 5:
		
		System.out.println(month + "���� ���Դϴ�.");
		break;
		
		case 6:
		case 7:
		case 8:
		
			System.out.println(month + "���� �����Դϴ�.");
			break;
			
		case 9:
		case 10:
		case 11:
		
			System.out.println(month + "���� �����Դϴ�.");
			break;
			
		case 12:
		case 1:
		case 2:
		
			System.out.println(month + "���� �ܿ��Դϴ�.");
			break;
			}
		
		if ((3<=month)&&(month<=5)) {
			System.out.println(month + "���� ���Դϴ�.");
			}
		
		else if	((6<=month)&&(month<=8)) {
			System.out.println(month + "���� �����Դϴ�.");
			}
		
		else if	((9<=month)&&(month<=11)) {
			System.out.println(month + "���� �����Դϴ�.");
			}
		else { System.out.println(month + "���� �ܿ��Դϴ�.");
		
		}
		scan.close();	
	}

}

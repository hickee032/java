package Assignment_SingleLoop;

import java.util.Scanner;

public class Assignment06_Position {

	public static void main(String[] args) {
		
		int position = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("������ �Ʒ��� �����ϴ�.\n 1. �� \n 2. ���� \n 3. ���� \n 4. ���� \n 5. �븮 \n 6. ��� \n");
		
		System.out.print("�˰���� ���� �� �ش������� �Է��ϼ��� : ");
		
		position = scanner.nextInt();
		
		if (position == 1)     {
			
			System.out.println("�������� 1000����/�� �Դϴ�.");
		}
		else if (position == 2) {
			
			System.out.println("���������� 800����/�� �Դϴ�.");
		}
		else if (position == 3) {
			
			System.out.println("���������� 600����/�� �Դϴ�.");
		}
		else if (position == 4) {
			
			System.out.println("���������� 400����/�� �Դϴ�.");
		}
		else if (position == 5) {
			
			System.out.println("�븮������ 250����/�� �Դϴ�.");
		}
			else {		
			System.out.println("��������� 180����/�� �Դϴ�.");
		}
		
		switch(position) {
		case 1:
			System.out.println("�������� 1000����/�� �Դϴ�.");
			break;
			
		case 2:
			System.out.println("���������� 800����/�� �Դϴ�.");
			break;
			
		case 3:
			System.out.println("���������� 600����/�� �Դϴ�.");
			break;
			
		case 4:
			System.out.println("���������� 400����/�� �Դϴ�.");
			break;
			
		case 5:
			System.out.println("�븮������ 250����/�� �Դϴ�.");
			break;
			
		case 6:
			System.out.println("��������� 180����/�� �Դϴ�.");
			break;
		}
		
		scanner.close();

	}

}

package Assignment_SingleLoop;

import java.util.Scanner;

public class Assignment05_Score {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		int tot	= 0;	
		int	subject1 = 0;	
		int	subject2 = 0;	
		int	subject3 = 0;
		double avg = 0.0;
		 
		
		System.out.print("������ ������ �Է��Ͻÿ� : ");
		subject1 = scan.nextInt();
		subject2 = scan.nextInt();
		subject3 = scan.nextInt();
		
		tot = (subject1+subject2+subject3);
		avg = (double)(tot)/3;
		System.out.printf("����� ��� : "+ "%.1f",avg);
		
			if (avg >= 90) {
			
		    char grade = 'A';
			System.out.print("\t ����� ���� : " + grade );
		}
		
		else if (avg >= 80) {
			char grade = 'B';
			System.out.print("\t ����� ���� : " + grade );	
		}
		else if (avg >= 70) {
			char grade = 'C';
			System.out.print("\t ����� ���� : " + grade );	
		}
		else if (avg >= 60) {
			char grade = 'D';
			System.out.print("\t ����� ���� : " + grade );	
		}
		else {
			char grade = 'F';
			System.out.print("\t ����� ���� : " + grade );	
		}
		scan.close();

	}

}

package Assignment_SingleLoop;

import java.util.Scanner;

public class Assignment02_Season {

	public static void main(String[] args) {
		
		int month = 0; //초기화
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("월을 입력하세요  : "); 

		month = scan.nextInt(); //입력을 받는다
		
		switch (month) {
		case 3:
		case 4:
		case 5:
		
		System.out.println(month + "월은 봄입니다.");
		break;
		
		case 6:
		case 7:
		case 8:
		
			System.out.println(month + "월은 여름입니다.");
			break;
			
		case 9:
		case 10:
		case 11:
		
			System.out.println(month + "월은 가을입니다.");
			break;
			
		case 12:
		case 1:
		case 2:
		
			System.out.println(month + "월은 겨울입니다.");
			break;
			}
		
		if ((3<=month)&&(month<=5)) {
			System.out.println(month + "월은 봄입니다.");
			}
		
		else if	((6<=month)&&(month<=8)) {
			System.out.println(month + "월은 여름입니다.");
			}
		
		else if	((9<=month)&&(month<=11)) {
			System.out.println(month + "월은 가을입니다.");
			}
		else { System.out.println(month + "월은 겨울입니다.");
		
		}
		scan.close();	
	}

}

package Assignment_SingleLoop;

import java.util.Scanner;

public class Assignment03_Day {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		char sel;
		
		System.out.println("M,m 오전, A,a 오후, E,e 저녁");
		System.out.println("입력  : ");
		sel = scan.next().charAt(1);
		
		//switch case break는 세트다
		switch (sel) {
		case 'M':
		case 'm':
			System.out.println("오전");
			break;
			
		case 'A':
		case 'a':
			System.out.println("오후");
			break;
			
		case 'E':
		case 'e':
			System.out.println("저녁");
			break;		
		}
		scan.close();
	}

}

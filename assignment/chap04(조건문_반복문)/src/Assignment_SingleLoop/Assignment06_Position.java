package Assignment_SingleLoop;

import java.util.Scanner;

public class Assignment06_Position {

	public static void main(String[] args) {
		
		int position = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("직급은 아래와 같습니다.\n 1. 상무 \n 2. 부장 \n 3. 차장 \n 4. 과장 \n 5. 대리 \n 6. 사원 \n");
		
		System.out.print("알고싶은 월급 중 해당직급을 입력하세요 : ");
		
		position = scanner.nextInt();
		
		if (position == 1)     {
			
			System.out.println("상무직급은 1000만원/월 입니다.");
		}
		else if (position == 2) {
			
			System.out.println("부장직급은 800만원/월 입니다.");
		}
		else if (position == 3) {
			
			System.out.println("차장직급은 600만원/월 입니다.");
		}
		else if (position == 4) {
			
			System.out.println("과장직급은 400만원/월 입니다.");
		}
		else if (position == 5) {
			
			System.out.println("대리직급은 250만원/월 입니다.");
		}
			else {		
			System.out.println("사원직급은 180만원/월 입니다.");
		}
		
		switch(position) {
		case 1:
			System.out.println("상무직급은 1000만원/월 입니다.");
			break;
			
		case 2:
			System.out.println("부장직급은 800만원/월 입니다.");
			break;
			
		case 3:
			System.out.println("차장직급은 600만원/월 입니다.");
			break;
			
		case 4:
			System.out.println("과장직급은 400만원/월 입니다.");
			break;
			
		case 5:
			System.out.println("대리직급은 250만원/월 입니다.");
			break;
			
		case 6:
			System.out.println("사원직급은 180만원/월 입니다.");
			break;
		}
		
		scanner.close();

	}

}

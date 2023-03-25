package sec01_exam;

public class SwitchCharExample {

	public static void main(String[] args) {

		char grade = 'B';
		switch(grade) {
		case'A':
		case'B':
			System.out.println("우수회원");
			break;
		case'b':
		case'd':
			System.out.println("일반회원");
			break;
			//default는 옵션
		default:	
			System.out.println("손님");
			
		}

	}

}

package sec01_exam;

public class LogicalOpratorEx {

	public static void main(String[] args) {

		int charCode = 'A'; //65
		//오퍼랜드의 값이 숫자인것은 아스키 코드의 값을 의미 한다.
		if((charCode>=65) && (charCode<=90)) {
			System.out.println("대문자 이군요");
		}
		if ((charCode>=97) && (charCode<=122)) {
			System.out.println("소문자 이군요");
		}
		if(!(charCode<48) && !(charCode>57)) {
			System.out.println("0~9 숫자 이군요");
		}
		int value = 6;
		if (((value%2) == 0) || ((value%3) == 0)) {
			System.out.println("2또는 3의 배수이군요");
		}
		
		
	}

}

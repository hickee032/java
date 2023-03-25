package sec01_exam;

public class CompareOpEx {

	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 10;
		
		boolean result1 = (num1 == num2); //boolean 논리 true false 값을 두개 나타낸다.
		boolean result2 = (num1 != num2); //값이 같지 않으면 true를 같으면 false를 리턴한다.
		boolean result3 = (num1 <= num2); //num2가 num1보다 크거나 같으면 true를 리턴한다.
		
		System.out.println("result1=" + result1); //결과 창에 나타낸다.
		System.out.println("result2=" + result2);
		System.out.println("result3=" + result3);
		
		char char1 = 'A';
		char char2 = 'B';
		
		//결국 여기서의 비교는 아스키 코드 값의 비교인것이다.
		
		boolean result4 = (char1 < char2);
		System.out.println("result4=" + result4);
		
		//문자를 아스키 코드 값으로 나오게 함
		
		System.out.println((int)char1);
		System.out.println((int)char2);
	}
}

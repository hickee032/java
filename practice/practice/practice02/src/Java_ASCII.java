import java.util.*;				// util 내의 모든 명령문 집합 불러오는 것 (이게 더 편하긴 함)
// import java.util.Scanner; -> Scanner 하나만 불러오는 것
// "java", "util", "Scanner" 이거 전부 다 명령문 집합들
// 대분류 java - 중분류 util - 소분류 Scanner


public class Java_ASCII {
	public static void main(String args[]) {
		// 우리가 당연히 문자로 생각하는 것을 컴퓨터는 0과 1로 된 숫자로 파악한다.
		// 이 때문에 우리는 "아스키코드" 라는 것을 사용한다.
		// 아스키코드:: 우리가 생각하는 문자, 기호를 특정 숫자에 일대일 대응시켜 표현한 것
		
		// C언어에서 다루었던 아스키코드 관련 코드
		System.out.printf("문자로는 %c\n", (char)'!');	// 문자로 출력
		System.out.printf("숫자로는 %d\n", (int)'!');	// 숫자로 출력
		
		// 입력받은 문자를 대문자->소문자 / 소문자->대문자로 바꾸어 출력하는 프로그램
		// 다만, 영문자를 입력받지 않는 경우에는 경고 메세지 출력하고 종료
		Scanner s=new Scanner(System.in);
		System.out.print("영문자를 입력하세요. ");
		char ch=s.next().charAt(0);		// 문자를 입력받는 구문
		if(ch>=65&&ch<=90) {	// 대문자인 경우
			System.out.print("대문자 -> 소문자 결과: ");
			System.out.println((char)(ch+32));	// 대문자 -> 소문자 출력문
		}
		else if(ch>=97&&ch<=122) {	// 소문자인 경우
			System.out.print("소문자 -> 대문자 결과: ");
			System.out.println((char)(ch-32));	// 소문자 -> 대문자 출력문
		}
		else {
			System.out.println("영문자가 아닙니다.");
		}
	}	
}

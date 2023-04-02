import java.util.*;

public class Java_백준repeat {
	public static void main(String args[]) {
		// 팩토리얼 문제 답안
		// 1부터 a까지 곱한 결과값 출력하는 것 (다만, 0 입력시 1 출력)
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();		// 입력값 받음
		int result= 1;			// 결과값 저장할 변수
		while(a!=0) {	// 반복문 시작 
			// (조건문) a!=0(a가 0이 아닐때까지), a>=1(a가 1보다 크거나 같을 때)
			result*=a;	// result에 a부터 1까지 곱하는 연산식
			a--;	// 1씩 감소
		}
		System.out.println(result);	// 결과값 출력
		// 0 입력받았을 때, 결과값 1 (while문 거치지 않음)
		// 1 입력받았을 때, 결과값 1 (while문 거침)
		// 2 입력받았을 때, result값: 1 -> 2 -> 2
		// ...
	}
}

import java.util.*;

public class Java_for {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		// 2. for문
		// for(제어변수 선언 및 초기화; 조건문; 제어변수 제어(주로 증감연산자 사용)) {
		// 		조건문 만족할때 실행할 명령문;
		// }
		
		// ex) 1부터 10까지 출력하기
		for(int i=1; i<=10; i++) {
			// 제어변수 i를 선언하는 즉시 1이라는 값으로 설정
			// (해당 반복문 안에 국한되어있는) i 변수가 10보다 작거나 같을때 실행
			// 반복문 안의 명령문들(중괄호로 감싸진 명령문들) 한번 실행할때마다
			// i에 1을 더한다.
			//System.out.println("현재 i의 값은: "+i);
		}
				
		// for문과 while문
		// 예제: 학생의 수와 학생들의 성적 입력받고 평균 계산
		// 1. for문
		System.out.println("<for문으로 작성한 코드>");
		System.out.print("학생 수 입력: ");
		int Num=s.nextInt();	// 학생 수 입력받기
		double sum=0;	// 합계 연산에 지장 없도록 0으로 설정
		for(int i=1;i<=Num;i++) {
			// 제어 변수 i를 1로 설정하여 선언한다
			// i가 입력받았던 Num보다 작거나 같을 때 해당 반복문 실행
			// 반복문 안의 모든 명령문 한번 실행할때마다 i값은 1 증가
			// (ex) 만약 Num=5라면,
			// i=1,2,3,4,5일때 반복문 안 명령문 실행했다가
			// i가 6이 될때 해당 반복문 탈출
			System.out.print("학생 "+i+"번의 성적: ");
			int score=s.nextInt();	// 학생 성적 입력받기
			sum+=score;
		}
		System.out.println("모든 학생의 성적 합계는 "+sum);
		double avr=sum/Num;
		System.out.println("평균은 "+avr);
		System.out.println();
		
		
		// 2. while문
		System.out.println("<while문으로 작성한 코드>");
		System.out.print("학생 수 입력: ");
		Num=s.nextInt();
		sum=0;
		int i=1;
		while(i<=Num) {
			System.out.print("학생 "+i+"번의 성적: ");
			int score=s.nextInt();
			sum+=score;
			i++;
		}

		System.out.println("모든 학생의 성적 합계는 "+sum);
		avr=sum/Num;
		System.out.println("평균은 "+avr);
		System.out.println();
	}
}

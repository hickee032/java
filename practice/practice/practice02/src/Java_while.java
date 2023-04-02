import java.util.*;

public class Java_while {
	public static void main(String args[]) {
		// 조건문: if문 - else if문 - else문 (하나로 묶여있는 개념)
		// 반복문: for문, while문, do-while문
		// 조건문+반복문 : switch문
		
		// 1. while문
		// while(조건문) {
		// 	반복할 명령문;
		//	=> 위 조건을 만족할때까지 반복함
		//	=> 그 말은, 처음부터 조건문 만족하지 못하면 처음부터 실행되지 않고
		//	=> 계속 조건문을 만족하면 무한 반복이 된다는 뜻
		// }
		
		// ex) 1부터 10까지 출력하는 구문 작성
		int num=1;
		while(num<=10) {	// 반복문 들어올때 num값이 1이기 때문에 만족을 함
			// 다만, 조건문을 계속 만족하면 무한 반복이 되고, 그렇게 되면 프로그램이 터짐
			System.out.print(num+" ");
			num++;	// => num+=1;	(증감연산자, 뒤에서 자세히)
		}
		System.out.println();	// 줄바꿈 (개행)
		
		// 문제) 정수 n과 m을 입력받고 n부터 m까지 출력하는 구문 작성
		Scanner s=new Scanner(System.in);
		System.out.print("숫자 2개를 입력하세요. ");
		int n=s.nextInt();
		int m=s.nextInt();
		while(n<=m) {	// 언젠가는 n이 m보다 큰 순간이 옴 -> 조건 만족 못해서 반복문 탈출
			System.out.print(n+" ");
			n++;
		}
	}
}



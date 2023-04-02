package java220914;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Class02 {

	public static void main(String[] args) {
		/* 반복문 */
		/* for문, while문, do- while */
		/* 조건+ 반복 형태 switch */

		/* while */

		/*
		 * while (조건문) {
		 * 
		 * 반복할 명령문;
		 * 
		 * 조건문을 만족 하지못하면 실행되지 않는 다. 조건문을 반복하게 되면 계속 무한 반복하게된다. 만족할 조건을 넣는 것이 중요하다.
		 * 
		 */

		/* 1부터 10까지 출력 */

		int num = 1;

		// 만약 num > 10 이란 조건을 넣는 다면 실행이 안된다
		while (num <= 10) {
			System.out.print(num + " ");
			num++;
		}

		System.out.println();
		// num++; , num +=1; 이 없다면 --> 1 ~ 10까지 출력 해야하지만 1이 무한적으로 반복되는 코드이다

		/* n과 을 입력 받고 n부터 m까지 출력 */

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();
		
		if (n <= m) {

			while (n <= m) {
				System.out.print(n + " ");
				n++;
			}

		} else if (n >= m) {
			while (n >= m) {
				System.out.print(n + " ");
				n--;
			}
		}
		
/* n과 을 입력 받고 n부터 m까지 출력 */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		if (n <= m) {
				
			while (n <= m) {
				System.out.print(n + " ");
				n++;
			}

		} else if (n >= m) {
			while (n >= m) {
				System.out.print(n + " ");
				n--;
			}
		}

	}

}

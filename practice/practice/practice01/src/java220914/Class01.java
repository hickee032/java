package java220914;

import java.util.Scanner;
//java util Scanner -> 명령문 집합
// 대	중	  소
//java.util.*; 이렇게 써도 됨

public class Class01 {

	public static void main(String[] args) {

		/*
		 * ASCII -> 문자를 컴퓨터는 0과 1로 이루어진 코드로 기억한다 아스키코드는 일대일 대응
		 */
		
		
		/* 입력문 영문자 한글자를 받고 대문자>소문자 , 소문자>대문자 변환*/
		Scanner sc = new Scanner(System.in);

		char a = sc.next().charAt(0);
		char b;
		int num = (int) a;

		if (65 <= num && num <= 90) {
			// 32
			System.out.println("대문자 : " + a + " 입력");
			num += 32;
			b = (char) num;
			System.out.println("소문자 변환-->" + b);
		} else if (97 <= num && num <= 122) {
			System.out.println("소문자 : " + a + " 입력");
			num -= 32;
			b = (char) num;
			System.out.println("대문자 변환-->" + b);
		} else {
			System.out.println("문자가 아닙니다.");
			System.exit(0);
		}

		sc.close();

	}

}

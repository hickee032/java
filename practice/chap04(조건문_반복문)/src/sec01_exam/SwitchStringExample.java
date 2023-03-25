package sec01_exam;

import java.util.Scanner;

public class SwitchStringExample {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String position = null;
		
		System.out.println("직급 입력");
		position = scan.nextLine();
		//보통 switch()문의 값은 int이하의 값을 지니지만 유일하게 string타입은 허용
			
			switch(position) {
				case "부장":
					System.out.println("500");
					break;
				case "차장":
					System.out.println("500");
					break;
				case "과장":
					System.out.println("500");
					break;
				case "대리":
					System.out.println("500");
					break;
				case "사원":
					System.out.println("500");
					break;
				default:
					System.out.println("300");
				}
			scan.close();

			}
		
		}

package Assignment_SingleLoop;

import java.util.Scanner;

public class Assignment04_Calculator {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num1 = 0;
		int	num2 = 0;
		int	res	= 0;
		int	op = 0;
		
		System.out.print("두개의 정수를 입력하세요 : ");
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		
		System.out.print("연산기호를 입력하세요(1:더하기,2:빼기,3:곱하기,4:나누기,5:나머지): ");
		res = scan.nextInt();
		
		switch(res) {
		case 1:
			op = num1+num2;
			System.out.println(num1+" + "+num2+" = "+op);
			break;
		case 2:
			op = num1-num2;
			System.out.println(num1+" - "+num2+" = "+op);
			break;
		case 3:
			op = num1*num2;
			System.out.println(num1+" * "+num2+" = "+op);
			break;
		case 4:
			op = num1/num2;
			System.out.println(num1+" / "+num2+" = "+op);
			break;
		case 5:
			op = num1%num2;
			System.out.println(num1+" % "+num2+" = "+op);
			break;
			}
		
		//if
		if(res==1) {
			op = num1+num2;
			System.out.println(num1+" + "+num2+" = "+op);
			}
		
		else if (res==2) {
			op = num1-num2;
			System.out.println(num1+" - "+num2+" = "+op);
			}
		
		else if(res==3) {
			op = num1*num2;
			System.out.println(num1+" * "+num2+" = "+op);
			}
		
		else if(res==4) {
			op = num1/num2;
			System.out.println(num1+" / "+num2+" = "+op);
			}
		
		else if(res==5) {
			op = num1%num2;
			System.out.println(num1+" % "+num2+" = "+op);
			}
		scan.close();
}		
}



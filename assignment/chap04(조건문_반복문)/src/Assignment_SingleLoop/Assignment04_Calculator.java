package Assignment_SingleLoop;

import java.util.Scanner;

public class Assignment04_Calculator {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num1 = 0;
		int	num2 = 0;
		int	res	= 0;
		int	op = 0;
		
		System.out.print("�ΰ��� ������ �Է��ϼ��� : ");
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		
		System.out.print("�����ȣ�� �Է��ϼ���(1:���ϱ�,2:����,3:���ϱ�,4:������,5:������): ");
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



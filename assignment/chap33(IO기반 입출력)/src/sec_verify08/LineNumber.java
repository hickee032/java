package sec_verify08;

import java.io.File;
import java.util.Scanner;

public class LineNumber {

	public static void main(String[] args)throws Exception {
		
		int i = 1;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�ؽ�Ʈ ���� �̸��� �Է��ϼ���>>");
		String input = sc.nextLine();	
		File file = new File(input);
		Scanner scinput = new Scanner(file);
		while(scinput.hasNextLine()) {
			
			System.out.println((i++)+"."+scinput.nextLine());
		}
		scinput.close();
		sc.close();
		}
	}



package Roll;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class BinaryCopy {

	public static void main(String[] args)throws Exception {
		
		Scanner sc = new Scanner(System.in);
		String originalFileD = "D:\\JAVA�۾�\\Assignment_Chap33(IO��� �����)\\src\\sec_verify11\\";
		String copyFileD = "C:/";
		System.out.println("�����̸��� �����ּ���");
		String oriD = sc.nextLine();
		
		System.out.println(originalFileD+oriD);
		
		FileInputStream fis = new FileInputStream(originalFileD+oriD);
		BufferedInputStream bis = new BufferedInputStream(fis);
		System.out.println("���� �����̸��� �����ּ���");
		String copyD = sc.nextLine();
		FileOutputStream fos = new FileOutputStream(copyFileD+copyD);
		BufferedOutputStream bos = new BufferedOutputStream(fos);

		
		byte[] readbyte = new byte[1000];
		
		while((bis.read(readbyte))!=-1) {
			bos.write(readbyte);
		}
		System.out.println((copyFileD+copyD)+"�� �����Ͽ����ϴ�.");
		
		sc.close();
		
		bos.flush();
		
		bos.close();
		bis.close();
		
		fos.close();
		fis.close();
		

	}

}

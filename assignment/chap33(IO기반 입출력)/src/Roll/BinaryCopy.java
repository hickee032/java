package Roll;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class BinaryCopy {

	public static void main(String[] args)throws Exception {
		
		Scanner sc = new Scanner(System.in);
		String originalFileD = "D:\\JAVA작업\\Assignment_Chap33(IO기반 입출력)\\src\\sec_verify11\\";
		String copyFileD = "C:/";
		System.out.println("파일이름을 적어주세요");
		String oriD = sc.nextLine();
		
		System.out.println(originalFileD+oriD);
		
		FileInputStream fis = new FileInputStream(originalFileD+oriD);
		BufferedInputStream bis = new BufferedInputStream(fis);
		System.out.println("복사 파일이름을 적어주세요");
		String copyD = sc.nextLine();
		FileOutputStream fos = new FileOutputStream(copyFileD+copyD);
		BufferedOutputStream bos = new BufferedOutputStream(fos);

		
		byte[] readbyte = new byte[1000];
		
		while((bis.read(readbyte))!=-1) {
			bos.write(readbyte);
		}
		System.out.println((copyFileD+copyD)+"로 복사하였습니다.");
		
		sc.close();
		
		bos.flush();
		
		bos.close();
		bis.close();
		
		fos.close();
		fis.close();
		

	}

}

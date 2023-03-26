package sec_verify11;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BinaryCopy {

	public static void main(String[] args)throws Exception {
		
		FileInputStream fis = new FileInputStream("D:\\JAVA작업\\Assignment_Chap33(IO기반 입출력)\\src\\sec_verify11\\김연아.jpg");
		BufferedInputStream bis = new BufferedInputStream(fis);
		FileOutputStream fos = new FileOutputStream("C:김연아 - 복사본.jpg");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		byte[] readbyte = new byte[100];
		
		while((bis.read(readbyte))!=-1) {
			bos.write(readbyte);
		}
		System.out.println("C:김연아 - 복사본.jpg로 복사하였습니다.");
		
		bos.flush();
		
		bos.close();
		bis.close();
		
		fos.close();
		fis.close();
		

	}

}

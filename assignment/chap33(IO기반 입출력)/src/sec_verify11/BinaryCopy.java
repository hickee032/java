package sec_verify11;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BinaryCopy {

	public static void main(String[] args)throws Exception {
		
		FileInputStream fis = new FileInputStream("D:\\JAVA�۾�\\Assignment_Chap33(IO��� �����)\\src\\sec_verify11\\�迬��.jpg");
		BufferedInputStream bis = new BufferedInputStream(fis);
		FileOutputStream fos = new FileOutputStream("C:�迬�� - ���纻.jpg");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		byte[] readbyte = new byte[100];
		
		while((bis.read(readbyte))!=-1) {
			bos.write(readbyte);
		}
		System.out.println("C:�迬�� - ���纻.jpg�� �����Ͽ����ϴ�.");
		
		bos.flush();
		
		bos.close();
		bis.close();
		
		fos.close();
		fis.close();
		

	}

}

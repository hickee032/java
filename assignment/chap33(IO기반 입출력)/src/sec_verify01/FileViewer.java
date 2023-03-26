package sec_verify01;

import java.io.FileInputStream;
import java.io.InputStream;

public class FileViewer {

	public static void main(String[] args) throws Exception {
		InputStream is = new FileInputStream("C:/Users/Administrator/Desktop/문제/IO기반 입출력/test.txt");
		int readByte = 0;
//		String str = "읽은 문자 : ";

//		while ((readByte = is.read()) != -1) {
//			str+= (char)readByte;
//		}
//		System.out.println(str);

		String str = "";
		while (true) {
			readByte = is.read();
			if (is.read() == -1) {
				break;
			}
			str += (char) readByte;
			System.out.println(str);
		}
		System.out.println(str);
		is.close();
	}

}

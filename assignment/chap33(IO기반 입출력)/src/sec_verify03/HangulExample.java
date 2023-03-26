package sec_verify03;

import java.io.FileReader;
import java.io.Reader;

public class HangulExample {

	public static void main(String[] args) throws Exception {
		Reader reader = new FileReader("C:/test1.txt");
		int readData;
		char[] cbuf = new char[4];
		String str = "";
		while ((readData = reader.read(cbuf)) != -1) {
			System.out.println(readData);
			str += new String(cbuf);

		}
		System.out.println(str);
		reader.close();
	}

}

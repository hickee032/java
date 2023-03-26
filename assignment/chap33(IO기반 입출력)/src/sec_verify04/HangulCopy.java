package sec_verify04;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

public class HangulCopy {

	public static void main(String[] args) throws Exception {
		Reader reader = new FileReader("C:/test1.txt");
		//int readData;
		char[] cbuf = new char[4];
		String str = "";
		while ((reader.read(cbuf)) != -1) {
			//System.out.println(readData);
			str += new String(cbuf);

		}
		System.out.println(str);
		reader.close();

		Writer writer = new FileWriter("C:/test1_copy.txt");
		writer.write(str);
		writer.flush();
		writer.close();

	}

}

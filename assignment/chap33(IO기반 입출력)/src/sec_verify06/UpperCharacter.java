package sec_verify06;

import java.io.FileReader;

public class UpperCharacter {

	public static void main(String[] args) throws Exception {

		FileReader fr = new FileReader("C:/Temp/sample.txt");
		//int readNo;
		char[] cbuf = new char[100];
		while((fr.read(cbuf))!=-1) {
			String data =new String(cbuf);
			System.out.println(data.toUpperCase());
		}
		
		fr.close();
		//System.out.println("·çÇÎ¼ö : "+ readNo);

	}

}

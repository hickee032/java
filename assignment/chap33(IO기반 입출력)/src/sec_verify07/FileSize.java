package sec_verify07;

import java.io.File;

public class FileSize {

	public static void main(String[] args) {
		File file = new File("C:/");
		String maxName = null;
		long maxSize = 0;

		File[] cFile = file.listFiles();

		for (int i = 0; i < cFile.length; i++) {
			if (maxSize < cFile[i].length()) {
				System.out.println(cFile[i]);
				maxName = cFile[i].getName();
				maxSize = cFile[i].length();
			}
		}
		System.out.println(maxName+" , "+(maxSize/1024)/1024+"MB");

	}

}

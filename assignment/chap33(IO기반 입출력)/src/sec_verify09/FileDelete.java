package sec_verify09;

import java.io.File;


public class FileDelete {

	public static void main(String[] args) throws Exception {
		
		File file = new File("C:/Temp/Test");
		File[] listF = file.listFiles();
		for (int i = 0; i < listF.length; i++) {
			//System.out.println(listF[i].getName());
			if(listF[i].getName().contains("����")) {
				System.out.println(listF[i].getAbsoluteFile() + " ����");
				listF[i].delete();

			}
		}
	}
}

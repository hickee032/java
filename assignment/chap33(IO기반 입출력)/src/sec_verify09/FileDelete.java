package sec_verify09;

import java.io.File;


public class FileDelete {

	public static void main(String[] args) throws Exception {
		
		File file = new File("C:/Temp/Test");
		File[] listF = file.listFiles();
		for (int i = 0; i < listF.length; i++) {
			//System.out.println(listF[i].getName());
			if(listF[i].getName().contains("복사")) {
				System.out.println(listF[i].getAbsoluteFile() + " 삭제");
				listF[i].delete();

			}
		}
	}
}

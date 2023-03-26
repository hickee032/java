package Roll;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class FileCopy {

	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);

		File file = new File("C:/Temp/Test/1.txt");
		FileInputStream fis = new FileInputStream(file);

		int readByteNo;
		byte[] readbyte = new byte[100];

		String[] FileName = new String[10];
		System.out.println("[" + file.getAbsolutePath() + "파일을 디렉토리에 복사본을 10개 생성합니다.]");
		for (int i = 0; i < FileName.length; i++) {
			if (i == 0) {
				FileName[i] = "C:/Temp/Test/1-복사본.txt";
			} else {
				FileName[i] = "C:/Temp/Test/1-복사본(" + i + ").txt";
			}
			FileOutputStream fos = new FileOutputStream(FileName[i]);

			while ((readByteNo = fis.read(readbyte)) != -1) {
				fos.write(readbyte);
			}
		}

		System.out.println("[생성된 복사본의 삭제를 원하면 Y/N N은 종료]");
		String input = sc.nextLine();

		if ((input.equals("Y")) || (input.equals("y"))) {
			File file2 = new File("C:/Temp/Test");
			File[] listF = file2.listFiles();
			for (int i = 0; i < listF.length; i++) {
				if (listF[i].getName().contains("복사본")) {
					System.out.println(listF[i].getAbsoluteFile());
					listF[i].delete();

				}
			}
		} else {
			System.out.println("3초후 프로그램을 종료합니다.");
			Thread.sleep(3000);
			System.exit(0);
		}

	}

}

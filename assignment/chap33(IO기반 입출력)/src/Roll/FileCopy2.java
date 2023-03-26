package Roll;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.Writer;
import java.util.Scanner;

public class FileCopy2 {

	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);
		int input;

		while (true) {
			System.out.println("-------------------------------");
			System.out.println("------C:/Temp/Test/1.txt-------");
			System.out.println(" 1.파일생성  2.파일복사  3.복사본삭제 4.종료");
			System.out.println("-------------------------------");
			System.out.println("입력>>");
			input = sc.nextInt();

			if (input == 1) {
				System.out.println("C:/Temp/Test/1.txt 파일생성");
				System.out.print("파일의 내용을 입력>>");
				
				String inContent = sc.nextLine();
				Writer writer = new FileWriter("C:/Temp/Test/1.txt");
				char[] cbuf = inContent.toCharArray();
				
				for (int i = 0; i < cbuf.length; i++) {
					writer.write(cbuf[i]);
				}
			
			}
			if (input == 2) {
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
			}
			if (input == 3) {
				File file2 = new File("C:/Temp/Test");
				File[] listF = file2.listFiles();
				String str = "";
				for (int i = 0; i < listF.length; i++) {
					str = listF[i].getName();
					if (str.contains("복사")) {
						listF[i].delete();
						
					}
				}
			}
		}
	}

}

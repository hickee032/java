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
			System.out.println(" 1.���ϻ���  2.���Ϻ���  3.���纻���� 4.����");
			System.out.println("-------------------------------");
			System.out.println("�Է�>>");
			input = sc.nextInt();

			if (input == 1) {
				System.out.println("C:/Temp/Test/1.txt ���ϻ���");
				System.out.print("������ ������ �Է�>>");
				
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
				System.out.println("[" + file.getAbsolutePath() + "������ ���丮�� ���纻�� 10�� �����մϴ�.]");
				for (int i = 0; i < FileName.length; i++) {
					if (i == 0) {
						FileName[i] = "C:/Temp/Test/1-���纻.txt";
					} else {
						FileName[i] = "C:/Temp/Test/1-���纻(" + i + ").txt";
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
					if (str.contains("����")) {
						listF[i].delete();
						
					}
				}
			}
		}
	}

}

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

		System.out.println("[������ ���纻�� ������ ���ϸ� Y/N N�� ����]");
		String input = sc.nextLine();

		if ((input.equals("Y")) || (input.equals("y"))) {
			File file2 = new File("C:/Temp/Test");
			File[] listF = file2.listFiles();
			for (int i = 0; i < listF.length; i++) {
				if (listF[i].getName().contains("���纻")) {
					System.out.println(listF[i].getAbsoluteFile());
					listF[i].delete();

				}
			}
		} else {
			System.out.println("3���� ���α׷��� �����մϴ�.");
			Thread.sleep(3000);
			System.exit(0);
		}

	}

}

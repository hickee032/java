package sec_verify02;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class FileCopy  {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է��ϼ���");
		String str = sc.nextLine();
		Fileout(str);
		Fileinput(str);
		//Filecopy(str);
		sc.close();

	}

	static void Fileinput(String str) throws Exception {

		InputStream is = new FileInputStream("D:/out.txt");
		int readByte = 0;
		String a = "";

		while ((readByte = is.read()) != -1) {
			a += (char) readByte;
		}
		System.out.println("���� �ϰڽ��ϱ�  Y/N N���� �����մϴ�.");
		Scanner sc = new Scanner(System.in);
		String cin = sc.nextLine();

		if ((cin.equals("Y") || cin.equals("y"))) {
			Filecopy(str);
		} else if ((cin.equals("N") || cin.equals("n"))) {
			System.out.println("����");
			System.exit(0);
		}
		
		System.out.println(a);
		sc.close();
		is.close();

	}

	static void Fileout(String str) throws Exception {
		OutputStream os = new FileOutputStream("D:/out.txt");
		byte[] bs = str.getBytes();
		//System.out.println(Arrays.toString(bs));
		System.out.println("[���� ������ �մϴ�.]");
		os.write(bs);
		os.flush();
		os.close();
	}

	static void Filecopy(String str) throws Exception {
		OutputStream os = new FileOutputStream("D:/out_copy.txt");
		byte[] bs = str.getBytes();
		//System.out.println(Arrays.toString(bs));
		System.out.println("[���� ������ �մϴ�.]");
		os.write(bs);
		os.flush();
		os.close();
	}
}

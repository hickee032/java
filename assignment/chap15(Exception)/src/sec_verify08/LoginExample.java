package sec_verify08;

import java.util.Scanner;

public class LoginExample {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String id = "white";
		String pw = "12345";

		System.out.println("���̵�� " + id + "�̸�, ��й�ȣ��" + pw + "�Դϴ�.");

		try {
			System.out.println("���̵�  : ��й�ȣ");
			id = scan.next();
			pw = scan.nextLine();

			LoginExample.login(id, pw);
			
			} catch (Exception e) {
				System.out.println(e.getMessage());
				
		}

	}

	static void login(String id, String pw) throws NotExistIDException, WrongPasswordException {

		if (!id.equals("white")) {
			throw new NotExistIDException(id + "�� ���̵� �������� �ʽ��ϴ�.");
		}
		if (!pw.equals("12345")) {
			throw new WrongPasswordException("�н����尡 " + pw + "�� �ƴմϴ�.");
		}
	}

}

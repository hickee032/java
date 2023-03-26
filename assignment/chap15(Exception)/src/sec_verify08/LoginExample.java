package sec_verify08;

import java.util.Scanner;

public class LoginExample {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String id = "white";
		String pw = "12345";

		System.out.println("아이디는 " + id + "이며, 비밀번호는" + pw + "입니다.");

		try {
			System.out.println("아이디  : 비밀번호");
			id = scan.next();
			pw = scan.nextLine();

			LoginExample.login(id, pw);
			
			} catch (Exception e) {
				System.out.println(e.getMessage());
				
		}

	}

	static void login(String id, String pw) throws NotExistIDException, WrongPasswordException {

		if (!id.equals("white")) {
			throw new NotExistIDException(id + "란 아이디가 존재하지 않습니다.");
		}
		if (!pw.equals("12345")) {
			throw new WrongPasswordException("패스워드가 " + pw + "이 아닙니다.");
		}
	}

}

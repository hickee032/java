package sec_verify14;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapLoginExample {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Map<String, String> map = new HashMap<String, String>();
		map.put("perpear", "4321");
		map.put("fly", "1012");
		map.put("numeric", "1234");
		map.put("fish", "15244");
		map.put("ruby", "00145");

		while (true) {
			System.out.println("아이디와 비밀번호를 입력해주세요.");
			System.out.print("아이디 : ");
			String id = sc.next();
			System.out.print("비밀번호 : ");
			String pass = sc.next();

			if (map.containsKey(id)) {
				// System.out.println(map.get(id));
				if (map.get(id).equals(pass)) {
					System.out.println(id + "님이 로그인 했습니다.");
					break;
				} else {
					System.out.println("비밀번호 오류");
				}
			} else {
				System.out.println("입력하신 아이디는 존재하지 않습니다. ");
			}
		}
		sc.close();
	}

}

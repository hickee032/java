package MemberService;

public class MemberService {

	public boolean login(String id, String password) {
		// boolean run = true;
		boolean result = true;

		// String x = "h";

		if (id.equals("hong")) {
			if (password.equals("1111")) {
				System.out.println(id + " 로그인 되었습니다");
				// return result;
			} else {
				System.out.println("password를 확인해주세요!");
				result = false;
				// return result;
			}
		} else {
			System.out.println("ID를 확인해주세요!");
			result = false;
			// return result;
		}

		return result;
	}
}

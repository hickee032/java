package MemberService;

public class MemberService {

	public boolean login(String id, String password) {
		// boolean run = true;
		boolean result = true;

		// String x = "h";

		if (id.equals("hong")) {
			if (password.equals("1111")) {
				System.out.println(id + " �α��� �Ǿ����ϴ�");
				// return result;
			} else {
				System.out.println("password�� Ȯ�����ּ���!");
				result = false;
				// return result;
			}
		} else {
			System.out.println("ID�� Ȯ�����ּ���!");
			result = false;
			// return result;
		}

		return result;
	}
}

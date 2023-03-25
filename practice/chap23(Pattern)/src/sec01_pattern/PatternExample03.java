package sec01_pattern;

import java.util.regex.Pattern;

public class PatternExample03 {

	public static void main(String[] args) {
		
		//010���� �����ϴ� �� ��ȣ ����
		String regExp = "(010)-\\d{3,4}-\\d{4}";
		
		String data = "010-9903-2723";
		
		//Pattern.matches()���� ���Ͽ� ��ġ�ϴ� �� Ȯ��.
		boolean result = Pattern.matches(regExp, data);
		if(result) {
			System.out.println("��ȭ ��ȣ ����� �½��ϴ�.");
		}
		else {
			System.out.println("�ٽ� �Է�");
		}
		
		//�Ʒ��� �̸��� ������ �����Ѱ��̴�.
		regExp = "\\w+@\\w+\\.\\w+(\\.\\w+)?";
		data = "aaa@naver.com";
		result = Pattern.matches(regExp, data);
		
		if(result) {
			System.out.println("�̸��� ����� �½��ϴ�.");
		}
		else {
			System.out.println("�ٽ� �Է�");
		}
		

	}

}

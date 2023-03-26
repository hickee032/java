package sec_verify02;

import java.util.ArrayList;
import java.util.Scanner;

public class longStringSearch {
	
	String com = null;
	
	Scanner sc = new Scanner(System.in);

	private ArrayList<String> stringList;

	public longStringSearch(int input) {

		System.out.print("몇개의 이름을 입력하실껀가요? >>");
		input = sc.nextInt();
		System.out.println(input + "만큼의 ArrayList가 생성되었습니다.");
		stringList = new ArrayList<String>(input);

		for (int i = 0; i < input; i++) {
			System.out.print((i + 1) + "번째 이름을 입력하세요>>");
			String name = sc.next();
			stringList.add(name);
		}
		System.out.println("입력이 완료 되었습니다.");
		System.out.println();
		System.out.println("ArrayList에 들어 있는 모든 이름을 출력합니다.");

		for (int i = 0; i < input; i++) {

			System.out.println((i + 1) + "번째 ArrayList객체 값 : " + stringList.get(i));
		}

		for (int i = 0; i < stringList.size(); i++) {
			com = stringList.get(0);
			if (com.length() < stringList.get(i).length()) {
				com = stringList.get(i);
			}
			
		}
		System.out.println("가장 긴 이름은 "+com+"입니다.");

	}

}

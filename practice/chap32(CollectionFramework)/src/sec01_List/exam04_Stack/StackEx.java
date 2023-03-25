package sec01_List.exam04_Stack;

import java.util.Stack;

public class StackEx {

	public static Stack back = new Stack();// 뒤로가기
	public static Stack forward = new Stack();// 앞으로 가기

	public static void main(String[] args) {

		// Stack 그림을 그려봐라

		goURL("1.네이버");
		goURL("2.야후");
		goURL("3.네이트");
		goURL("4.다음");

		print();

		goBack();
		System.out.println("--뒤로가기 버튼 누른 후--");
		print();

		goBack();
		System.out.println("--뒤로가기 버튼 누른 후--");
		print();

		goforward();
		System.out.println("--앞으로 가기 버튼 누른 후--");
		print();

		goURL("5.중앙");
		System.out.println("새로운 사이트 이동");
		print();

	}

	// 페이지로 이동
	public static void goURL(String url) {
		back.push(url);
		if (!forward.empty()) {
			forward.clear();
		}
	}

	// 이전 페이지로 이동
	public static void goBack() {
		if (!back.empty()) {
			forward.push(back.pop());
		}
	}

	// 앞 페이지로 이동
	public static void goforward() {
		if (!forward.empty()) {
			back.push(forward.pop());
		}
	}

	// 현재 화면 상태 출력
	public static void print() {
		System.out.println("back : " + back);
		System.out.println("forward : " + forward);
		System.out.println("현재화면 : " + back.peek() + "입니다.");
		System.out.println();
	}
}

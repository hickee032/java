package sec01.exam07_TextField;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;

public class TextFieldExample {

	public static void main(String[] args) {

		Frame f = new Frame("Login");
		f.setSize(400, 80);
		// LayoutManager를 FlowLayout으로 한다.
		f.setLayout(new FlowLayout());

		Label lid = new Label("아이디 :", Label.RIGHT); // 정렬을 오른쪽으로.
		Label lpwd = new Label("패스워드 :", Label.RIGHT);

		// 약 10개의 글자를 입력할 수 있는 TextField 생성
		TextField id = new TextField(10);
		TextField pwd = new TextField(10);
		// 입력한 값 대신 '*'가 보이도록 한다.(에코문자 설정) 비밀번호 설정에 사용
		pwd.setEchoChar('*');
		// pwd.setEchoChar('-');
		char ch = pwd.getEchoChar();
		System.out.println("설정한 에코문자 : " + ch);

		// 생성한 컴포넌트들을 Frame에 포함시킨다.
		f.add(lid);
		f.add(id);
		f.add(lpwd);
		f.add(pwd);
		f.setVisible(true);

	}

}

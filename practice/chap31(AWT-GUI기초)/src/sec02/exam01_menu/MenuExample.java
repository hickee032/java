package sec02.exam01_menu;

import java.awt.CheckboxMenuItem;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MenuExample {

	public static void main(String[] args) {
		Frame f = new Frame("메뉴 예제");
		f.setSize(300, 200);
		// 메뉴바 생성
		MenuBar menuBar = new MenuBar();

		// 메뉴를 생성
		Menu mFile = new Menu("파일");
		// 메뉴 아이템 생성
		MenuItem mNew = new MenuItem("새 파일");
		MenuItem mOpen = new MenuItem("열기");

		// MenuItem이 아니라 서브아이템을 가지고있으니 Menu인것에 주목
		Menu mOther = new Menu("기타");

		MenuItem mExit = new MenuItem("종료하기");

		// Menu에다가 MenuItem 추가하는 것
		mFile.add(mNew);
		mFile.add(mOpen);

		// 계층형 메뉴 생성
		mFile.add(mOther);

		// 메뉴 분리선을 넣는 다.
		mFile.addSeparator();

		mFile.add(mExit);

		// 기타 메뉴에 들어갈 메뉴아이템 만들기

		MenuItem mPrint = new MenuItem("출력");
		MenuItem mPriview = new MenuItem("미리보기");
		MenuItem mPsetup = new MenuItem("프린터 설정");

		// 기타 메뉴에 메뉴아이템 추가하기.
		mOther.add(mPrint);
		mOther.add(mPriview);
		mOther.add(mPsetup);
		
		Menu mEdit = new Menu("편집");
		Menu mView = new Menu("보기");
		Menu mHelp = new Menu("도움");
		
		/*
		 * CheckboxMenuItem(String name, boolean status) 
		 * name - CheckboxMenuItem에 보여질 이름
		 * status 값이 true이면 체크된 상태로 생성
		 * --> Checkbox처럼 메뉴를 클릭할때 메뉴앞에 체크 표시가 설정되거나 해제된다.
		 */
		CheckboxMenuItem mstatus = new CheckboxMenuItem("상태표시");
		mView.add(mstatus);
		
		f.addWindowListener(new WindowAdapter() {
			
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		//메뉴바에 메뉴를 추가
		menuBar.add(mFile);
		menuBar.add(mEdit);
		menuBar.add(mView);
		menuBar.add(mHelp);

		//윈도우에 메뉴바를 추가한다.
		f.setMenuBar(menuBar);

		f.setVisible(true);

	}

}

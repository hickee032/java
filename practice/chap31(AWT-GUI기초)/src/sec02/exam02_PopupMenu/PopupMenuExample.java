package sec02.exam02_PopupMenu;

import java.awt.Frame;
import java.awt.MenuItem;
import java.awt.PopupMenu;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class PopupMenuExample {

	public static void main(String[] args) {
		Frame f = new Frame("메뉴 예제");
		f.setSize(300, 200);

		PopupMenu pMenu = new PopupMenu();
		MenuItem mCut = new MenuItem("잘라내기");
		MenuItem mCopy = new MenuItem("복사하기");
		MenuItem mPaste = new MenuItem("붙여넣기");
		pMenu.add(mCut);
		pMenu.add(mCopy);
		pMenu.add(mPaste);

		//프레임에 팝업메뉴 추가함
		f.add(pMenu);

		//윈도우 이벤트
		f.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		//마우스 이벤트 등록
		f.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mousePressed(MouseEvent e) {
				if(e.getModifiers() == MouseEvent.BUTTON3_MASK) {
					pMenu.show(f, e.getX(), e.getY());
					//MouseEvent.BUTTON1_MASK 왼클릭
					//MouseEvent.BUTTON2_MASK 휠 클릭
					System.out.println("마우스 좌표 : "+e.getX()+","+e.getY());
				}
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				System.out.println("마우스 좌표(Enterd) : "+e.getX()+","+e.getY());
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				System.out.println("마우스 좌표(Exited) : "+e.getX()+","+e.getY());
			}
		});
		
		f.setVisible(true);

	}

}

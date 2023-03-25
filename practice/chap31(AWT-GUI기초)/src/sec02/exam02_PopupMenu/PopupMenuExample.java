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
		Frame f = new Frame("�޴� ����");
		f.setSize(300, 200);

		PopupMenu pMenu = new PopupMenu();
		MenuItem mCut = new MenuItem("�߶󳻱�");
		MenuItem mCopy = new MenuItem("�����ϱ�");
		MenuItem mPaste = new MenuItem("�ٿ��ֱ�");
		pMenu.add(mCut);
		pMenu.add(mCopy);
		pMenu.add(mPaste);

		//�����ӿ� �˾��޴� �߰���
		f.add(pMenu);

		//������ �̺�Ʈ
		f.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		//���콺 �̺�Ʈ ���
		f.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mousePressed(MouseEvent e) {
				if(e.getModifiers() == MouseEvent.BUTTON3_MASK) {
					pMenu.show(f, e.getX(), e.getY());
					//MouseEvent.BUTTON1_MASK ��Ŭ��
					//MouseEvent.BUTTON2_MASK �� Ŭ��
					System.out.println("���콺 ��ǥ : "+e.getX()+","+e.getY());
				}
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				System.out.println("���콺 ��ǥ(Enterd) : "+e.getX()+","+e.getY());
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				System.out.println("���콺 ��ǥ(Exited) : "+e.getX()+","+e.getY());
			}
		});
		
		f.setVisible(true);

	}

}

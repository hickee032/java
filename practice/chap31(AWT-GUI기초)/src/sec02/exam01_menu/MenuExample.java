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
		Frame f = new Frame("�޴� ����");
		f.setSize(300, 200);
		// �޴��� ����
		MenuBar menuBar = new MenuBar();

		// �޴��� ����
		Menu mFile = new Menu("����");
		// �޴� ������ ����
		MenuItem mNew = new MenuItem("�� ����");
		MenuItem mOpen = new MenuItem("����");

		// MenuItem�� �ƴ϶� ����������� ������������ Menu�ΰͿ� �ָ�
		Menu mOther = new Menu("��Ÿ");

		MenuItem mExit = new MenuItem("�����ϱ�");

		// Menu���ٰ� MenuItem �߰��ϴ� ��
		mFile.add(mNew);
		mFile.add(mOpen);

		// ������ �޴� ����
		mFile.add(mOther);

		// �޴� �и����� �ִ� ��.
		mFile.addSeparator();

		mFile.add(mExit);

		// ��Ÿ �޴��� �� �޴������� �����

		MenuItem mPrint = new MenuItem("���");
		MenuItem mPriview = new MenuItem("�̸�����");
		MenuItem mPsetup = new MenuItem("������ ����");

		// ��Ÿ �޴��� �޴������� �߰��ϱ�.
		mOther.add(mPrint);
		mOther.add(mPriview);
		mOther.add(mPsetup);
		
		Menu mEdit = new Menu("����");
		Menu mView = new Menu("����");
		Menu mHelp = new Menu("����");
		
		/*
		 * CheckboxMenuItem(String name, boolean status) 
		 * name - CheckboxMenuItem�� ������ �̸�
		 * status ���� true�̸� üũ�� ���·� ����
		 * --> Checkboxó�� �޴��� Ŭ���Ҷ� �޴��տ� üũ ǥ�ð� �����ǰų� �����ȴ�.
		 */
		CheckboxMenuItem mstatus = new CheckboxMenuItem("����ǥ��");
		mView.add(mstatus);
		
		f.addWindowListener(new WindowAdapter() {
			
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		//�޴��ٿ� �޴��� �߰�
		menuBar.add(mFile);
		menuBar.add(mEdit);
		menuBar.add(mView);
		menuBar.add(mHelp);

		//�����쿡 �޴��ٸ� �߰��Ѵ�.
		f.setMenuBar(menuBar);

		f.setVisible(true);

	}

}

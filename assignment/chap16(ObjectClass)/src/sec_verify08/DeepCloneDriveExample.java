package sec_verify08;

import java.util.Arrays;

public class DeepCloneDriveExample {

	public static void main(String[] args) {
		Drive ori = new Drive("C����̺�", 500, new String[] { "����������", "�ý�������" }, new Folder("�߽�", 15));
		System.out.println("[���� ����̺��� �ʵ� ��]");
		System.out.println("�̸� : " + ori.name);
		System.out.println("ũ�� : " + ori.size);
		System.out.println("���� ��� : " + Arrays.toString(ori.driverList));
		System.out.println("�� ������ : " + ori.folder.name);
		System.out.println("ũ�� : " + ori.folder.size);
		
		System.out.println();
		Drive cloned = ori.getDrive();
		
		System.out.println("[���� ����̺��� �ʵ� ��]");
		System.out.println("�̸� : " + cloned.name);
		System.out.println("ũ�� : " + cloned.size);
		System.out.println("���� ��� : " + Arrays.toString(cloned.driverList));
		System.out.println("�� ������ : " + cloned.folder.name);
		System.out.println("ũ�� : " + cloned.folder.size);

	}
	
	

}

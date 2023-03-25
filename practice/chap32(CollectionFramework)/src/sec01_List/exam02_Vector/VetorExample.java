package sec01_List.exam02_Vector;

import java.util.Iterator;
import java.util.Vector;

public class VetorExample {

	public static void main(String[] args) {
		Vector<Boraed> list = new Vector<Boraed>();
		System.out.println("���� �뷮 : " + list.capacity());

		list.add(new Boraed("����1", "����1", "�۾���1"));
		list.add(new Boraed("����2", "����2", "�۾���2"));
		list.add(new Boraed("����3", "����3", "�۾���3"));
		list.add(new Boraed("����4", "����4", "�۾���4"));
		list.add(new Boraed("����5", "����5", "�۾���5"));

		list.remove(2); // �迭���� �߻�
		list.remove(3); // �迭���� �߻�

		for (Boraed B : list) {
			System.out.println(B);
		}
		System.out.println("���� ���� ��ü�� : " + list.size());
		System.out.println("���� �뷮 : " + list.capacity()); // �״�� 10�� ����

		list.ensureCapacity(list.capacity()); // ���� �뷮 Ȯ�� ensureCapacity()�� ���� �ι�
		System.out.println("ensureCapacity");
		System.out.println("���� ���� Ȯ�� �� ��ü�� : " + list.size());
		System.out.println("���� �뷮 Ȯ�� �� : " + list.capacity());

		list.trimToSize();
		System.out.println("trimToSize() �� ��ü�� : " + list.size());
		System.out.println("trimToSize() ��  �뷮: " + list.capacity());

		// �ݺ��� Iterator<E>�� �̿��� ���
		Iterator<Boraed> iterator = list.iterator();
		while (iterator.hasNext()) {
			Boraed boraed = iterator.next();
			System.out.println(boraed);
		}
	}

}

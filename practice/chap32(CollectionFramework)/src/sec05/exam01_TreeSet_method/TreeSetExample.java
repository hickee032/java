package sec05.exam01_TreeSet_method;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		/*
		 * Ʈ������ ���� Ʈ����������� �̷���� �÷��� Set�������̽��� ������ ��ü�̴�.
		 * set�������̽��� �����Ͽ� ���� ������ ���� Treeset�� ��ü ���Ĺ� �˻��� ���� ���
		 *  �׿� Ưȭ�� �޼��带 ��� �ϱ� ���� TreesetŬ������ ���� �����Ͽ� �����ϵ����Ѵ�.
		 */
		
		TreeSet<Integer> scores = new TreeSet<Integer>();
		
		scores.add(new Integer(87)); //score.add(87)�� �� �ڵ��ڽ�
		scores.add(new Integer(98));
		scores.add(new Integer(75));
		scores.add(new Integer(95));
		scores.add(new Integer(80));
		
		Integer score = null;
		
		score = scores.first();
		System.out.println("���� ���� ����"+score);
		score = scores.last();
		System.out.println("���� ���� ���� "+score);
		
		//���� ��� --�־��� ��ü ������
		score = scores.lower(new Integer(95));
		System.out.println("95�� �Ʒ��� ���� (���� ���)" + score);
		//������ ��� --�־��� ��ü ������
		score = scores.higher(new Integer(95));
		System.out.println("95�� ���� ���� (������ ���)" + score);
		//�־��� ��ü ���� �ٷξƷ��� ����  -- �־��� ��ü ����
		score = scores.floor(new Integer(95));
		System.out.println("95���̰ų� �ٷ� �Ʒ��� ���� " + score);
		System.out.println();
		//�־��� ��ü ���� �ٷ����� ����  -- �־��� ��ü ����
		score = scores.ceiling(new Integer(85));
		System.out.println("85�� �̰ų� �ٷ� ���� ���� "+score);
		System.out.println();
		
		//�÷��ǿ� �����Ͱ� �ִٸ�
		while(!scores.isEmpty()) {
			//���� �������� ���� �����´� �������Ŀ� treeset���� ���ŵȴ�.
			score = scores.pollFirst();
			System.out.println(score+("������ü�� :"+scores.size()+")"));
		}
		
		while(!scores.isEmpty()) {
			//���� �������� ���� �����´� �������Ŀ� treeset���� ���ŵȴ�.
			score = scores.pollLast();
			System.out.println(score+("(������ü�� :"+scores.size()+")"));
		}
		
		//�ݺ���
		Iterator<Integer> iterator = scores.iterator();
		while(iterator.hasNext()) {
			//pollFirst()�� ���� ����� �������� ������ �������� ��ü ���Ÿ� ���� �ʴ� �ٴ� ���̴�.
			//�տ��� ���ߵ��� ��������� remove()�� ����� ��μ� ���ŵ��� �������.
			int value = iterator.next();
			//iterator.remove();//�̷��� ����� ��ü�� ���ŵ�
			System.out.println(value+("(������ü�� :"+scores.size()+")"));
		}	
	}
}

package sec01_exam_objects;

import java.util.Arrays;
import java.util.Comparator;

public class ComparableVSComparator {

	// Comparable<T> ������ ���Ŭ����
	static class Member implements Comparable<Member> {

		int score;
		String name;

		public Member(int score, String name) {

			this.score = score;
			this.name = name;
		}

		@Override
		public int compareTo(Member o) {

			System.out.println("compareTo() ȣ��");

			//�������� -1
//			return this.score - o.score;
			//�������� 1
			return o.score - this.score;
//			if (o.score < this.score) {
//				return -1;
//			} else if (o.score == this.score) {
//				return 0;
//			} else {
//				return 1;
//			}
		}

		@Override
		public String toString() {

			return this.score + "," + this.name;
		}
	}
	
	static class NameAscending implements Comparator<Member>{

		@Override
		public int compare(Member o1, Member o2) {
			System.out.println("Comparator<Member> ȣ��");
			return o1.name.compareTo(o2.name); //���ڿ��� ���������� ��������
			//return o2.name.compareTo(o1.name); //���ڿ��� ���������� ��������
					
		}
		
	}

	/*
	 * ����� compareable�� �⺻ ���ı����� �����ϴµ� ����Ѵ�.- ������ �ϰ� �ʹٸ� �ݵ�� �����ؾ��Ѵ�.
	 * (compareTo()������) 
	 * --> compareable�� compare()�Ű������� �ΰ�
	 *
	 * ������ �ϰ� ���� ���ϴ� ������ ������ �ϰ�ʹٸ�  compareable�Ŀ�
	 * ������ Comparator�� �⺻ ���ı����� ���� �ٸ� �������� �����ϰ��� �Ҷ� ����Ѵ�.
	 * --> Comparator�� compare()�Ű������� �ΰ�
	 */
	
	

	public static void main(String[] args) {

		Member[] mem = { new Member(100, "abc"), new Member(300, "aaa"), 
						 new Member(400, "ccc"), new Member(200, "bbb") 
						 };
		Member m1 = new Member(1, "������");
		Member m2 = new Member(2, "�����");
		Member m3 = new Member(5, "������");
		Member[] mem1 = { m1, m2, m3 };

		// Arrays.sort() �Ű������� �迭 ���� �⺻�� Ÿ���̸� , �⺻������ �������� ������ ��.

		// �Ű����� �⺻�� Ÿ���� �ƴϰ� implements Comparable<T>�� ���� �ߴٸ�
		// compareTo() ���� ���� ������ ������ �Ѵ�.

		Arrays.sort(mem1); // compareTo() ���� ���� �������� ���������� �����Ѵ�.
							// 1(���)������ �ϸ� �������� (5-2-1)
		System.out.println(Arrays.toString(mem1));
		
		Arrays.sort(mem, new NameAscending()); // new NameAscending() ���� ����
		System.out.println(Arrays.toString(mem));
	}
}

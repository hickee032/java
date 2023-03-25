package sec01_exam_objects;

import java.util.Arrays;
import java.util.Objects;

public class HashExample {

	static class Student {
		int sno;
		String name;
		int[] arr;


		public Student(int sno, String name, int[] arr) {
			this.sno = sno;
			this.name = name;
			this.arr = arr;
			
		}
		
		@Override
		public int hashCode() {
			//���� ������ü�� ���� arr[0]�� �־ ��.
			//���� ȣȯ�� ���ؼ� �Ʒ��� ���� ������ �ִ�.
			//return this.sno + this.name.hashCode()+this.arr[0]+this.c.hashCode();
			
			//���� �ʵ忡 �������� ��� ������ ���� ��� Objects.hash() �ѹ��� �ؽ� �ڵ带 ����� �ش�.
			return Objects.hash(this.sno,this.name,Arrays.toString(this.arr));
		}

	}

	public static void main(String[] args) {

		Student s1 = new Student(1, "ȫ�浿", new int[] { 100, 100 });
		Student s2 = new Student(1, "ȫ�浿", new int[] { 100, 100 });
		
		//System.out.println(s1.arr.toString());
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
	}

}

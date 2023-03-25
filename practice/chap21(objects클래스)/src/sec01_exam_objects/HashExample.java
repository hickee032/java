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
			//논리적 동동객체로 보고 arr[0]를 넣어서 비교.
			//하위 호환을 위해서 아래와 같이 쓸수도 있다.
			//return this.sno + this.name.hashCode()+this.arr[0]+this.c.hashCode();
			
			//내부 필드에 여러개의 멤버 변수가 있을 경우 Objects.hash() 한번에 해쉬 코드를 만들어 준다.
			return Objects.hash(this.sno,this.name,Arrays.toString(this.arr));
		}

	}

	public static void main(String[] args) {

		Student s1 = new Student(1, "홍길동", new int[] { 100, 100 });
		Student s2 = new Student(1, "홍길동", new int[] { 100, 100 });
		
		//System.out.println(s1.arr.toString());
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
	}

}

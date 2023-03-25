package sec01_exam_objects;

import java.util.Arrays;
import java.util.Comparator;

public class ComparableVSComparator {

	// Comparable<T> 구현한 멤버클래스
	static class Member implements Comparable<Member> {

		int score;
		String name;

		public Member(int score, String name) {

			this.score = score;
			this.name = name;
		}

		@Override
		public int compareTo(Member o) {

			System.out.println("compareTo() 호출");

			//오름차순 -1
//			return this.score - o.score;
			//내림차순 1
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
			System.out.println("Comparator<Member> 호출");
			return o1.name.compareTo(o2.name); //문자열을 사전순으로 오름차순
			//return o2.name.compareTo(o1.name); //문자열을 사전순으로 내림차순
					
		}
		
	}

	/*
	 * 결론은 compareable은 기본 정렬기준은 구현하는데 사용한다.- 정렬을 하고 싶다면 반드시 구현해야한다.
	 * (compareTo()재정의) 
	 * --> compareable는 compare()매개변수가 두개
	 *
	 * 정렬을 하고 내가 원하는 순서로 정렬을 하고싶다면  compareable후에
	 * 하지만 Comparator는 기본 정렬기준을 말고 다른 기준으로 정렬하고자 할때 사용한다.
	 * --> Comparator는 compare()매개변수가 두개
	 */
	
	

	public static void main(String[] args) {

		Member[] mem = { new Member(100, "abc"), new Member(300, "aaa"), 
						 new Member(400, "ccc"), new Member(200, "bbb") 
						 };
		Member m1 = new Member(1, "신은혁");
		Member m2 = new Member(2, "김우진");
		Member m3 = new Member(5, "유우진");
		Member[] mem1 = { m1, m2, m3 };

		// Arrays.sort() 매개값으로 배열 값이 기본형 타입이면 , 기본적으로 오름차순 정령을 함.

		// 매개값이 기본형 타입이 아니고 implements Comparable<T>을 구현 했다면
		// compareTo() 리턴 값을 가지고 정렬을 한다.

		Arrays.sort(mem1); // compareTo() 리턴 값이 오름차순 내림차순을 정렬한다.
							// 1(양수)리턴을 하면 내림차순 (5-2-1)
		System.out.println(Arrays.toString(mem1));
		
		Arrays.sort(mem, new NameAscending()); // new NameAscending() 비교자 제시
		System.out.println(Arrays.toString(mem));
	}
}

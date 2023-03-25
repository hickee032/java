package sec03_arrays_sort;

import java.util.Arrays;
import java.util.Comparator;

public class SortExample {

	public static void main(String[] args) {

		int[] scores = new int[] { 55, 100, 8, 8, 23 };

		// 기본형 타입이나 string클래스는 Arrays.sort()하면 기본적으로 오름차순 정렬이 이루어진다.
		Arrays.sort(scores);

		System.out.println("기본형 타입 소팅 후 - " + Arrays.toString(scores));

		String[] names = new String[] { "김갑수", "배유빈", "최문석", "김다솔", "정성윤" };

		Arrays.sort(names);
		System.out.println("String 타입 소팅 후 - " + Arrays.toString(names));

		Member m1 = new Member("홍길동");
		Member m2 = new Member("박동수");
		Member m3 = new Member("김연아");

		Member[] members = { m1, m2, m3 };

//		new Comparator<>()를 익명구현객체로 제시한 형태
		
//		Arrays.sort(members, new Comparator<Member>() {
//
//			@Override
//			public int compare(Member o1, Member o2) {
//
//				return o1.name.compareTo(o2.name);
//			}
//
//		});

		Arrays.sort(members);
		System.out.println("Members 소팅 후 - " + Arrays.toString(members));
		int index = Arrays.binarySearch(members, m1);
		System.out.println("m1 인스턴스가 있는 인덱스 : "+index+" 찾는 객체 :  "+members[index]);
	}

}

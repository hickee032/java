package sec01_List.exam03_LinkedList;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListExample {

	// 비순차적 데이터의 추가및 삭제에는 ArrayList 보다 LinkedList가 훨씬 더 좋고 빠르다.

	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<String>();
		LinkedList<String> list2 = new LinkedList<String>();

		DecimalFormat dFormat = new DecimalFormat("#,###");
		long startTime = 0;
		long endTime = 0;

		System.out.println("비순차적 데이터 추가");
		startTime = System.nanoTime();
		for (int i = 0; i < 100000; i++) {
			// ArrayList 0번째에 계속 i 값을 넣는 다. ---> 비순차적 0번째에 넣기 때문에
			// 뒤로 계속 밀려난다.
			list1.add(0, String.valueOf(i));

		}
		endTime = System.nanoTime();
		System.out.println("ArrayList 걸린시간 - " + dFormat.format(endTime - startTime) + "ns");
		startTime = System.nanoTime();
		for (int i = 0; i < 100000; i++) {
			// LinkedList 0번째에 계속 i값을 넣는다.
			list2.add(0, String.valueOf(i));
		}

		endTime = System.nanoTime();
		System.out.println("LinkedList 걸린시간 - " + dFormat.format(endTime - startTime) + "ns");

		// 순차적 데이터

		System.out.println("\n순차적 데이터 추가");
		startTime = System.nanoTime();
		for (int i = 0; i < 1000000; i++) {
			// ArrayList 순차적으로 i 값을 넣는 다.
			list1.add(String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("ArrayList 걸린시간 - " + dFormat.format(endTime - startTime) + "ns");

		startTime = System.nanoTime();
		for (int i = 0; i < 1000000; i++) {
			// LinkedList 0번째에 계속 i값을 넣는다.
			list2.add(String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("LinkedList 걸린시간 - " + dFormat.format(endTime - startTime) + "ns");

		// 접근시간 테스트
		System.out.println("\n접근시간 테스드");
		startTime = System.nanoTime();
		for (int i = 0; i < 100000; i++) {
			// ArrayList 접근
			list1.get(i);
		}
		endTime = System.nanoTime();
		System.out.println("ArrayList 걸린시간 - " + dFormat.format(endTime - startTime) + "ns");

		startTime = System.nanoTime();
		for (int i = 0; i < 100000; i++) {
			// LinkedList 접근
			list2.get(i);
		}
		endTime = System.nanoTime();
		System.out.println("LinkedList 걸린시간 - " + dFormat.format(endTime - startTime) + "ns");

		// 순차적 데이터삭제
		System.out.println("\n순차적 데이터 삭제");
		startTime = System.nanoTime();
		for (int i = list1.size() - 1; i >= 0; i--) {
			// ArrayList 순차적으로 삭제
			list1.remove(i);
		}
		endTime = System.nanoTime();
		System.out.println("ArrayList 걸린시간 - " + dFormat.format(endTime - startTime) + "ns");

		startTime = System.nanoTime();
		for (int i = list2.size() - 1; i >= 0; i--) {
			// LinkedList 순차적으로 삭제
			list2.remove(i);
		}
		endTime = System.nanoTime();
		System.out.println("LinkedList 걸린시간 - " + dFormat.format(endTime - startTime) + "ns");
		
		/* 결론
		 * 
		 * 지금까지 살펴본 예제로 보면 순차적으로 삭제 삽입 접근은 ArrayList가 빠르다.
		 *  반면에 중간삽입 삭제는 LinkedList가 빠르다는 것을 알수있다. 
		 *  -->상황에 따라 자료 구조에따라 ArrayList와 LinkedList를 알맞게 써줘야 할것이다.
		 */ 

	}

}

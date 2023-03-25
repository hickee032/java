package sec01_exam_objects;

import java.util.Arrays;
import java.util.Objects;

public class EqualsAndDeepEqualsExample {

	public static void main(String[] args) {
		
		Integer o1 = new Integer(1000);
		Integer o2 = new Integer(1000);
		
		//모든 포장객체 Wrapper클래스는 equals()가 오버라이딩 되어있다.
		System.out.println(o1.equals(o2));
		
//		위와 같이 기준이 되는 객체와 비교가 되는 객체를 분리해놓은 형태 또 다른것과 비교할려면 계속 기준을 바꿀 필요가 존재한다.
//		하지만 아래와 같이 Objects.equals()유지보수가 상당히 유리하다-->기준을 내 마음대로 정하고 .
		
		//유지 보수 측면에서 Objects.equals(,)이 더 좋다.
		System.out.println(Objects.equals(o1, o2));
		
		Integer[] arr1 = {new Integer(1),new Integer(2)};
		Integer[] arr2 = {1,2};
		
		//Objects.equals() --> 참조 타입이 들어오면 주소 비교
		System.out.println(Objects.equals(arr1, arr2));
		
		//Objects.deepEquals() --> 깊은비교
		//Arrays.deepEquals() ↗
		System.out.println(Objects.deepEquals(arr1, arr2));
		System.out.println(Arrays.deepEquals(arr1, arr2));
							
				
		

	}

}

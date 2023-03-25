package sec05_deep_clone;

import java.util.Arrays;

public class MemberExample {

	public static void main(String[] args) {

		Member original = new Member("홍길동", 25, new int[] { 90, 100 }, new Car("소나타"));

		Member cloned = original.getMember();// 깊은 복제 가지고 옴
		// 얕은 복제를 했다면 원본 객체의 값도 변경 깊은 복제를 했지 때문에 참조형 타입에 영향이 없다.

		cloned.scores[0] = -9999;
		cloned.car.model = "그랜저";

		System.out.println(Arrays.toString(original.scores) + "Car 모델" + original.car.model);
		System.out.println(Arrays.toString(cloned.scores) + "Car 모델" + cloned.car.model);

//		System.out.println(Arrays.toString(original.scores));
//		System.out.println(Arrays.toString(cloned.scores));

	}

}

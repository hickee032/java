package sec04_thin_clone;

import java.util.Arrays;

public class MemberExample {

	public static void main(String[] args) {

		Member original = new Member("blue", "ȫ�浿", "12345", 25, true, new int[] { 90, 100 });

		Member cloned = original.getMember();

		cloned.age = 150;
		cloned.scores[0] = -777;

		System.out.println(original);
		System.out.println(cloned);

		System.out.println(Arrays.toString(original.scores));
		System.out.println(Arrays.toString(cloned.scores));

	}

}

package sec05_deep_clone;

import java.util.Arrays;

public class MemberExample {

	public static void main(String[] args) {

		Member original = new Member("ȫ�浿", 25, new int[] { 90, 100 }, new Car("�ҳ�Ÿ"));

		Member cloned = original.getMember();// ���� ���� ������ ��
		// ���� ������ �ߴٸ� ���� ��ü�� ���� ���� ���� ������ ���� ������ ������ Ÿ�Կ� ������ ����.

		cloned.scores[0] = -9999;
		cloned.car.model = "�׷���";

		System.out.println(Arrays.toString(original.scores) + "Car ��" + original.car.model);
		System.out.println(Arrays.toString(cloned.scores) + "Car ��" + cloned.car.model);

//		System.out.println(Arrays.toString(original.scores));
//		System.out.println(Arrays.toString(cloned.scores));

	}

}

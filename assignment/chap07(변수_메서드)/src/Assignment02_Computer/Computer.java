package Assignment02_Computer;

public class Computer {

	// int[]�迭��(�ּ�)
	public int sum(int[] values) {

		int sum = 0;

		for (int i = 0; i < values.length; i++)
			// �Ű������� �Ѿ�� values�� ���� �ϰ� �ִ� �ּ� ����
			// �ش��ϴ� �濡���� �� ����� ��ŭ ���� ����
			sum += values[i];

		return sum;

	}

}

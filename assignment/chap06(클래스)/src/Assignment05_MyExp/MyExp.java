package Assignment05_MyExp;

public class MyExp {

	// �ϴ� �ʱ�ȭ�ϰ� ����

	int base = 0;

	int exp = 0;

	int getValue = 0;

	// int result=0; //��� ���� main���� ��Ÿ������ �Ѵ�.

	public int getValue() {

		int getValue = base; // �ʱⰪ�� base�� ����� 2(base)*2

		for (int i = 1; i < exp; i++) // 0���� �����ϸ� 0*base = 0; �� ���´�

			// 1���� �����ؼ� exp ������ �� �ݺ��ϵ��� �Ѵ�.

			getValue *= base; // base�� ���� ������.

		return getValue; // ���� getValue.

	}

}

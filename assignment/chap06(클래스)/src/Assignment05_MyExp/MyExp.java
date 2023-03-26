package Assignment05_MyExp;

public class MyExp {

	// 일단 초기화하고 본다

	int base = 0;

	int exp = 0;

	int getValue = 0;

	// int result=0; //결과 값은 main에서 나타나도록 한다.

	public int getValue() {

		int getValue = base; // 초기값을 base로 해줘야 2(base)*2

		for (int i = 1; i < exp; i++) // 0부터 시작하면 0*base = 0; 이 나온다

			// 1부터 시작해서 exp 전까지 만 반복하도록 한다.

			getValue *= base; // base에 곱해 나간다.

		return getValue; // 리턴 getValue.

	}

}

package Assignment02_Computer;

public class Computer {

	// int[]배열명(주소)
	public int sum(int[] values) {

		int sum = 0;

		for (int i = 0; i < values.length; i++)
			// 매개변수로 넘어온 values에 저장 하고 있는 주소 값에
			// 해당하는 방에가서 그 방길이 만큼 값을 누적
			sum += values[i];

		return sum;

	}

}

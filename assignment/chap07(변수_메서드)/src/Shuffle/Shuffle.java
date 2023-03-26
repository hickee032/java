package Shuffle;

public class Shuffle {

	int[] original = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

	public static int[] shuffle(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			int ran = (int) (Math.random() * arr.length);
			// random
			int tmp = arr[0];
			arr[0] = arr[ran];
			arr[ran] = tmp;
		}
		return arr;
		// return null;
	}

}

package sec_verify04;

public class RandomGraphExample {

	static String printGraph(char ch, int value) {
		String str = "";
		for (int i = 0; i <= value; i++) {

			str += ch;
		}
		String result = str + (value);

		return result;
	}

	public static void main(String[] args) {

		int[] number = new int[100];
		int[] counter = new int[10];

		for (int i = 0; i < counter.length; i++) {
			for (int y = 0; y < number.length; y++) {
				number[y] = (int) (Math.random() * 9);

				if (number[y] == i) {
					counter[i] += 1;
				} else {
				}
			}
			System.out.println(i + "°³¼ö : " + RandomGraphExample.printGraph('#', counter[i]));
		}

	}

}

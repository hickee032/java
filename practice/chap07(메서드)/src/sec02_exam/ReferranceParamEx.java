package sec02_exam;

public class ReferranceParamEx {

	public static void main(String[] args) {

		int[] arr = new int[] { 10, 20 };

		System.out.println(arr[1]);
		arr_change(arr);

		Data d = new Data();
		d.x = 10;
		System.out.println("main() : x=" + d.x);
		System.out.println("arr[1]=" + arr[1]);

		change(d);

		System.out.println("after change(d)");
		System.out.println("main():x =" + d.x);

		System.out.println(arr[1]);

	}

	static void change(Data d) {
		d.x = 1000;
		System.out.println("change():x=" + d.x);

	}

	static void arr_change(int[] arr) {
		arr[1] = 100;
		System.out.println("change():x=" + arr[1]);
	}
}

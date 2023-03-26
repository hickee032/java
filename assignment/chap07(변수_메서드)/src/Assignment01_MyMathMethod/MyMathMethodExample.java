package Assignment01_MyMathMethod;

public class MyMathMethodExample {

	public static void main(String[] args) {

		MyMathMethod math = new MyMathMethod();

		long a = 200;
		long b = 100;

		long add_result = math.add(a, b);

		System.out.println(add_result);

		long subtracr_result = math.subtract(a, b);

		System.out.println(subtracr_result);

		long multiply_result = math.multiply(a, b);

		System.out.println(multiply_result);

		long divide_result = math.divide(a, b);

		System.out.println((double) divide_result);

//=======================================================		

		long static_add = MyMathMethod.add_s(a, b);

		System.out.println(static_add);

		long static_subtracr = MyMathMethod.subtract_s(a, b);

		System.out.println(static_subtracr);

		long static_mutiply = MyMathMethod.multiply_s(a, b);

		System.out.println(static_mutiply);

		long static_divide = MyMathMethod.divide_s(a, b);

		System.out.println((double) static_divide);

	}

}

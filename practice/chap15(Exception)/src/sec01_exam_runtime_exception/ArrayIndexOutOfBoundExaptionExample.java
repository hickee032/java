package sec01_exam_runtime_exception;

public class ArrayIndexOutOfBoundExaptionExample {

	public static void main(String[] args) {

		if (args.length == 2) {
			String data1 = args[0];
			String data2 = args[1];
			System.out.println("args[0]" + data1);
			System.out.println("args[0]" + data2);
		}

		else {
			//실행 매개값이 없으면  ArrayIndexOutOfBoundException 실행
			System.out.println("실행방법");
			System.out.print("java ArrayIndexOutOfBoundException ");
			System.out.println("value1 value2");
		}

	}

}

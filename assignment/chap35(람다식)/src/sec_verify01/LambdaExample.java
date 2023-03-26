package sec_verify01;

public class LambdaExample {

	public static void main(String[] args) {
		MyFunction fi = null;

		fi = () -> {
			System.out.println("1 : 직접 구현한 람다식 MyInterface의 추상메서드 run()");
		};
		fi.run();

		MyFunction fi2 = new MyFunction() {

			@Override
			public void run() {
				System.out.println("2 : 익명구현객체로 MyInterface의 추상메서드 run()");

			}
		};
		fi2.run();

		MyFunction fi3 = getMyFunction();
		fi3 = () -> {
			getMyFunction();
		};

		MyFunction fi4 = null;
		execute(fi4);

	}

	public static void execute(MyFunction m) {
		m = new MyFunction() {

			@Override
			public void run() {
				System.out.println("4 : 매개값의 타입이 MyFunction인 추상 메서드 run()");
			}

		};
		m.run();
	}

	public static MyFunction getMyFunction() {
		MyFunction mf = new MyFunction() {

			@Override
			public void run() {
				System.out.println("3 : 반환 타입이 MyFunction인 메서드로 MyInterface의 추상메서드 run()");
			}

		};
		mf.run();
		return mf;
	}

}

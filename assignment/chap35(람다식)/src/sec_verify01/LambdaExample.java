package sec_verify01;

public class LambdaExample {

	public static void main(String[] args) {
		MyFunction fi = null;

		fi = () -> {
			System.out.println("1 : ���� ������ ���ٽ� MyInterface�� �߻�޼��� run()");
		};
		fi.run();

		MyFunction fi2 = new MyFunction() {

			@Override
			public void run() {
				System.out.println("2 : �͸�����ü�� MyInterface�� �߻�޼��� run()");

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
				System.out.println("4 : �Ű����� Ÿ���� MyFunction�� �߻� �޼��� run()");
			}

		};
		m.run();
	}

	public static MyFunction getMyFunction() {
		MyFunction mf = new MyFunction() {

			@Override
			public void run() {
				System.out.println("3 : ��ȯ Ÿ���� MyFunction�� �޼���� MyInterface�� �߻�޼��� run()");
			}

		};
		mf.run();
		return mf;
	}

}

package sec01_exam_static_instance_class;

public class Nested_Example {

	// �ν��Ͻ� ��� Ŭ����
	class instanceClass {
		int iv = 100;
		// static int cv = 500;

		/*
		 * Nested_Example�� �����Ǿ�߸� �����Ҽ� �ִ� �� static �ν��Ͻ� �����̵����ʾƵ� �����ؾ��Ѵ�. �� �ڰ� ���� �ʴ� ��.
		 */
		public instanceClass() {

			System.out.println("�ν��Ͻ� Ŭ���� ������ ȣ��");
		}

		void instance_Method() {
			System.out.println("�ν��Ͻ� Ŭ���� Method() ȣ��");
		}
	}

	static class staticClass {
		public staticClass() {
			System.out.println("staticŬ���� ������ ȣ��");
		}

		static int cv = 300;
		int iv = 15; // ���� ��� Ŭ���� ��� �ص� �ν��Ͻ� �ʵ带 ������ �ִ�.
						// ���� Ŭ������ �����ڰ� �����ϹǷ� �ν��Ͻ��� �����Ҽ� �����Ƿ�
						// �ν��Ͻ� �ʵ峪 �޼��尡 �����Ҽ� �ִ�.
	}

	public void Method() {
		class LocalClass {

			int iv = 300;
			// static int cv = 500;

			static final int LOCAL = 1000;

			public LocalClass() {
				System.out.println("����Ŭ���� ������ ȣ��");
			}

			void method() {
				System.out.println("����Ŭ���� �޼��� ȣ��" + this.iv);
			}
		}

		LocalClass lc = new LocalClass();
		lc.method();

	}

	public static void main(String[] args) {
		// �ܺ� Ŭ���� ����
		Nested_Example ne = new Nested_Example();
		// �ν��Ͻ� ��� Ŭ���� ����
		Nested_Example.instanceClass ic = ne.new instanceClass();

		System.out.println(ic.iv);
		ic.instance_Method();

		Nested_Example.staticClass sc = new staticClass();
		System.out.println(Nested_Example.staticClass.cv);
		System.out.println(sc.iv);

	}
}

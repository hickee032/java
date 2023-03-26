package sec_verify03;

public class Inner {

	public class InstanceInner {
		final static int CONST = 100;
		int iv = 100;
	}

	static class StaticInner {
		public StaticInner() {

		}

		final static int CONST = 500;
		int iv = 200;
		static int cv = 200;
	}

	public void myMethod() {

		class LocalInner {
			int a = 300;
			final static int v = 300;

		}
		LocalInner li = new LocalInner();
		System.out.println("myMethod()를 호출후 LocalInner클래스 생성후 멤버변수 값 출력 : "+li.a);
		System.out.println("myMethod()를 호출후 final static변수 값 출력 : "+li.v);
	}
}

package sec03_exam_Multitype_parameter;

//제네릭 타입인데 그 타입의 개수가 2개를 지니는 Product클래스이다.
public class Product<T, M> {

	private T t;
	private M m;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}

	public M getM() {
		return m;
	}

	public void setM(M m) {
		this.m = m;
	}

}

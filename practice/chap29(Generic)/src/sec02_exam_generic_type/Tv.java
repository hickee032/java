package sec02_exam_generic_type;

public class Tv<T> {
	// 아래 T값은 개발시에 프로그래머가 구체적으로 지정할때 그 타입으로 변경되어 진다.
	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}

}

package sec01_exam_non_generic_type;

public class Box {
	
	private Object object;
	
	
	//리턴 타입이나 매개변수 가 오브젝트라는 것은 모든 클래스를 매개변수로 받겠다 -- 다형성
	public Object getObject() {
		return this.object;
	}

	public void setObject(Object object) {
		this.object = object;
	}
	
	

}

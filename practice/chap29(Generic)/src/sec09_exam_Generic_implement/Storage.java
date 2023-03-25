package sec09_exam_Generic_implement;

public interface Storage<T> {
	
	//T라는 제네렉 타입을 저장하는 추상메서드
	public void add(T item, int index);
	//T를 index를 통해서 찾아오는 추상메서드
	public T get(int index);

}

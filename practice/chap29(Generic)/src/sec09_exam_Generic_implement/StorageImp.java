package sec09_exam_Generic_implement;

//인터페이스가 제네릭 타입이면 구현객체 역시 제네릭 타입 - 인터 페이스 또한 일종의 조상
public class StorageImp<T> implements Storage<T> {

	private T[] array;
	
	public StorageImp(int capacity) {
		this.array = (T[])(new Object[capacity]);
	}
	
	@Override
	public void add(T item, int index) {
		this.array[index] = item;
		return;
	}
	
	@Override
	public T get(int index) {
		return this.array[index];
	}
	
	public T[] getT() {
		return this.array;
	}
}

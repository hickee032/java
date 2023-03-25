package sec09_exam_Generic_implement;

//�������̽��� ���׸� Ÿ���̸� ������ü ���� ���׸� Ÿ�� - ���� ���̽� ���� ������ ����
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

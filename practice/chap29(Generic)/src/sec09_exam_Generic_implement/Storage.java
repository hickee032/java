package sec09_exam_Generic_implement;

public interface Storage<T> {
	
	//T��� ���׷� Ÿ���� �����ϴ� �߻�޼���
	public void add(T item, int index);
	//T�� index�� ���ؼ� ã�ƿ��� �߻�޼���
	public T get(int index);

}

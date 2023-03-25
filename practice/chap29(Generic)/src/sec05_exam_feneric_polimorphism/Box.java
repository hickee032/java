package sec05_exam_feneric_polimorphism;

import java.util.ArrayList;
import java.util.List;

public class Box<T> {
//list�� �������̽��̴�. ArrayList�� List�� ���� �߱� ������ �ʵ��� ����������
	List<T> list = new ArrayList<T>();

	// list�÷��ǿ��ٰ� ��ü�� �߰� -- ������ ���ϸ� ��ü�� �ּҰ� ����
	public void add(T item) {
		list.add(item);
	}

	// �÷��ǿ� �ִ� ��ü�� �ε����� ã�ƿ���
	public T get(int i) {
		return list.get(i);
	}

	// �÷��� ũ�� ��ȯ
	public int size() {
		return list.size();
	}

	// �÷��ǿ� �ִ� �׸� �� ���
	@Override
	public String toString() {

		return list.toString();
	}
}

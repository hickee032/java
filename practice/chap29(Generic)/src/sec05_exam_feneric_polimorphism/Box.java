package sec05_exam_feneric_polimorphism;

import java.util.ArrayList;
import java.util.List;

public class Box<T> {
//list는 인터페이스이다. ArrayList가 List를 구현 했기 때문에 필드의 다형성적용
	List<T> list = new ArrayList<T>();

	// list컬렉션에다가 객체를 추가 -- 엄밀히 말하면 객체의 주소값 저장
	public void add(T item) {
		list.add(item);
	}

	// 컬렉션에 있는 객체를 인덱스로 찾아오기
	public T get(int i) {
		return list.get(i);
	}

	// 컬렉션 크기 반환
	public int size() {
		return list.size();
	}

	// 컬렉션에 있는 항목 다 출력
	@Override
	public String toString() {

		return list.toString();
	}
}

package sec01_List.exam02_Vector;

import java.util.Iterator;
import java.util.Vector;

public class VetorExample {

	public static void main(String[] args) {
		Vector<Boraed> list = new Vector<Boraed>();
		System.out.println("벡터 용량 : " + list.capacity());

		list.add(new Boraed("제목1", "내용1", "글쓴이1"));
		list.add(new Boraed("제목2", "내용2", "글쓴이2"));
		list.add(new Boraed("제목3", "내용3", "글쓴이3"));
		list.add(new Boraed("제목4", "내용4", "글쓴이4"));
		list.add(new Boraed("제목5", "내용5", "글쓴이5"));

		list.remove(2); // 배열복사 발생
		list.remove(3); // 배열복사 발생

		for (Boraed B : list) {
			System.out.println(B);
		}
		System.out.println("벡터 저장 객체수 : " + list.size());
		System.out.println("벡터 용량 : " + list.capacity()); // 그대로 10개 존재

		list.ensureCapacity(list.capacity()); // 벡터 용량 확보 ensureCapacity()는 보통 두배
		System.out.println("ensureCapacity");
		System.out.println("벡터 저장 확보 후 객체수 : " + list.size());
		System.out.println("벡터 용량 확보 후 : " + list.capacity());

		list.trimToSize();
		System.out.println("trimToSize() 후 객체수 : " + list.size());
		System.out.println("trimToSize() 후  용량: " + list.capacity());

		// 반복자 Iterator<E>를 이용한 방법
		Iterator<Boraed> iterator = list.iterator();
		while (iterator.hasNext()) {
			Boraed boraed = iterator.next();
			System.out.println(boraed);
		}
	}

}

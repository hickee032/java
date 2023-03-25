package sec01_List.exam01_ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEx01 {

	public static void main(String[] args) {
		/*
		 * ArrayList는 warring이 뜨는 데 (제네릭 타입이라서) quick acces에서 error검색 제네릭 탭 에 가서
		 * ignore하면된다 전부다 바뀌므로 조심하자
		 */
		
		ArrayList list = new ArrayList(); //기본적으로 10개의 방이 생성된다.
		System.out.println("저장된 객체수 : "+list.size());
		
		list.add("111");  //boolean add(object obj)
		list.add("222");
		list.add("333");
		
		System.out.println("저장된 객체수 : "+list.size());
		
		//add(new Integer(333)); JDK 1.5부터 추가된 자동박싱기능 이용(래퍼 클래스
		list.add(333); //Integer type ---> 자동박싱
		
		System.out.println("저장된 객체수 : "+list.size());
		
		System.out.println(list);
		System.out.println(list.hashCode()); //--> 주소

		list.add(0, "333");
		System.out.println(list);
		
		list.remove(3); 
		list.remove("333"); //인덱스를 기준으로 가까운것 부터 삭제 된다.
		System.out.println("1 - "+list);
		
		list.add(0, "333");
		System.out.println(list);
		
		System.out.println(list.contains("333"));  //-->포함되어 있는지 확인 있으면 true 아니면 flase
		System.out.println(list.indexOf("333")); //-->포함되어 있는지 확인 없으면 -1
		
		//ArrayList의 각 인덱스게 값을 저장 set(index,object obj)
		for (int i = 0; i < list.size(); i++) {
			list.set(i, i+"");
		}
		
		Iterator iterator = list.iterator();
		while (iterator.hasNext()) {
			String str = (String) iterator.next();
			System.out.println("Iterator 이용 - "+str);		
		}
		
		System.out.println(list);
		
		//다 삭제가 되지 않는 다 왜?-->앞으로 땡겨진다. 즉 0번이 삭제 되면 뒤 인덱스가 땡겨 진다.
		for (int i = 0; i < list.size(); i++) {
			list.remove(i);
		}
		
		//for문으로 다 삭제 할려면 이렇게
		//for (int i = list.size()-1; i >=0; i--) {
		//	list.remove(i);
		//}
		
		//list.clear(); -->list 통으로 날릴때 
		System.out.println(list);
	}

}

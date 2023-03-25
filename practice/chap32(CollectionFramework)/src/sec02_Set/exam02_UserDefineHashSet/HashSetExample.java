package sec02_Set.exam02_UserDefineHashSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		//순서가 없다.
		Set<Member> set = new HashSet<Member>();
		//Set<Member> set = new LinkedHashSet<Member>();  
		//--> 순서를 어느정도 유지하고 싶다면 LinkedHashSet을 사용해라
		//set.add(new Member("홍길동",20));
		//set.add(new Member("홍길동",20));
		//set.add(new Member("홍길동",20));
		
		set.add(new Member("재인",20));
		set.add(new Member("송",20));
		set.add(new Member("민",20));
		set.add(new Member("섭",20));
		set.add(new Member("재인",20));
		
		
		System.out.println("저장된 객체수 : "+set.size());
		
		Iterator<Member> iterator = set.iterator();
		
		while(iterator.hasNext()) {
			Member member = iterator.next();
			System.out.println(member.getName()+", "+member.getAge());
		}
	
			
		

	}

}

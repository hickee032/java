package sec02_Set.exam02_UserDefineHashSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		//������ ����.
		Set<Member> set = new HashSet<Member>();
		//Set<Member> set = new LinkedHashSet<Member>();  
		//--> ������ ������� �����ϰ� �ʹٸ� LinkedHashSet�� ����ض�
		//set.add(new Member("ȫ�浿",20));
		//set.add(new Member("ȫ�浿",20));
		//set.add(new Member("ȫ�浿",20));
		
		set.add(new Member("����",20));
		set.add(new Member("��",20));
		set.add(new Member("��",20));
		set.add(new Member("��",20));
		set.add(new Member("����",20));
		
		
		System.out.println("����� ��ü�� : "+set.size());
		
		Iterator<Member> iterator = set.iterator();
		
		while(iterator.hasNext()) {
			Member member = iterator.next();
			System.out.println(member.getName()+", "+member.getAge());
		}
	
			
		

	}

}

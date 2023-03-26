package sec_verify16;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		
		TreeSet<Student> treeSet = new TreeSet<Student>();

		
		treeSet.add(new Student("김주성", 86));
		treeSet.add(new Student("김동주", 68));
		treeSet.add(new Student("이대호", 100));
		treeSet.add(new Student("김호주", 59));
		treeSet.add(new Student("이주희", 77));
		treeSet.add(new Student("신은혁", 96));

		System.out.println("전체 학생 리스트입니다.\n");
		Iterator<Student> iterator = treeSet.iterator();
		while (iterator.hasNext()) {
			Student st = iterator.next();
			System.out.println("학생 이름 : "+st.getName() + " , 점수 : " + st.getScore());
		}
		
		System.out.println();
		Student ls = treeSet.last();
		System.out.println("최고 점수 : "+ ls.getScore()+" , 학생이름 : "+ls.getName());
	}

}

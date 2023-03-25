package sec03_Map.exam02_UserDifine_hashmap;

import java.util.Objects;

public class Student {

	private int sno;
	private String name;

	public Student(int sno, String name) {
		this.sno = sno;
		this.name = name;
	}

	public int getSno() {
		return sno;
	}

	public String getName() {
		return name;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student student = (Student) obj;
			return this.sno == student.sno&&this.name.equals(student.name);
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		//return this.sno+this.name.hashCode(); //하위 호환성을 위해서 이용한다.
		return Objects.hash(this.sno,this.name); //가장 많이 쓴다.
	}
	
	
	

}

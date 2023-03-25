package sec03_arrays_sort;

public class Member implements Comparable<Member> {
	
	String name;
	
	public Member(String name) {
		
		this.name = name;
	}

	@Override
	public int compareTo(Member o) {
		
		return this.name.compareTo(o.name);
	}
	
	@Override
	public String toString() {
	
		return this.name;
	}
	

}

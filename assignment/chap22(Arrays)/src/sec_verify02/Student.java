package sec_verify02;

public class Student implements Comparable<Student> {

	private String hakbun;
	private String name;

	public Student(String hakbun, String name) {
		this.hakbun = hakbun;
		this.name = name;
	}

	@Override
	public int compareTo(Student o) {

		int a = Integer.parseInt(this.hakbun);
		int b = Integer.parseInt(o.hakbun);

		return b - a;
	}

	public String getHakbun() {
		return hakbun;
	}

	public String getName() {
		return name;
	}
	
	

}

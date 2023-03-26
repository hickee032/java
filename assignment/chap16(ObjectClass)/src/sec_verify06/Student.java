package sec_verify06;

public class Student implements Cloneable {

	private String nID;
	private String szName;

	public Student(String nID, String szName) {
		this.nID = nID;
		this.szName = szName;
	}

	public Student getStudent() {
		System.out.println("Student인스턴스2를 Student인스턴스1으로 얕은 복제를 함");
		Student cloned = null;
	
		System.out.println("Student인스턴스2 : "+cloned);
		try {
			cloned = (Student) this.clone();
			
		} catch (CloneNotSupportedException e) {

			e.printStackTrace();
		}
		return cloned;
	}

	@Override
	public String toString() {

		return "ID는 " + this.nID + " , NAME은" + this.szName;
	}
}

package Stundent;

public class Student extends People {

	int sutudentNo;

	public Student(String name, String ssn, int sutudentNo) {
		super(name, ssn);
		this.sutudentNo = sutudentNo;
	}

	@Override
	public String toString() {
		String str = "name : " + super.name + "\n" + "ssn : " + super.ssn + "\n" + "studentNo : " + this.sutudentNo;
		return str;
	}
}

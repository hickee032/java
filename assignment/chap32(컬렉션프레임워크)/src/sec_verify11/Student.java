package sec_verify11;

import java.util.Objects;

public class Student {
	private int studentNum;
	private String name;

	public Student(int studentNum, String name) {
		this.studentNum = studentNum;
		this.name = name;
	}

	@Override
	public int hashCode() {
		// return (this.studentNum + this.name).hashCode();
		return Objects.hash(this.studentNum, this.name);
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			Student student = (Student) obj;
			return ((student.studentNum == this.studentNum) && (student.name.equals(this.name)));
		}
		return false;
	}

	public int getStudentNum() {
		return studentNum;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		String str = "학번 : " + this.studentNum + " , 이름 : " + this.name;
		return str;
	}

}
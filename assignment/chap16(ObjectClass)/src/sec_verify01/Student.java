package sec_verify01;

public class Student {

	private String studentNum;

	public Student(String studentNum) {
		this.studentNum = studentNum;
	}

	public String getStudentNum() {
		return this.studentNum;
	}

	@Override
	public int hashCode() {
		//int result = Integer.parseInt(studentNum);
		//return result;
		//String 클래스에서 이미 동일한 문자열이라면 hashcode가 똑같이 만들어져 리턴해준다.
		//재정의가 되어있다.
		return studentNum.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			Student stu = (Student) obj;
			if (this.studentNum.equals(stu.studentNum)) {
				return true;
			}
		}
		return false;
	}

}

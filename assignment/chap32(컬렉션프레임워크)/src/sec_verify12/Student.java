package sec_verify12;

public class Student {

	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;

	public Student(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	public int getTotal() {
		int sumT = kor + eng + math;
		return sumT;
	}

	public float getAverage() {
		float avgT = (kor + eng + math) / 3;
		return avgT;
	}

	@Override
	public String toString() {
		return "�̸� : " + this.name + "," + this.ban + "��," + this.no + "��,���� : " + this.kor + "��, ���� : " + this.eng
				+ "��, ���� : " + this.math + "��, ���� : " + this.getTotal() + ", ��� : " + this.getAverage();
	}
}

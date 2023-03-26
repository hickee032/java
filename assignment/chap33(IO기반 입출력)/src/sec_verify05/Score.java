package sec_verify05;

import java.util.ArrayList;
import java.util.Iterator;

public class Score {

	ArrayList<Student> record = new ArrayList<>();
	int koreanTotal = 0;
	int mathTotal = 0;
	int englishTotal = 0;

	public void add(String name, String studentNo, int koreanScore, int mathScore, int englishScore) {
		record.add(new Student(name, studentNo, koreanScore, mathScore, englishScore));
		koreanTotal += koreanScore;
		mathTotal += mathScore;
		englishTotal += englishScore;
	}

	public int getSubjectTotal() {
		int Sjsum = 0;
		Sjsum = koreanTotal + mathTotal + englishTotal;
		return Sjsum;
	}

	public void displayList() {
		System.out.println("이름\t번호\t국어\t수학\t영어\t총점\r\n" + "===========================================");

		@SuppressWarnings("rawtypes")
		Iterator iterator = record.iterator();
		while (iterator.hasNext()) {
			Student student = (Student) iterator.next();
			System.out.println(student);
		}
		System.out.println("===========================================");
		System.out.println(this.record.size()+"명의 총점\t\t"+this.koreanTotal+"\t"+this.mathTotal+"\t"+this.englishTotal+"\t"+this.getSubjectTotal());
		
	}

}

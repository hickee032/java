package sec01_exam;

public class IfNestedExample {

	public static void main(String[] args) {
		
		int score = (int)(Math.random()*101); //0~100���� ���� 0~101�� ������ 101�� 0����
		                                        //(int)(Math.random()*20) +51;
		
		System.out.println("����: "+score);
		String grade = null;
		
		if(score>=90) {
			if(score>=95)
				grade = "A+";
			else
				grade = "A-";
		}
		else if(score>=80) {
			 if(score>=85)
				grade = "B+";
			else
				grade = "B-";
		}
		else if(score>=70) {
			 if(score>=75)
				grade = "C+";
			else
				grade = "C-";
		}
		else if(score>=60) {
			 if(score>=65)
				grade = "D+";
			else
				grade = "D-";
		}
		else {
				grade = "�ʴ� ����� ";
		}
		
		/*
		 * else if(score>=50) { if(score>=55) grade = "B+"; else grade = "B-"; }
		 */
		System.out.println("����: " +grade);
	}

}

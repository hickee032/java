package sec01_exam;

public class IfNestedExample {

	public static void main(String[] args) {
		
		int score = (int)(Math.random()*101); //0~100까지 범위 0~101의 개수는 101개 0포함
		                                        //(int)(Math.random()*20) +51;
		
		System.out.println("점수: "+score);
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
				grade = "너는 재수강 ";
		}
		
		/*
		 * else if(score>=50) { if(score>=55) grade = "B+"; else grade = "B-"; }
		 */
		System.out.println("학점: " +grade);
	}

}

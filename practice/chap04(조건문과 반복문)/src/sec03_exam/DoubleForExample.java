package sec03_exam;

public class DoubleForExample {

	public static void main(String[] args) {

		for(int m=2; m<=9 ; m++) {
			//몇번 루프? 
			System.out.println("***" + m + "단 ***");
			for(int n=1 ; n<=9; n++){
				System.out.println(m+"*"+ n +"="+(m* n ));
		}

	}
	}
}

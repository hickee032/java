package sec01_exam;

public class CardExample {

	public static void main(String[] args) {
		
		//static은 인스턴스 생성 없이 접근 가능
		System.out.println("Card.width = " + Card.width);
		System.out.println("Card.height = " + Card.height);
		
		
		Card c1 = new Card();
		
		c1.kind = "하트";
		c1.number = 7;
		
		//c1.height = 350;
		
		//Card.height = 350;

		System.out.println("c1은 " + c1.kind + ", " +c1.number +
					"이며, 크기는 ("+ Card.width+","+ Card.height+")");
		
		//참조변수.정적(static)변수 - 접근이 가능하지만 반드시 클래스명 정적변수명으로 접근
		Card.width = 50;
		Card.height = 80;
		
		System.out.println("c1은 " + c1.kind + ", " +c1.number +
				"이며, 크기는 ("+ Card.width+","+ Card.height+")");
	}

}

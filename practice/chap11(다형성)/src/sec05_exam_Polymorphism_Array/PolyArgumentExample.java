package sec05_exam_Polymorphism_Array;

public class PolyArgumentExample {

	public static void main(String[] args) {
		
		Buyer b = new Buyer();
		
		b.buy(new Tv());
		b.buy(new Computer());
		b.buy(new Audio());
		
		//for( 가져올 객체    : 가져올 주소      )
		//for(Product p :b.item)
		
		b.buy(new Tv());
		b.buy(new Audio());
		b.buy(new Tv());
		
		b.buy(new Audio());
		b.buy(new Tv());
		b.buy(new Audio());
		b.buy(new Audio());
		
		b.summary();
		
		for(int i = 0 ; i<b.item.length;i++) {
			System.out.println(b.item[i]);
			
			System.out.println();
			
			//향상된 for문
			for(Product p : b.item) {
				System.out.println(p);
			}
		}
		
		

	}

}

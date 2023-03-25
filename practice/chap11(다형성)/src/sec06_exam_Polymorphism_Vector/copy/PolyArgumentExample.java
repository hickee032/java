package sec06_exam_Polymorphism_Vector.copy;

import java.util.Iterator;

public class PolyArgumentExample {

	public static void main(String[] args) {
		
		Buyer b = new Buyer();
		Apple apple = new Apple();
		Computer com = new Computer();
		Audio audio = new Audio();
		
		b.buy(com);
		b.buy(audio);
		b.buy(new Tv());
		b.buy(new Audio());
		b.buy(new Computer());
		b.buy(new Audio());
		b.buy(new Audio());
		b.buy(new Computer());
		b.buy(new Audio());
		b.buy(new Audio());
		b.buy(new Tv());
		b.buy(new Audio());
		b.buy(new Audio());
		
		//반복자
//		Iterator it = b.item.iterator();
//		while(it.hasNext()) {//벡터에서 가져올게 있냐.
//			Product p = (Product)it.next();//있다면 가져와라
//			System.out.println(p);
//		}
//		
		
		System.out.println("현재 백터의 프로덕트개체수 " + b.item.size());
		//b.buy(apple);
		
		b.summary();
		System.out.println();
		b.refund(com);
		b.refund(audio);
		   
		b.summary();
		System.out.println("현재 백터에 Product객체의 수 : " + b.item.size());

		
		
		
		//for( 가져올 객체    : 가져올 주소      )
		//for(Product p :b.item)
		
	}

}

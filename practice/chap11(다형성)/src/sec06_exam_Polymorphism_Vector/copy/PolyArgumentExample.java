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
		
		//�ݺ���
//		Iterator it = b.item.iterator();
//		while(it.hasNext()) {//���Ϳ��� �����ð� �ֳ�.
//			Product p = (Product)it.next();//�ִٸ� �����Ͷ�
//			System.out.println(p);
//		}
//		
		
		System.out.println("���� ������ ���δ�Ʈ��ü�� " + b.item.size());
		//b.buy(apple);
		
		b.summary();
		System.out.println();
		b.refund(com);
		b.refund(audio);
		   
		b.summary();
		System.out.println("���� ���Ϳ� Product��ü�� �� : " + b.item.size());

		
		
		
		//for( ������ ��ü    : ������ �ּ�      )
		//for(Product p :b.item)
		
	}

}

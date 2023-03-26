package Assignment_02_Goods;

public class Goods_Class {
	String name = "Nikon";
	int price = 400000;
	int numberOfStock = 30;
	int sold = 50;
	
	public String toString() {
		return "상품 이름 : " + this.name + "\n상품가격 : " + this.price + "\n재고수량 : "+this.numberOfStock
				+"\n팔린수량 : "+this.sold;
		
	}

}

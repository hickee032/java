package sec06_exam_Polymorphism_Vector.copy;

import java.util.Vector;

public class Buyer {

	int money = 100000;
	int bonusPoint = 0;

	// 컬렉션 프레임 워크에 리스트 계열의 하나인 Vector (JDK1.2)의 인스턴스 생성
	// Vector는 기본적으로 10개의 방을 생성 해준다.
	// 10개를 넘어가면 자동으로 늘어난다. 하여 정적인 배열에 비하여 상당히 괜찮은 배열구조이다.
	// 배열기반이기 때문에 인덱스를 통해 접근 수정이 가능하다.
	Vector item = new Vector();

	void buy(Product p) {
		if (this.money < p.price) {
			System.out.println("잔액부족");
			return;
		}
		this.money -= p.price;
		this.bonusPoint += p.bounsPoint;

		this.item.add(p); // 매개변수로 넘어온 제품을 vector에 추가(뒤에다가 하나씩 추가함)
		System.out.println(p.toString() + "을 구입하셨습니다.");

	}

	public void refund(Product p) {
		if (item.remove(p)) {
			this.money += p.price; // 환불 받은 금액 증가.
			this.bonusPoint -= p.bounsPoint;
			System.out.println(p + " 반품");
		} else {
			System.out.println("구입하신 제품목록 중 해당하는 제품이 존재하지 않습니다.");
		}
	}

	// 구매한 물품에대한 정보를 요약하는 summary()메서드
	public void summary() {
		int sum = 0;
		String itemList = "";

		if (item.isEmpty()) {
			System.out.println("구입한 물품이 없엉");
			return;
		}

		for (int i = 0; i < item.size(); i++) {
			// 타입 체크 (true가 나오면 형변환 가능)
			if (item.get(i) instanceof Product) {
				Product p = (Product) item.get(i); // 강제 타입 캐스팅 다운 캐스팅
				sum += p.price;
				//삼항연산자.
				itemList += ((i == 0) ? "" + p : "," + p);
			}
			else {
				System.out.println("Product객체가 아닙니다.");
			}

		}
		System.out.println("총 구입 금액 "+sum);
		System.out.println("구입 리스트" + itemList);
	}
}
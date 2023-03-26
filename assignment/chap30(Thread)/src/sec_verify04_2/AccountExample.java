package sec_verify04_2;

public class AccountExample {

	public static void main(String[] args) {
		WithDrawThread1 w1 = new WithDrawThread1();
		w1.setName("맘");
		System.out.println(w1.getName() + " 이/가 입금 : 1000원");
		

	}

}

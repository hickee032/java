package ShopService;

public class ShopServiceExample {

	public static void main(String[] args) {
		
		ShopService s1 = ShopService.getShopService();
		ShopService s2 = ShopService.getShopService();
		
		if(s1==s2) {
			System.out.println("���� �ּ�");
			System.out.println("s1�� �ּ�"+s1);
			System.out.println("s2�� �ּ�"+s2);
		}
		else {
			System.out.println("�ٸ� �ּ�");
		}
	}

}

package ShopService;

public class ShopServiceExample {

	public static void main(String[] args) {
		
		ShopService s1 = ShopService.getShopService();
		ShopService s2 = ShopService.getShopService();
		
		if(s1==s2) {
			System.out.println("鞍篮 林家");
			System.out.println("s1狼 林家"+s1);
			System.out.println("s2狼 林家"+s2);
		}
		else {
			System.out.println("促弗 林家");
		}
	}

}

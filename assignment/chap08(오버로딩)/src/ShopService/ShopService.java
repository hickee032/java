package ShopService;

public class ShopService {

	private static ShopService SSe = new ShopService();
	
	private ShopService () {
		
	}
	
	public static ShopService getShopService() {
		return SSe;
	}
}

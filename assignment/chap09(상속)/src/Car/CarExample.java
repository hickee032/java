package Car;

public class CarExample {

	public static void main(String[] args) {
		
		Sedan se = new Sedan();
		se.setColor("³ë¶û");
		se.setSpeed(300);
		se.seatNum = 5;		
		System.out.println(se);
		
		Truck tk = new Truck();
		tk.setColor("ÆÄ¶û");
		tk.setSpeed(100);
		tk.capacity = 50;		
		System.out.println(tk);

	}

}

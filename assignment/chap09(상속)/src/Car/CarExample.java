package Car;

public class CarExample {

	public static void main(String[] args) {
		
		Sedan se = new Sedan();
		se.setColor("���");
		se.setSpeed(300);
		se.seatNum = 5;		
		System.out.println(se);
		
		Truck tk = new Truck();
		tk.setColor("�Ķ�");
		tk.setSpeed(100);
		tk.capacity = 50;		
		System.out.println(tk);

	}

}

package sec_verify02;

public class MonitorExample {
	
	public static void comp(Monitor a, Monitor b) {

		if(a.hashCode()!=b.hashCode()) {
			System.out.println(" �ٸ� ����� �Դϴ�.");
		}
		else {
			System.out.println(" ���� ����� �Դϴ�.");
		}	
	}
	public static void main(String[] args) {

		Monitor m1 = new Monitor("UDEA", 19, 210000);
		Monitor m2 = new Monitor("FLfATRON", 22, 250000);
		Monitor m3 = new Monitor("UDEA", 19, 210000);
		Monitor m4 = new Monitor("SAMSUNG", 25, 310000);
		
		System.out.print("m1 �� m2 ��");
		comp(m1, m2);
		System.out.print("m1 �� m3 ��");
		comp(m1, m3);
		System.out.print("m1 �� m4 ��");
		comp(m1, m4);
		
		
		
		

		
		

	}

}

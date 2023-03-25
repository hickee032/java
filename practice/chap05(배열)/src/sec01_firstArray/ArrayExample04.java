package sec01_firstArray;

public class ArrayExample04 {

	public static void main(String[] args) {
			//스트링은 클래스이
		String[] names = new String[3];
		
		//attach
		names[0] = new String ("김연아");
		names[1] = new String ("손연재");
		names[2] = new String ("김사랑");
		
		for(int i=0; i< names.length; i++) {
			System.out.println("names[" + i + "]:" +names[i]);
		}											//names[i].toString 스트링 타입이기 때문에 toString이 자동
		
		String tmp = names[2];
		
		
		System.out.println("tmp: " + tmp);

		names[0] = "Yu";
		
		for(int i=0;i<names.length;i++) {
			System.out.println("names[" + i + "]:" +names[i]);
		}
	}

}

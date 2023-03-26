package SmartPhone;

public class SmartPhoneExample {

	public static void main(String[] args) {
		
		MobilePhone mo = new SmartPhone();
		MP3 mp = new SmartPhone();
		PDA pda = new PDA();
		SmartPhone sm = new SmartPhone();
		
		mo.sendCall();
		mo.receiveCall();
		mo.sendSMS();
		mo.receiveSMS();
		
		mp.play();
		mp.stop();
		
		pda.calculate(3, 5);
		
		sm.scheduler();
		sm.applicationManager();
		
		
		

	}

}

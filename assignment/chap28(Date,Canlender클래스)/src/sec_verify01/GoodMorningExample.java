package sec_verify01;

import java.util.Calendar;

public class GoodMorningExample {

	public static void main(String[] args) {
		
		Calendar time  = Calendar.getInstance();
		String str = "";
		int hour = time.get(Calendar.HOUR_OF_DAY);
		 
		if((4<hour)&&(hour<12)){
			 str = "�����̳׿�";
		 }
		 else if((12<hour)&&(hour<18)) {
			 str = "���ĳ׿�";
		 }
		 else if((18<hour)&&(hour<20)) {
			 str = "�����̳׿�";
		 }
		 else {
			 str = "���̳׿�";
		 }
		 
		System.out.println("������ "+time.get(Calendar.HOUR)+"��"+time.get(Calendar.MINUTE)+"�� �Դϴ�.");
		System.out.println(str);

	}

}

package sec_verify01;

import java.util.Calendar;

public class GoodMorningExample {

	public static void main(String[] args) {
		
		Calendar time  = Calendar.getInstance();
		String str = "";
		int hour = time.get(Calendar.HOUR_OF_DAY);
		 
		if((4<hour)&&(hour<12)){
			 str = "오전이네요";
		 }
		 else if((12<hour)&&(hour<18)) {
			 str = "오후네요";
		 }
		 else if((18<hour)&&(hour<20)) {
			 str = "저녁이네요";
		 }
		 else {
			 str = "밤이네요";
		 }
		 
		System.out.println("지금은 "+time.get(Calendar.HOUR)+"시"+time.get(Calendar.MINUTE)+"분 입니다.");
		System.out.println(str);

	}

}

package sec01_Format;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDataFormatExample {

	public static void main(String[] args) {

		Date now = new Date();
		
		System.out.println(now);
		SimpleDateFormat sdf = new SimpleDateFormat("yy-MM-dd : hh : mm : ss ");
		System.out.println(sdf.format(now));
		
		sdf = new SimpleDateFormat("yyyy년 MM월 dd일 a hh : mm : ss");
		System.out.println(sdf.format(now));
		
		sdf = new SimpleDateFormat("오늘은 E요일");
		System.out.println(sdf.format(now));
		
		//format중에 D는 올해를 기준으로 몇번째 날인지 알아내는 것
		sdf = new SimpleDateFormat("올해의 D번쨰 날");
		System.out.println(sdf.format(now));
		
		//format중에 D는 이번달을 기준으로 몇번째 날인지 알아내는 것
		sdf = new SimpleDateFormat("이달의 d번쨰 날");
		System.out.println(sdf.format(now));

	}

}

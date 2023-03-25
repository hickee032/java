package sec01_Date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample {

	public static void main(String[] args) {
		// Date클래스는 타임 스탬프 기능으로 많이 사용한다.
		Date now = new Date();
		
		//Date클래스의 참조변수를 출력하면 세계 표준시 UTC형태르 출력된다.
		System.out.println(now);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 a hh시 mm분 ss초");
		System.out.println(sdf.format(now));

	}

}

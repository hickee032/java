package sec_verify02;

import java.util.Calendar;

public class FirstDateExample {

	public static void main(String[] args) {
		
		Calendar now = Calendar.getInstance();
		   printCalendar("���� ", now);

		   Calendar firstDate = Calendar.getInstance();
		   firstDate.clear();
		   firstDate.set(2012, 11, 25); // 2012�� 12�� 25��. 12���� ǥ���ϱ� ���� month�� 11�� ����
		   firstDate.set(Calendar.HOUR_OF_DAY, 20); // ���� 8��
		   firstDate.set(Calendar.MINUTE, 30); // 30��
		   printCalendar("ó�� ����Ʈ�� ���� ", firstDate);
		

	}
	private static void printCalendar(String a, Calendar c) {
		 
		int week    = c.get(Calendar.DAY_OF_WEEK);      
	      String strWeek = "";
	      
	      switch(week) 
	      {
	         case Calendar.MONDAY:
	            strWeek = "��";
	            break;
	         case Calendar.TUESDAY:
	            strWeek = "ȭ";
	            break;
	         case Calendar.WEDNESDAY:
	            strWeek = "��";
	            break;
	         case Calendar.THURSDAY:
	            strWeek = "��";
	            break;
	         case Calendar.FRIDAY:
	            strWeek = "��";
	            break;
	         case Calendar.SATURDAY:
	            strWeek = "��";
	            break;
	         default:
	            strWeek = "��";
	      }
	      int APm    = c.get(Calendar.AM_PM); 
	      String strm = "";
	      if(APm==0) {
	    	  strm = "����";
	      }
	      else {
	    	  strm = "����";
	      }
	      
	      System.out.println(a + c.get(Calendar.YEAR)+"/ "+c.get(Calendar.MONTH)+"/ "+c.get(Calendar.DATE)
				+strWeek+"���� "+strm+" "+c.get(Calendar.HOUR)+"�� "+c.get(Calendar.MINUTE)+"�� "+c.get(Calendar.SECOND)+"�� "+c.get(Calendar.MILLISECOND)+"�и���");
		return;
				//a + c.get(Calendar.YEAR)+"/"+c.get(Calendar.MONTH)+"/"+c.get(Calendar.DATE)
				//+strWeek+strm+c.get(Calendar.HOUR_OF_DAY)+c.get(Calendar.MINUTE)+c.get(Calendar.SECOND);
		
	}
	

}

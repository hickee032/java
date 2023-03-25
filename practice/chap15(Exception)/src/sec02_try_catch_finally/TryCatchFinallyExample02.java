package sec02_try_catch_finally;

public class TryCatchFinallyExample02 {

	public static void main(String[] args) {

		String str1 = args[0]; //100
		//String str1 = null;
		String str2 = args[1]; //200

		String[] strArr = new String[] { str1, str2 };

		int value = 0;
		// System.out.println(strArr[0].toString());
		//for(int i = 0 ;i <strArr.length;i++) {

		for (int i = 0; i < 4; i++) {
			
			try {
				value = Integer.parseInt(strArr[i]);
			}
			// 다중 catch
			catch (ArrayIndexOutOfBoundsException| NumberFormatException e) {
				System.out.println("값 : " + value);
				System.out.println(e.toString());
				// System.out.println("예외가 발생한 값 : " + strArr[i]);
			}
			/*
			 * catch (NumberFormatException e) { System.out.println("예외가 발생한 값 : " +
			 * strArr[i]); System.out.println("숫자로 반환 불가"); }
			 */

			
			 //finally { System.out.println("strArr[" + i + "] = " + strArr[i]); }
			 
		}
	}

}

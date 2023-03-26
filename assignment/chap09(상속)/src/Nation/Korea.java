package Nation;

public class Korea extends Asia {

	String country;

	@Override
	public String toString() {

		String str = "내가 살고 있는 나라 : " + this.country + "이며,내 나라는" + super.country + "에 속합니다.";

		return str;
	}

}

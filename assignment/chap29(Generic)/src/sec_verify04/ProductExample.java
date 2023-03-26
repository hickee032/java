package sec_verify04;

public class ProductExample {

	public static void main(String[] args) {
		Product<Audio, Monitor> sr = new Product<Audio, Monitor>();
		sr.setA(new Audio("Sony", "최상", 4));
		sr.setM(new Monitor("삼성", 27, 350000));

		System.out.println("내 오디오는 " + sr.getA().getBrand() + "제조사 이며, 음질은 " + sr.getA().getQuality() + "이고 "
				+ sr.getA().getChannel() + "채널이다.");
		System.out.println();
		System.out.println("모니터의 상세\n" + "브랜드 : " + sr.getM().getCompany() + "\n인치 : " + sr.getM().getInch() + "\n가격 : "
				+ sr.getM().getPrice());

	}

}

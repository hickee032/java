package sec03_exam_single_inheritance;

public class TVCREXample {

	public static void main(String[] args) {
		
		TVCR tvcr = new TVCR();
		Tv tv = new Tv();
		
		tv.power();
		
		
		tvcr.power();
		System.out.println(tvcr.getChannel());
		System.out.println(tvcr.channel);
		
		tvcr.vcr.play();
		tvcr.play();
		tvcr.stop();
		tvcr.rew();
		tvcr.ff();
		tvcr.channelUp();
		tvcr.channelDown();

	}

}

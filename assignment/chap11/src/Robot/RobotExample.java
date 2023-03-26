package Robot;

public class RobotExample {

	static void action(Robot r) {

		if (r instanceof DanceRobot) {
			((DanceRobot) r).dance();
			return;
		}
		if (r instanceof DrawRobot) {
			((DrawRobot) r).draw();
			return;
		}
		if (r instanceof SongRobot) {
			((SongRobot) r).song();
			return;
		}
	}

	public static void main(String[] args) {

		Robot r = new DanceRobot();

		RobotExample.action(r);

		Robot r1 = new DrawRobot();

		RobotExample.action(r1);

		Robot r2 = new SongRobot();

		RobotExample.action(r2);

	}
}

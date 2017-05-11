package robots.pos_robots;

/**
 * 
 * @author Andrey Teplyakov (teplyakov_a@subway.com) 03/14/2017
 * 
 *
 */
public class ComboRobot {
	
	final private static String HANDSHAKE_ALIAS = "handshake";
	private Robot robot;

	public ComboRobot(String robotIP) {
		robot = new Robot(robotIP, Robot.COMBO_ROBOT);
		// TODO Auto-generated constructor stub
	}

	public ComboRobot() {
		robot = new Robot(Robot.COMBO_ROBOT);
		// TODO Auto-generated constructor stub
	}

	public String doHandshake() { return robot.doRequest(HANDSHAKE_ALIAS); }
}
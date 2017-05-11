package robots.pos_robots;

/**
 * 
 * @author Andrey Teplyakov (teplyakov_a@subway.com) 03/14/2017
 *
 */

public class TapRobot {
	
	final private static String TAP_CARD_FROM_SLOT_1_ALIAS = "f";
	final private static String TAP_CARD_FROM_SLOT_2_ALIAS = "g";
	final private static String TAP_CARD_FROM_SLOT_3_ALIAS = "h";
	final private static String TAP_CARD_FROM_SLOT_4_ALIAS = "i";

	final private static String GET_HELP_ALIAS = "?";
	
	private Robot robot;

	public TapRobot(String robotIP) {
		robot = new Robot(robotIP, Robot.TAP_ROBOT);
		// TODO Auto-generated constructor stub
	}

	public TapRobot() {
		robot = new Robot(Robot.TAP_ROBOT);
		// TODO Auto-generated constructor stub
	}

	public String tapCardFromSlot1() { return robot.doRequest(TAP_CARD_FROM_SLOT_1_ALIAS); }
	public String tapCardFromSlot2() { return robot.doRequest(TAP_CARD_FROM_SLOT_2_ALIAS); }
	public String tapCardFromSlot3() { return robot.doRequest(TAP_CARD_FROM_SLOT_3_ALIAS); }
	public String tapCardFromSlot4() { return robot.doRequest(TAP_CARD_FROM_SLOT_4_ALIAS); }

	public String getHelp() { return robot.doRequest(GET_HELP_ALIAS); }
}


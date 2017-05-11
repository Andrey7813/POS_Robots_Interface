package robots.pos_robots;

/**
 * 
 * @author Andrey Teplyakov (teplyakov_a@subway.com) 03/14/2017
 *
 */

public class SwipeRobot {
	
	final private static String SWIPE_CARD_FROM_SLOT_1_ALIAS = "1";
	final private static String SWIPE_CARD_FROM_SLOT_2_ALIAS = "2";
	final private static String SWIPE_CARD_FROM_SLOT_3_ALIAS = "3";
	final private static String SWIPE_CARD_FROM_SLOT_4_ALIAS = "4";
	final private static String SWIPE_CARD_FROM_SLOT_5_ALIAS = "5";

	final private static String GET_HELP_ALIAS = "?";
	
	private Robot robot;

	public SwipeRobot(String robotIP) {
		robot = new Robot(robotIP, Robot.SWIPE_ROBOT);
		// TODO Auto-generated constructor stub
	}

	public SwipeRobot() {
		robot = new Robot(Robot.SWIPE_ROBOT);
		// TODO Auto-generated constructor stub
	}

	public String swipeCardFromSlot1() { return robot.doRequest(SWIPE_CARD_FROM_SLOT_1_ALIAS); }
	public String swipeCardFromSlot2() { return robot.doRequest(SWIPE_CARD_FROM_SLOT_2_ALIAS); }
	public String swipeCardFromSlot3() { return robot.doRequest(SWIPE_CARD_FROM_SLOT_3_ALIAS); }
	public String swipeCardFromSlot4() { return robot.doRequest(SWIPE_CARD_FROM_SLOT_4_ALIAS); }
	public String swipeCardFromSlot5() { return robot.doRequest(SWIPE_CARD_FROM_SLOT_5_ALIAS); }
	
	public String getHelp() { return robot.doRequest(GET_HELP_ALIAS); }
}


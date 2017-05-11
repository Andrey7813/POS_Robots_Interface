package robots.pos_robots;

/**
 * 
 * @author Andrey Teplyakov (teplyakov_a@subway.com) 03/14/2017
 *
 */

public class TapsterRobot {
	
	
	final private static String PUSH_CANCEL_ALIAS = "a";
	final private static String PUSH_ENTER_ALIAS = "b";
	
	final private static String MOVE_TO_SAVE_POSITION_1_ALIAS = "c";
	final private static String MOVE_TO_SAVE_POSITION_2_ALIAS = "d";
	final private static String MOVE_TO_REST_POSITION_ALIAS = "e";
	

	final private static String GET_HELP_ALIAS = "?";
	
	private Robot robot;

	public TapsterRobot(String robotIP) {
		robot = new Robot(robotIP, Robot.TAPSTER_ROBOT);
		// TODO Auto-generated constructor stub
	}

	public TapsterRobot() {
		robot = new Robot(Robot.TAPSTER_ROBOT);
		// TODO Auto-generated constructor stub
	}

	public String enterPIN(String PIN) { return robot.doRequest(PIN); }
	
	public String pushCANCELButton() { return robot.doRequest(PUSH_CANCEL_ALIAS); }
	public String pushENTERButton() { return robot.doRequest(PUSH_ENTER_ALIAS); }
	
	public String moveToSavePosition1() { return robot.doRequest(MOVE_TO_SAVE_POSITION_1_ALIAS); }
	public String moveToSavePosition2() { return robot.doRequest(MOVE_TO_SAVE_POSITION_2_ALIAS); }
	public String moveToRestPosition() { return robot.doRequest(MOVE_TO_REST_POSITION_ALIAS); }

	public String getHelp() { return robot.doRequest(GET_HELP_ALIAS); }
}

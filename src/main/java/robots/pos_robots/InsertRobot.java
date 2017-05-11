package robots.pos_robots;

/**
 * 
 * @author Andrey Teplyakov (teplyakov_a@subway.com) 03/14/2017
 *
 */

public class InsertRobot {
	
	final private static String INSERT_CARD_FROM_SLOT_1_ALIAS = "1";
	final private static String INSERT_CARD_FROM_SLOT_2_ALIAS = "2";
	final private static String INSERT_CARD_FROM_SLOT_3_ALIAS = "3";
	final private static String INSERT_CARD_FROM_SLOT_4_ALIAS = "4";
	final private static String INSERT_CARD_FROM_SLOT_5_ALIAS = "5";
	final private static String INSERT_CARD_FROM_SLOT_6_ALIAS = "6";
	
	final private static String INSERT_CARD_FROM_SLOT_1_AND_WAIT_FOR_PIN_ALIAS = "e";
	final private static String INSERT_CARD_FROM_SLOT_2_AND_WAIT_FOR_PIN_ALIAS = "f";
	final private static String INSERT_CARD_FROM_SLOT_3_AND_WAIT_FOR_PIN_ALIAS = "g";
	final private static String INSERT_CARD_FROM_SLOT_4_AND_WAIT_FOR_PIN_ALIAS = "h";
	final private static String INSERT_CARD_FROM_SLOT_5_AND_WAIT_FOR_PIN_ALIAS = "i";
	final private static String INSERT_CARD_FROM_SLOT_6_AND_WAIT_FOR_PIN_ALIAS = "j";
	
	final private static String TAKE_CARD_FROM_DEVICE_AND_RETURN_INTO_SLOT_1_ALIAS = "7";
	final private static String TAKE_CARD_FROM_DEVICE_AND_RETURN_INTO_SLOT_2_ALIAS = "8";
	final private static String TAKE_CARD_FROM_DEVICE_AND_RETURN_INTO_SLOT_3_ALIAS = "9";
	final private static String TAKE_CARD_FROM_DEVICE_AND_RETURN_INTO_SLOT_4_ALIAS = "a";
	final private static String TAKE_CARD_FROM_DEVICE_AND_RETURN_INTO_SLOT_5_ALIAS = "b";
	final private static String TAKE_CARD_FROM_DEVICE_AND_RETURN_INTO_SLOT_6_ALIAS = "c";
	
	final private static String GET_HELP_ALIAS = "?";

	private Robot robot;
	
	public InsertRobot(String robotIP) {
		robot = new Robot(robotIP, Robot.INSERT_ROBOT);
		// TODO Auto-generated constructor stub
	}

	public InsertRobot() {
		robot = new Robot(Robot.INSERT_ROBOT);
		// TODO Auto-generated constructor stub
	}

	public String insertCardFromSlot1() { return robot.doRequest(INSERT_CARD_FROM_SLOT_1_ALIAS); }
	public String insertCardFromSlot2() { return robot.doRequest(INSERT_CARD_FROM_SLOT_2_ALIAS); }
	public String insertCardFromSlot3() { return robot.doRequest(INSERT_CARD_FROM_SLOT_3_ALIAS); }
	public String insertCardFromSlot4() { return robot.doRequest(INSERT_CARD_FROM_SLOT_4_ALIAS); }
	public String insertCardFromSlot5() { return robot.doRequest(INSERT_CARD_FROM_SLOT_5_ALIAS); }
	public String insertCardFromSlot6() { return robot.doRequest(INSERT_CARD_FROM_SLOT_6_ALIAS); }
	
	public String insertCardFromSlot1AndWaitForPIN() { return robot.doRequest(INSERT_CARD_FROM_SLOT_1_AND_WAIT_FOR_PIN_ALIAS); }
	public String insertCardFromSlot2AndWaitForPIN() { return robot.doRequest(INSERT_CARD_FROM_SLOT_2_AND_WAIT_FOR_PIN_ALIAS); }
	public String insertCardFromSlot3AndWaitForPIN() { return robot.doRequest(INSERT_CARD_FROM_SLOT_3_AND_WAIT_FOR_PIN_ALIAS); }
	public String insertCardFromSlot4AndWaitForPIN() { return robot.doRequest(INSERT_CARD_FROM_SLOT_4_AND_WAIT_FOR_PIN_ALIAS); }
	public String insertCardFromSlot5AndWaitForPIN() { return robot.doRequest(INSERT_CARD_FROM_SLOT_5_AND_WAIT_FOR_PIN_ALIAS); }
	public String insertCardFromSlot6AndWaitForPIN() { return robot.doRequest(INSERT_CARD_FROM_SLOT_6_AND_WAIT_FOR_PIN_ALIAS); }
	
	public String takeCardFromDeviceAndReturnIntoSlot1() { return robot.doRequest(TAKE_CARD_FROM_DEVICE_AND_RETURN_INTO_SLOT_1_ALIAS); }
	public String takeCardFromDeviceAndReturnIntoSlot2() { return robot.doRequest(TAKE_CARD_FROM_DEVICE_AND_RETURN_INTO_SLOT_2_ALIAS); }
	public String takeCardFromDeviceAndReturnIntoSlot3() { return robot.doRequest(TAKE_CARD_FROM_DEVICE_AND_RETURN_INTO_SLOT_3_ALIAS); }
	public String takeCardFromDeviceAndReturnIntoSlot4() { return robot.doRequest(TAKE_CARD_FROM_DEVICE_AND_RETURN_INTO_SLOT_4_ALIAS); }
	public String takeCardFromDeviceAndReturnIntoSlot5() { return robot.doRequest(TAKE_CARD_FROM_DEVICE_AND_RETURN_INTO_SLOT_5_ALIAS); }
	public String takeCardFromDeviceAndReturnIntoSlot6() { return robot.doRequest(TAKE_CARD_FROM_DEVICE_AND_RETURN_INTO_SLOT_6_ALIAS); }
	
	public String getHelp() { return robot.doRequest(GET_HELP_ALIAS); }
	

	
}

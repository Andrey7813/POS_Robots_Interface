package robots.pos_robots;

/**
 * 
 * @author Andrey Teplyakov (teplyakov_a@subway.com), 2017
 *
 */

public class MobileKioskRobot {
	
	final private static String GET_HELP_ALIAS = "{\"commands\":[{\"command\": \"?\", \"comment\":\"Help\"}]}";
	
	private Robot robot;

	public MobileKioskRobot(String robotIP) {
		robot = new Robot(robotIP, Robot.MOBILE_KIOSK_ROBOT);
		// TODO Auto-generated constructor stub
	}

	public MobileKioskRobot() {
		robot = new Robot(Robot.MOBILE_KIOSK_ROBOT);
		// TODO Auto-generated constructor stub
	}

	public String getHelp() { return robot.doPOSTRequestForMobileKiosk(GET_HELP_ALIAS); }
	public String runJSONScenario(String JSONScenario) { return robot.doPOSTRequestForMobileKiosk(JSONScenario); }
}



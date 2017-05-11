package robots.pos_robots;

/**
 * 
 * @author Andrey Teplyakov (teplyakov_a@subway.com) 03/14/2017
 *
 */

public class RobotsExamples {


	public static void main(String[] args) {
		
		//======Create robots' instances
		//General constructors
		TapsterRobot tapsterRobot = new TapsterRobot("10.4.20.125");
		SwipeRobot swipeRobot = new SwipeRobot("10.4.20.125");
		TapRobot tapRobot = new TapRobot("10.4.20.125");
		//Or we can specify IP address
		InsertRobot insertRobot = new InsertRobot("10.4.20.125");
		//Special "robot" for interaction between robots
		ComboRobot comboRobot = new ComboRobot("10.4.20.125");
		
		
		//=====Swipe card from slot #1
		//Move Tapster robot to save position
		tapsterRobot.moveToSavePosition1();
		//Swipe
		swipeRobot.swipeCardFromSlot1();
		//Return Tapster robot to rest position
		tapsterRobot.moveToRestPosition();
		/*
		//=====Insert card from slot #6, enter PIN and return card into slot #6
		//Move Tapster robot to save position #2
		tapsterRobot.moveToSavePosition2();
		//Insert card from slot #6
		insertRobot.insertCardFromSlot6AndWaitForPIN();
		//Enter PIN
		tapsterRobot.moveToRestPosition();
		tapsterRobot.enterPIN("1234");
		tapsterRobot.pushENTERButton();
		tapsterRobot.moveToSavePosition2();
		//Take card from device and return into slot #6
		insertRobot.takeCardFromDeviceAndReturnIntoSlot6();
		//Return Tapster robot to rest position
	    tapsterRobot.moveToRestPosition();
				
		//=====Insert card from slot #1 without PIN code
	    //Move Tapster robot to save position #2
		tapsterRobot.moveToSavePosition2();
		//Take card from slot #1, insert into device, wait and return into slot #1
		insertRobot.insertCardFromSlot1();
		//Return Tapster robot to rest position
	    tapsterRobot.moveToRestPosition();
	    
	    //=====HANDSHAKE
	    //Move Tapster robot to save position #2
	    tapsterRobot.moveToSavePosition1();
	    //Insert robot inserts card into device, waits a little, takes card and gives it to Swipe robot.
	    //Swipe robot swipes card and returns it to Insert robot
	    //Insert robot readjusts card and returns it into slot 1
	    comboRobot.doHandshake();
    	//Return Tapster robot to rest position
	    tapsterRobot.moveToRestPosition();  
		
		*/
		

	}

}

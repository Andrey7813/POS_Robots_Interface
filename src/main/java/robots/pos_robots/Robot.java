package robots.pos_robots;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

/**
 * 
 * @author Andrey Teplyakov (teplyakov_a@subway.com) 03/14/2017
 *
 */

public class Robot {
	
	final public static String INSERT_ROBOT = "Insert";
	final public static String SWIPE_ROBOT = "Swipe";
	final public static String TAPSTER_ROBOT = "Tapster";
	final public static String TAP_ROBOT = "Tap";
	final public static String COMBO_ROBOT = "Combo";
	final public static String MOBILE_KIOSK_ROBOT = "MobileKiosk";
	
	final private static String HANDSHAKE_ALIAS = "handshake";
	
	private String robotIP = "10.4.20.111";
	private String robotName;
	
	public Robot(String robotIP, String robotType)
	{
		this.robotName = robotType;
		this.robotIP = robotIP;
	}
	
	public Robot(String robotType)
	{
		this.robotName = robotType;
	}
	
	protected String doPOSTRequestForMobileKiosk(String JSONrequest)
	{
		MediaType JSON = MediaType.parse("application/json; charset=utf-8");
	    RequestBody body = RequestBody.create(JSON, JSONrequest);
	    
	    OkHttpClient client = new OkHttpClient.Builder().readTimeout(600, TimeUnit.SECONDS).build();
	    
	    Request request = new Request.Builder()
	            .url("http://" +
				 	  robotIP +
				 	  "/mobile_kiosk.php")
	            .post(body)
	            .addHeader("Greetings", "hi, Robot!") //Notice this request has header if you don't need to send a header just erase this part
	            .build();
	    
	    Response response;
	    String responseBody = "NO RESPONSE";
		try {
			response = client.newCall(request).execute();
			responseBody = response.body().string();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	    	    
		return responseBody;
	}
	
	protected String doRequest(String command)
	{
		 OkHttpClient client = new OkHttpClient.Builder().readTimeout(500, TimeUnit.SECONDS).build();

		 String url = "http://" +
				 	   robotIP +
				 	   "/interface_process.php?robot="+
				 	   robotName +
				 	   "&command=" +
				 	   command;
		 
	     Request request = new Request.Builder()
	             .url(url)
	             .build();

	     Response response;
	     String responseBody = "NO RESPONSE";
		try {
			response = client.newCall(request).execute();
			responseBody = response.body().string();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}

	        return responseBody;
	}

}

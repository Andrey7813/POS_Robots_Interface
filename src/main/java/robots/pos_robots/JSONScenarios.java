package robots.pos_robots;

public class JSONScenarios {
	
	final public static String DEMO = "{" +
    "\"commands\":" +
    "[" +
        "{\"command\": \"turn on\", \"comment\": \"Turn screen on\"}," +
        "{\"command\": \"wait 8\",  \"comment\": \"Wait 8 secs\"}," +
        "{\"command\": \"slide 2 0 175 0 80\",  \"comment\": \"Arm #2 slides the screen\"}," +
        "{\"command\": \"wait 1\",  \"comment\": \"Wait 1 secs\"}," +
        "{\"command\": \"tap 1 -15 135\",  \"comment\": \"Tap pin code 1\"}," +
        "{\"command\": \"tap 1 5 135\",  \"comment\": \"Tap pin code 2\"}," +
        "{\"command\": \"tap 1 25 135\",  \"comment\": \"Tap pin code 3\"}," +
        "{\"command\": \"tap 1 -15 115\",  \"comment\": \"Tap pin code 4\"}," +
        "{\"command\": \"wait 3\",  \"comment\": \"Wait 3 secs\"}," +
        "{\"command\": \"short_tap 1 20 105\",  \"comment\": \"Load Paint App\"}," +
        "{\"command\": \"wait 3\",  \"comment\": \"Wait 3 secs\"}," +
        "{\"command\": \"loc 1 20 8 -88 139 -90 140 -95 138 -98 135 -98 125 -94 121 -89 122 -86 125\", \"comment\":\"letter C\"}," +
        "{\"command\": \"loc 1 20 5 -73 134 -80 132 -82 131 -82 126 -81 120\", \"comment\":\"letter r\"}," +
        "{\"command\": \"loc 1 20 11 -75 126 -70 128 -68 129 -67 131 -69 134 -74 133 -75 130 -74 122 -72 121 -68 121 -65 124\", \"comment\": \"letter e\"}," +
        "{\"command\": \"loc 1 20 13 -50 121 -52 128 -53 132 -55 133 -58 132 -60 131 -62 127 -62 124 -61 121 -58 120 -55 121 -53 124 -52 128\",\"comment\":\"letter a\"}," +
        "{\"command\": \"loc 1 20 9 -38 123 -40 121 -41 120 -42 122 -42 128 -42 140 -42 135 -47 135 -39 135\", \"comment\": \"letter t\"}," +
        "{\"command\": \"loc 1 20 11 -35 126 -30 128 -28 129 -27 131 -29 134 -34 133 -35 130 -34 122 -32 121 -28 121 -25 124\", \"comment\": \"letter e\"}," +
        "{\"command\": \"loc 1 20 20 -4 119 -6 118 -9 114 -9 112 -7 111 -6 110 -4 112 -3 125 -3 132 -3 125 -6 130 -7 131 -10 130 -11 128 -13 125 -12 123 -10 121 -8 121 -4 123 -3 125\", \"comment\":\"letter g\"}," +
        "{\"command\": \"loc 1 20 5 9 134 2 132 0 131 0 126 1 120\", \"comment\":\"letter r\"}," +
        "{\"command\": \"loc 1 20 11 13 126 18 128 20 129 21 131 19 134 14 133 13 130 14 122 16 121 20 121 23 124\", \"comment\": \"letter e\"}," +
        "{\"command\": \"loc 1 20 13 38 121 36 128 35 132 33 133 30 132 28 131 26 127 26 124 27 121 30 120 33 121 35 124 36 128\",\"comment\":\"letter a\"}," +
        "{\"command\": \"loc 1 20 9 50 123 48 121 47 120 46 122 46 128 46 140 46 135 41 135 49 135\", \"comment\": \"letter t\"}," +
        "{\"command\": \"go 1 0 90\",  \"comment\": \"Move arm to new position\"}," +
        "{\"command\": \"wait 3\",  \"comment\": \"Wait 3 secs\"}," +
        "{\"command\": \"loc 2 20 7 -50 130 -30 130 -10 130 30 130 50 130 70 130 90 130\", \"comment\":\"make Paint window smaller\"}," +
        "{\"command\": \"turn off\", \"comment\": \"Turn screen off\"}," +
        "{\"command\": \"wait 3\",  \"comment\": \"Wait 3 secs\"}," +
        "{\"command\": \"tap 1 -30 125\",  \"comment\": \"close confirmation\"}" +
        "]" +
"}";
			

}

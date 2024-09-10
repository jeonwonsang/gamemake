package GameMain;

//import java.util.HashMap;
//import java.util.Map;

import StartGame.GameStarting;

public class MainPage {
//	public static int key = 1;
//	public static Map<Integer, Monster> bag = new HashMap<>();
	
	public static GameStarting gameStart = new GameStarting();
	
	public static void main(String[] args) {
		gameStart.gameStart();
	}
}

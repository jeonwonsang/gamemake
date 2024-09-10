package world;

import java.util.Scanner;

public class world {

	static Scanner sc = new Scanner(System.in);
	static int x = 0; // 가로 좌표
	static int y = 0; // 세로 좌표
	static String any; // 아무키나 누르세요
	static double rand = Math.random(); // 랜덤함수
	static int num = 0; // 아무 숫자
	static int battleLuck = 0; // 몬스터 만나는 확률

	CityLocClazz cityPosition = new CityLocClazz();
	worldEndClazz endPosition = new worldEndClazz();
	OurIsland island = new OurIsland();
	Position position = new Position();
	City city = new City();
	MeetMonster meeting = new MeetMonster();
	BattleReady battleReady = new BattleReady();
	RiverRule river = new RiverRule();

	public void field() {

		while (true) {
			cityPosition.cityLoc();
			endPosition.worldEnd();
			island.landLoc();

			String move;
			move = sc.next();

			switch (move) {
			case "w":
				river.river();
				y++;
				position.position();
				meeting.meetMon();
				break;
			case "s":
				river.river();
				y--;
				position.position();
				meeting.meetMon();
				break;
			case "a":
				river.river();
				x--;
				position.position();
				meeting.meetMon();
				break;
			case "d":
				river.river();
				x++;
				position.position();
				meeting.meetMon();
				break;
			default:
				position.position();
				break;
			}
		}
	}
}

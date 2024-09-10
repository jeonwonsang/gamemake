package world;

public class MeetMonster extends world {
	
	public void meetMon() {
		// 몬스터 만날 확률
		rand = Math.random() * 100;
		if (rand <= battleLuck) {
			battleReady.battleReady();
		}
		// 만나는 몬스터 확률
		
	}
}

package world;

public class RiverRule extends world{
	public void river() {
		if (y == 49) {
			System.out.println("이곳은 강입니다");
			System.out.println("지나갈 수 없습니다");
			y--;
		}
		if (y == 51) {
			System.out.println("이곳은 강입니다");
			System.out.println("지나갈 수 없습니다");
			y++;
		}
		if (x == 51) {
			System.out.println("이곳은 강입니다");
			System.out.println("지나갈 수 없습니다");
			x++;
		}
		if (x == 49) {
			System.out.println("이곳은 강입니다");
			System.out.println("지나갈 수 없습니다");
			x--;
		}
		
	}
}

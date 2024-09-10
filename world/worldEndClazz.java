package world;

public class worldEndClazz extends world {
	public void worldEnd() {	
		if (x == 100) {
			System.out.println("맵의 끝입니다");
			x--;
			position.position();
		} else if (x == 0) {
			System.out.println("맵의 끝입니다");
			x++;
			position.position();
		} else if (y == 100) {
			System.out.println("맵의 끝입니다");
			y--;
			position.position();
		} else if (y == 0) {
			System.out.println("맵의 끝입니다");
			y++;
			position.position();
		}
	}
}

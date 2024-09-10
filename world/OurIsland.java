package world;

public class OurIsland extends world{
	public void landLoc() {
		
		if (x < 50 & y < 50) {
			System.out.println("                 남서쪽 섬                 ");
			System.out.println("=======================");
		}
		if (x > 50 & y < 50) {
			System.out.println("                 남동쪽 섬                 ");
			System.out.println("=======================");
		}
		if (x > 50 & y > 50) {
			System.out.println("                 북동쪽 섬                 ");
			System.out.println("=======================");
		}
		if (x < 50 & y > 50) {
			System.out.println("                 북서쪽 섬                 ");
			System.out.println("=======================");
		}
	}
}

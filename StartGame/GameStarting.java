package StartGame;

import java.util.Scanner;

import world.Position;
import world.world;

public class GameStarting {
	world world = new world();
	Position position = new Position();

	Scanner sc = new Scanner(System.in);
	int x = 0; // 가로 좌표
	int y = 0; // 세로 좌표
	String any; // 아무키나 누르세요
	double rand = Math.random(); // 랜덤함수
	int num = 0; // 아무 숫자

	public void gameStart() {
		
		x = 25;
		y = 25;
		
		while (true) {
			System.out.println("=======================");
			System.out.println("          현위치 : (" + x + " / " + y + ")");
			System.out.println("       태초마을        ");
			System.out.println("=======================");
			System.out.println("시작의 마을에 오신것을 환영합니다");
			System.out.println("시작 포켓몬은 랜덤으로 선택됩니다");
			rand = Math.round(rand * 5 + 1);
			num = (int) rand;

			switch (num) {
			case 1:
				System.out.println(rand + "번을 선택하였습니다");
				break;
			case 2:
				System.out.println(rand + "번을 선택하였습니다");
				break;
			case 3:
				System.out.println(rand + "번을 선택하였습니다");
				break;
			case 4:
				System.out.println(rand + "번을 선택하였습니다");
				break;
			case 5:
				System.out.println(rand + "번을 선택하였습니다");
				break;
			default:
				break;
			}
			System.out.println("계속 하려면 아무키나 누르세요");
			any = sc.next();
			System.out.println("밖으로 나갑니다");
			y--;
			position.position();
			world.field();
		}
	}
}

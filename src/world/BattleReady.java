package world;

public class BattleReady extends world {
	public void battleReady() {
		while (true) {
			System.out.println("=======================");
			System.out.println(" 야생의 a 를 만났다!!");
			System.out.println("=======================");
			System.out.println("1. 싸운다 2. 도망친다");
			any = sc.next();
			int number;
			try {
				number = Integer.parseInt(any);
			} catch (NumberFormatException e) {
				// 변환 실패 시 에러 메시지 출력
				System.out.println("그거 아니야");
				continue;
			}
			if (number == 1) {
				System.out.println("싸우자!");
				battle();
			} else if (number == 2) {
				run();
			}
		}
	}
}

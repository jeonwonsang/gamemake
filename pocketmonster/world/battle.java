package world;

public class battle {
	public void battle() {
		System.out.println("배틀을 시작합니다!");
		while (true) {
			System.out.println("1. 공격 / 2. 방어 / 3. 포획 / 4. 도망");
			String any = sc.next();
			int number;
			try {
				number = Integer.parseInt(any);
			} catch (NumberFormatException e) {
				// 변환 실패 시 에러 메시지 출력
				System.out.println("그거 아니야");
				continue;
			}
			if (number == 1) {
				System.out.println("공격");
			} else if (number == 2) {
				System.out.println("방어");
			} else if (number == 3) {
				System.out.println("포획");
			} else if (number == 4) {
				run();
			}
		}
	}
}

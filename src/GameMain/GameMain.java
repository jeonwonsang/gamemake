//	private static void run() {
//		rand = Math.random() * 2;
//		if (rand >= 1) {
//			System.out.println("도망에 성공했다!");
//			System.out.println("필드로 돌아갑니다");
//			return;
//		} else {
//			System.out.println("도망에 실패했다!");
//			run_battle();
//		}
//	}
//
//	private static void run_battle() {
//		System.out.println("도망에 실패하여 a가 먼저 공격합니다");
//		battle();
//	}
//
//	private static void battle() {
//		System.out.println("배틀을 시작합니다!");
//		while (true) {
//			System.out.println("1. 공격 / 2. 방어 / 3. 포획 / 4. 도망");
//			String any = sc.next();
//			int number;
//			try {
//				number = Integer.parseInt(any);
//			} catch (NumberFormatException e) {
//				// 변환 실패 시 에러 메시지 출력
//				System.out.println("그거 아니야");
//				continue;
//			}
//			if (number == 1) {
//				System.out.println("공격");
//			} else if (number == 2) {
//				System.out.println("방어");
//			} else if (number == 3) {
//				System.out.println("포획");
//			} else if (number == 4) {
//				run();
//			}
//		}
//	}
//}

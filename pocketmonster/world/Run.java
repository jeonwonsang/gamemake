package world;

public class Run extends world{
	public void run() {
		rand = Math.random() * 2;
		if (rand >= 1) {
			System.out.println("도망에 성공했다!");
			System.out.println("필드로 돌아갑니다");
			return;
		} else {
			System.out.println("도망에 실패했다!");
			run_battle();
		}
	}
}

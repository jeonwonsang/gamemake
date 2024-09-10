package GameMain;

public class MonsterNo_01 extends Monster {
	String name = "꼬북이";
	String type = "물";
	int level = 1;
	int power = 10;
	int hp = 100;
	int defense = 10;
	int speed = 10;
	int avoid = 15;
	int exp = 0;
	int expMax = 20;

	public void levelUp() {
		level++;
		power = power + power / 10;
		hp = hp + hp / 10;
		defense = defense + defense / 10;
		speed = speed + speed / 10;
		avoid = avoid + avoid / 200;
	}
	public void expUp() {
		if (exp >= expMax) {
			exp = 0;
			expMax = expMax + expMax;
			levelUp();
		}
	}
}

package world;

public class CityLocClazz extends world {
	public void cityLoc() {
		if (x == 25 & y == 25) {
			city.city();
		}
		if (x == 75 & y == 75) {
			city.city();
		}
		if (x == 25 & y == 75) {
			city.city();
		}
		if (x == 75 & y == 25) {
			city.city();
		}
	}
}

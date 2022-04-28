
public class Ex02 {

	public static void main(String[] args) {

		Unit u = new Unit();
		u.stop(); 	//∏ÿ√Á !! 
	}
}
//ªÛ¿ß ≈¨∑°Ω∫ 
class Unit{
	int x,y;
	
	void move(int x, int y) {}
	void stop() {
		System.out.println("∏ÿ√Á");
	}
	
}

class Marine extends Unit {
	void stimPack() {}
}

class Tank extends Unit{
	void changMode() {}
}
class Dropship extends Unit{
	void load() {}
	void nuload() {}
}
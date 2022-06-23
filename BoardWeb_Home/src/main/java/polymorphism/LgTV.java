package polymorphism;

public class LgTV implements TV {

	public LgTV() {
		System.out.println("LgTV 생성자(default)");
	}
	public void turnOn() {
		System.out.println("LgTV---전원 켠다");
	}
	public void turnOff() {
		System.out.println("LgTV---전원 끈다");
	}
	public void SoundUp() {
		System.out.println("LgTV---소리 올린다");
	}
	public void SoundDown() {
		System.out.println("LgTV---소리 내린다");
	}
	 
}

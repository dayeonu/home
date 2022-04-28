package zoo;

//접근제어자 순서
//public >> protected >> default >> private
// 디폴트는 같은 패키지안에서 사용가능

public class Cat {
	public void makeCat() {
		Duck quack = new Duck();
	}
}

class Duck{
	
}
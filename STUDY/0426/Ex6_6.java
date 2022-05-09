
class Data {int x;}//멤버변수 한가지, x뿐이다. 

public class Ex6_6 {
	// 자바의정석(기초편) 6-6 예제 
	
	
//void는 반환값 없음
	public static void main(String[] args) {
		
		//Data 참조형 
		Data d = new Data();
		d.x = 10;
		System.out.println("main() : x = " + d.x);
		
		
		//메서드 호출부분 
		change(d.x);
		System.out.println("After change(d.x)" );
		System.out.println("main() : x = " + d.x);
	}

//void는 반환값 없음
	static void change(int x) {
		x = 1000;
		System.out.println("change() : x = " + x);
	}
}


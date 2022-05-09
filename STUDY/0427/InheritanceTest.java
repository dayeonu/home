// 자바의 정석(기초편) ch7-3,4

class MyPoint {
	int x;
	int y;
}
	
//class Circle extends MyPoint {//상속
//	int r;
//}

class Circle extends Object{	//포함
// 	MyPoint p; 이같은 참조변수를 선언만 해두면 저장 공간이 생기지 않았기 때문에 뒤에 저장공간이 없습니다. 
	MyPoint p = new MyPoint(); // 이처럼 해당 객체 생성을 꼭 해줘야 저장 공간이 생깁니다. 참조변수의 초기화!!
	int r;
	
//생성자에서 초기화를 해주던가, 그래야 저장 공간이 생김! 
	Circle(){
		p = new MyPoint();
	}
}

public class InheritanceTest {
	public static void main(String[] args) {
		Circle c = new Circle();	// c가 가리키는 p의 객체!  해당 객체를 그림으로 그려보세요.
		System.out.println(c.toString());	//Circle@5e91993f
		System.out.println(c);				//Circle@5e91993f 위 아래 문장이 출력결과가 같다.  tostring이 사용가능한 이유는 
											//Object 클래스 로부터 상속을 받아서 쓸 수 있기 때문이다. 
//		c.x = 1;
//		c.y = 2;
//		c.r = 3;
		c.p.x = 1;
		c.p.y = 2;
		c.r = 3;
//	System.out.println("c.x=" + c.x); 
//	System.out.println("c.y=" + c.y); 
//	System.out.println("c.r=" + c.r); 
	
	System.out.println("c.p.x=" + c.p.x); 
	System.out.println("c.p.y=" + c.p.y); 
	System.out.println("c.r=" + c.r); 
	}

}

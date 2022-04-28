
public class Ex6_3 {

	
	// 자바의정석(기초편) 6-13 예제 
	public static void main(String[] args) {

		System.out.println("Card.width =" + Card.width);
		System.out.println("Card.height =" + Card.height);

		Card c1 = new Card();
		c1.kind = "Heart";
		c1.number = 7;
	
		Card c2 = new Card();
		c2.kind = "Spade";
		c2.number = 4;
		
		System.out.println("c1.kind : " + c1.kind + " c1.number : " + c1.number + " c1.width : " + c1.width + " c1.height : " + c1.height);
		System.out.println("c2.kind : " + c2.kind + " c2.number :" + c2.number + " c2.width: " + c2.width + " c2.height : " + c2.height);

		System.out.println("값을 변경합니다.");
		
		Card.width = 50;	//클래스 변수의 값을 변경
		Card.height = 80;	// 클래스 변수의 값을 변경,, 이름이 헷갈리므로 Card.height로 써라. 
	
//		위의 클래스 변수를 통해서 아래 프린트 문장의 값이 한번에 변경됨을 알 수 있다. 이것이 클래스 변수의 힘!
		System.out.println("c1.kind : " + c1.kind + " c1.number : " + c1.number + " c1.width : " + c1.width + " c1.height : " + c1.height);
		System.out.println("c2.kind : " + c2.kind + " c2.number :" + c2.number + " c2.width: " + c2.width + " c2.height : " + c2.height);

	
	}
}
class Card{
	
	String kind;
	int number;
	static int width = 100;
	static int height = 250;
}

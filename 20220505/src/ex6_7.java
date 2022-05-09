//참조형 매개변수 공부!!! 2022-05-05
//값이 저장된 주소를 넘겨주는 것이다. 
class Data2 { int x; int a; }

class ex6_7 {
	public static void main(String[] args) {
		Data2 d = new Data2();	//객체 생성
		d.a = 30;	// Data2 클래스에 선언된 int a 에 30 저장
		d.x = 10;	// Data2 클래스에 선언된 int x 에 10 저장
		
		System.out.println("main() : x = " + d.x); //값이 잘 들어갔는지 확인하는 출력문
		System.out.println("main() : a = " + d.a); //값이 잘 들어갔는지 확인하는 출력문
		System.out.println("--------------------");
		
		change(d); // 참조변수d 객체 주소를 전달한다. 
		//자바에서는 메서드를 호출할 때 매개변수로 지정한 값을 메서드의 매개변수에 복사해서 넘겨준다.
		System.out.println("After change(d)");
		System.out.println("main() : d의 주소값 = " + d); //주소값
		System.out.println("main() : d.a 변경된 값 = " + d.a); // 변경된 값 
		System.out.println("main() : d.a 변경된 값 = " + d.x); // 변경된 값
		System.out.println("--------------------");
		
	}
	//메서드의 매개변수를 확인해서,타입이 무엇인지 먼저 확인 
	/*
	 *  내가 가장 헷갈렸던 부분!! change메서드 괄호안의 타입이! 중요!!
	 *  기본형인 int, String, char, 등 8개의 기본형이 아닌
	 *  참조형인경우에는 값을 변경할 수가 있기 때문에 아래의 d.x값이 변경될 수 있었다는 점!!! 
	 */
	static void change(Data2 abv) { // 참조형 매개변수이며, 매개변수의 이름은 무얼 쓰던 상관이 없다!!  
		
		d.x = 1000; //매개변수d의 x값이 변경되었다. 1000을 넣음
		System.out.println("change() : x = " + d.x + " x값이 변경되었다!"); //메서드 출력문 순서,, 확인 바람ㅋ

		d.a = 0;    //매개변수d의 x값이 변경되었다. 1000을 넣음
		System.out.println("change() : a = " + d.a + " a값이 변경되었다!" ); //메서드 출력문 순서,, 확인 바람ㅋ
		System.out.println("--------------------");
	}
}
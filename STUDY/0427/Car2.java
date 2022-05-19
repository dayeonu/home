	// 자바의 정석 에제 6-14
	//생성자 this()
	//생성자에서 다른 생성자 호출할 때 사용.
	//iv초기화 생성자 
class Car2 {
	String color;
	String gearType;
	int door;
	
	Car2(){
		//Card("white","auto",,4); 코드의 중복을 제거한 코드가 아래와 같은 코드이다. 
		this("white","auto",4); //생성자 호출
		//Car2리고 쓰고 호출해야하는데 this라고 썼다. 매개변수 생성자 3개를 호출한다.
		// 같은 클래스 안의 생성자들끼리의 호출할때는 클래스이름대신에 "this"를쓴다. 이유는 규칙이다.
		//그리고 다른 생성자 호출 시 첫줄에서만 사용가능하다. 
		//생성자끼리 호출 시에는 반드시 첫줄에 사용한다. 
		} 	 
	
	Car2(String color){
		this(color, "auto", 4);
	}
	
	Car2(String color, String gearType, int door){
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
}

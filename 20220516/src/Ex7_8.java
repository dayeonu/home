public class Ex7_8 {
	public static void main(String[] args) {

		Buyer b = new Buyer();
		
		b.buy(new Tv1()); 
		// Tv1 tv = new Tv1();
		// b.buy(t); 
		// 위 식을 간단히 한줄로 만든 것.
		b.buy(new Computer());
		
		System.out.println("현재 남은 돈은 " + b.money +"입니다.");
		System.out.println("현재 적립포인트는 " + b.bonusPoint +"입니다.");
	}
}
class Product {
	int price;
	int bonusPoint;

	public Product(int price) {
		this.price = price;
		bonusPoint = (int)(price/10.0); //물건 값의 10% 포인트 적립해줌 
	}
}

class Tv1 extends Product {
	Tv1(){
		super(100); //티비 가격은 100만원 
	}
	public String toString() {return "tv";} // object클래스의 toString을 오버라이딩 한다. 
}

class Computer extends Product{
	Computer(){ super (200); } //컴 가격은 200만원 
	public String toString() {return "Computer";}
	}

class Buyer {
	int money = 1000;
	int bonusPoint = 0;
	
	void buy(Product p) {
		if(money < p.price ) {
			System.out.println("잔액부족");
			return;
		}
		money -= p.price; // 가진 돈에서 물건 값을 빼기
		bonusPoint += p.bonusPoint;
		System.out.println( p +"을/를 구입하셨습니다.");
	}
}

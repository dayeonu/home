class Product{
	int price;
	int bonusPoint;

	Product(int price){
		this.price=price;
		bonusPoint=(int)(price/10.0);
	}
}

class Tv1 extends Product{
	Tv1(){
		super(100);
	}
	public String toString() {return "Tv";}
}

class Computer extends Product{
	public Computer() { super(200); }
	public String toString() {return "Computer";}
}

class Buyer{
	int money = 1000;
	int bonusPoint=0;

	void buy(Product p) {
		if(money < p.price) {
			System.out.println("잔액 부족합니다");
			return;
		}

		money -= p.price;
		bonusPoint += p.bonusPoint;
		System.out.println(p + "를(을) 구입하셨습니다");

	}
}

public class Ex7_8 {
	public static void main(String[] args) {
		Buyer b = new Buyer();
		
//		Produnt p = new tv1();
//		b.buy(p);
		b.buy(new Tv1()); // buy(Product p)
		b.buy(new Computer());// buy(Product p)
		
		System.out.println("현재 남은 돈은 " + b.money + "만원입니다.");
		System.out.println("현재 보너스점수는" + b.bonusPoint + "점입니다");

	}
}
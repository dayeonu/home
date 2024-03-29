public class AbstractClass {

	public static void main(String[] args) {
	
		Product pro = new Audio();
		System.out.println(pro.price);
		pro.test();
		pro.func();
	}
}

abstract class Product {
	int price; // 제품의 가격
	Product(int price) {
		this.price = price;
	}
	void test() {
		System.out.println("Product");
	}
	abstract void func();//추상메서드
}

//하위 클래스 구문
class Tv extends Product {
	Tv() { super(100); }
	public String toString() { return "Tv"; }
	void func() {

	}
}	
class Computer extends Product {
	Computer() { super(200); }
	public String toString() { return "Computer";}
}

class Audio extends Product {
	Audio() { super(50); }
	public String toString() { return "Audio"; }
}

import java.util.Arrays;

class Exercise7_19 {
	public static void main(String args[]) {
		Buyer b = new Buyer();
		
		b.buy(new Tv());
		b.buy(new Computer());
		b.buy(new Tv());
		b.buy(new Audio());
		b.buy(new Computer());
		b.buy(new Computer());
		b.buy(new Computer());
		
		b.summary();
	}
}
//장바구니.
class Buyer {
	int money = 1000;
	Product[] cart = new Product[3]; // 구입한 제품을 저장하기 위한 배열
	int i = 0; // Product cart index 배열 에 사용될
	
	void buy(Product p) {
		
		if(money < p.price) {
			System.out.println("그 돈으로 못사");
			return;
		}
			money -= p.price;
//			System.out.println(money + "," + p.price);
		
			add(p);
	}	
 
	void add(Product p) {
//		1.1.1 2 . 기존의 장바구니보다 배 큰 새로운 배열을 생성한다
		if ( i >= cart.length) {
			Product[] tmp = new Product[cart.length*2]; // 배열 6개짜리 생성. // 배열의 크기를 늘렸음. 배열의 복사를 이용한??
				System.out.println(tmp.length);
				for(int j =0; j<cart.length; j++)
				tmp[j] = cart[j]; // cart배열이 tmp배열을 바라보게 됨 
			cart = tmp;
		
		} 
		cart[i++] = p;
		System.out.println(p + "," + cart[i-1] + " i : " + i );
	}
 
//구입목록, 
	void summary() {
		
		String list ="";
		int sum = 0;
			for (int i = 0; i<cart.length; i++) {
					list += cart[i] + ",";
					sum += cart[i].price;
				}
		
		System.out.println("list : " + list ); 
		System.out.println("sum :" + sum ); 
		System.out.println("money: " + money); 
		
		}
}
class Product {
	int price; // 제품의 가격
	Product(int price) {
		this.price = price;
	}
}
class Tv extends Product {
	Tv() { super(100); }
	public String toString() { return "Tv"; }
}
class Computer extends Product {
	Computer() { super(200); }
	public String toString() { return "Computer";}
}
class Audio extends Product {
	Audio() { super(50); }
	public String toString() { return "Audio"; }
}
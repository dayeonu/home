
public class Ex04 {

	void summary() {
		/* 장바구니에 담긴 물건들의 목록을 만들어 출력한다.
		 * 장비구니에 담긴 물건들의 가격을 모두 더해서 출력한다.
		 * 물건을 사고 남은 금액(money)를 출력한다.
		*/
	}//summary의 끝 
}

class Product{
	int price;	//제품의 가격
	
	Product(int price){
		this.price = price;
	}
}

class Tv extends Product {
	tv(){super(100);}
	
	public String toString() {return "TV";}
	
}

class Computer extends Product{
	
	
}

class Audio extends Product{
	
}
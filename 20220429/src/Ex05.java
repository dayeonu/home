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
//��ٱ���.
class Buyer {
	int money = 1000;
	Product[] cart = new Product[3]; // ������ ��ǰ�� �����ϱ� ���� �迭
	int i = 0; // Product cart index �迭 �� ����
	
	void buy(Product p) {
		
		if(money < p.price) {
			System.out.println("�� ������ ����");
			return;
		}
			money -= p.price;
//			System.out.println(money + "," + p.price);
		
			add(p);
	}	
 
	void add(Product p) {
//		1.1.1 2 . ������ ��ٱ��Ϻ��� �� ū ���ο� �迭�� �����Ѵ�
		if ( i >= cart.length) {
			Product[] tmp = new Product[cart.length*2]; // �迭 6��¥�� ����. // �迭�� ũ�⸦ �÷���. �迭�� ���縦 �̿���??
				System.out.println(tmp.length);
				for(int j =0; j<cart.length; j++)
				tmp[j] = cart[j]; // cart�迭�� tmp�迭�� �ٶ󺸰� �� 
			cart = tmp;
		
		} 
		cart[i++] = p;
		System.out.println(p + "," + cart[i-1] + " i : " + i );
	}
 
//���Ը��, 
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
	int price; // ��ǰ�� ����
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
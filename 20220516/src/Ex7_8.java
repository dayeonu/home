public class Ex7_8 {
	public static void main(String[] args) {

		Buyer b = new Buyer();
		
		b.buy(new Tv1()); 
		// Tv1 tv = new Tv1();
		// b.buy(t); 
		// �� ���� ������ ���ٷ� ���� ��.
		b.buy(new Computer());
		
		System.out.println("���� ���� ���� " + b.money +"�Դϴ�.");
		System.out.println("���� ��������Ʈ�� " + b.bonusPoint +"�Դϴ�.");
	}
}
class Product {
	int price;
	int bonusPoint;

	public Product(int price) {
		this.price = price;
		bonusPoint = (int)(price/10.0); //���� ���� 10% ����Ʈ �������� 
	}
}

class Tv1 extends Product {
	Tv1(){
		super(100); //Ƽ�� ������ 100���� 
	}
	public String toString() {return "tv";} // objectŬ������ toString�� �������̵� �Ѵ�. 
}

class Computer extends Product{
	Computer(){ super (200); } //�� ������ 200���� 
	public String toString() {return "Computer";}
	}

class Buyer {
	int money = 1000;
	int bonusPoint = 0;
	
	void buy(Product p) {
		if(money < p.price ) {
			System.out.println("�ܾ׺���");
			return;
		}
		money -= p.price; // ���� ������ ���� ���� ����
		bonusPoint += p.bonusPoint;
		System.out.println( p +"��/�� �����ϼ̽��ϴ�.");
	}
}


class Exercise7_19 {
	public static void main(String args[]) {
		Buyer b = new Buyer();
		b.buy(new Tv());
		b.buy(new Computer());
		b.buy(new Tv());
		b.buy(new Audio());
		b.buy(new Computer());
//		b.buy(new Computer());
//		b.buy(new Computer());
		b.summary();
	}
}
class Buyer {
	int money = 1000;
	int i = 0; 
	Product[] cart = new Product[]{}; // ������ ��ǰ�� �����ϱ� ���� �迭
	int tmp = cart.length;
	 
	
			
//���� ���� ������ ������ ���ؼ� ���� ���� ������ �޼��带 �����Ѵ�
		void buy(Product p) {
			if(money < p.price) {	
				System.out.println("�ܾ��� �����մϴ�.");
				return;
			}
//���� ���� ����ϸ�, ��ǰ�� ������ ���� ������ ����
//(add ) ��ٱ��Ͽ� ������ ������ ��´� �޼��� ȣ��
			money -= p.price;
				add(p);
				System.out.println("������ ������ ��ٱ��Ͽ� ��ҽ��ϴ�.");
			} 
		/*
(1) . �Ʒ��� ������ �°� �ڵ带 �ۼ��Ͻÿ�
1.1 . ���� ���� ������ ������ ���ؼ� ���� ���� ������ �޼��带 �����Ѵ�
1.2 . ���� ���� ����ϸ�, ��ǰ�� ������ ���� ������ ����
1.3 .(add ) ��ٱ��Ͽ� ������ ������ ��´� �޼��� ȣ��
		 */
	
	void add(Product p) {
//i�� ���� ��ٱ����� ũ�⺸�� ���ų� ũ�� 
		if( i >=  cart.length) {
//������ ��ٱ��Ϻ��� 2�� ū ���ο� �迭�� �����Ѵ�		
		System.out.println();
		}
		
		/*
(2) . �Ʒ��� ������ �°� �ڵ带 �ۼ��Ͻÿ�
1.1 i�� ���� ��ٱ����� ũ�⺸�� ���ų� ũ��
1.1.1 2 . ������ ��ٱ��Ϻ��� �� ū ���ο� �迭�� �����Ѵ�
1.1.2 . ������ ��ٱ����� ������ ���ο� �迭�� �����Ѵ�
1.1.3 . ���ο� ��ٱ��Ͽ� ������ ��ٱ��ϸ� �ٲ۴�
1.2 (cart) . i 1 . ������ ��ٱ��� �� �����Ѵ� �׸��� �� ���� ������Ų��
		 */
	} // add(Product p)

	//�������� ����� �κ�, �޼���� �޼��� ������������ ����
	void summary() {
		int list = 0;
		
		
		/*
(3) . �Ʒ��� ������ �°� �ڵ带 �ۼ��Ͻÿ�
1.1 . ��ٱ��Ͽ� ��� ���ǵ��� ����� ����� ����Ѵ�
1.2 . ��ٱ��Ͽ� ��� ���ǵ��� ������ ��� ���ؼ� ����Ѵ�
1.3 (money) . ������ ��� ���� �ݾ� �� ����Ѵ�
		 */
	} // summary()
}
class Product {
	int price; // ��ǰ�� ����
	Product(int price) {
		this.price = price;
	}
}
class Tv extends Product {
	Tv() { super(100); }
	public String toString() { return "Tv"; } // �ּҰ��� �ƴ϶� �������̵��ؼ�, ���ڿ� tv�� ��µǰ� �ȴ�. 
}
class Computer extends Product {
	Computer() { super(200); }
	public String toString() { return "Computer";}
}
class Audio extends Product {
	Audio() { super(50); }
	public String toString() { return "Audio"; }
}
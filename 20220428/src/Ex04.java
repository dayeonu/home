
public class Ex04 {

	void summary() {
		/* ��ٱ��Ͽ� ��� ���ǵ��� ����� ����� ����Ѵ�.
		 * ��񱸴Ͽ� ��� ���ǵ��� ������ ��� ���ؼ� ����Ѵ�.
		 * ������ ��� ���� �ݾ�(money)�� ����Ѵ�.
		*/
	}//summary�� �� 
}

class Product{
	int price;	//��ǰ�� ����
	
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
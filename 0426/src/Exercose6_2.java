//SutdaCard Ŭ������ �� ���� �����ڿ� info()�� �߰��ؼ� �������� ���� ����� �򵵷� �Ͻÿ�.

class Exercose6_2 {
	public static void main(String[] args) {
		SutdaCard card1 = new SutdaCard(3,false);
		SutdaCard card2 = new SutdaCard();
		
		System.out.println(card1.info());	//3
		
		System.out.println(card2.info());	//1k
	}
}

class SutdaCard{
	int num;
	boolean isKwang;
	
	public SutdaCard() {
		this.num=1;
		this.isKwang = true;
	}
	
	public SutdaCard(int num, boolean isKwang) {
		if(num >= 1 && num <= 10)
			this.num = num;
		else
			this.num = 0;	
		
		this.isKwang = isKwang;
	}
	
	String info() { 
	return num + (isKwang == true? "k" : "");
	
	}

}



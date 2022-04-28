//SutdaCard 클래스에 두 개의 생성자와 info()를 추가해서 실행결과와 같은 결과를 얻도록 하시오.

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



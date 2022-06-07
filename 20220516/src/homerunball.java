class Gaja {
	public int homerun = 2000;
	int ma= 1500;
}
class Drink{
	int cola = 500;
}	
class Money{
	int money = 10000;
}
public class homerunball {
	public static void main(String[] args) {

		Gaja gaja = new Gaja();
		gaja.homerun = 1200;
	
		System.out.println("홈런볼은 "+ gaja.ma+" 원 입니다");
		System.out.println("홈런볼은 "+ gaja.homerun+" 원 입니다");
		
		Drink drink = new Drink();
		drink.cola = 2000;
		System.out.println("콜라는"+ drink.cola +" 원 입니다");
		
		Money don = new Money();
		int sum = don.money - gaja.homerun;
		System.out.println("내 주머니에 있는 돈은" +  don.money + "입니다 홈런볼을 하나 사먹고 남은 가격은" + sum + " 원 입니다.");
		
	} 
	
}
 

//class Money{
//	int money = 10000;
//	public Money(int money) {
//		this.money = money;
//		return;
//	}  
//}
//class Gaja{
//	int homerun = 4000;
//	
//	public Gaja(int won) {  
//		int nam = homerun - won;
//		System.out.println( won + "을 지급하세요");
//	}
//}  
//
//class Drink{
//	public Drink(int won) {  
//		System.out.println( won + "을 지급하세요");
//	}
//}  
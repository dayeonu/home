public class Tv {
	
	   ///////////////////////////변수 == 인스턴스변수
		String color;
		boolean power;  //인스턴스 변수
		int channel;  //채널 번호 저장
		
		
		/////////////////////////메소드구역 == 인스턴스메소드
		void power() {
			power = !power;
		}
		
		void channelUp() {
			++channel;
		}
		
		void channelDown() {
			--channel;
		}
}
class TvTest{
	  
	public static void main(String[] args) {
		// tv객체를 만들고 싶다.  ++++> 객체를 만들려면 클래스(설계도)가 있어야한다.
		
		Tv t  = new Tv();  // 티비 객체를 생성했다. 
		
		t.channel = 5;	//티비 인스턴스의 멤버변수인 채널에 값을 5로 줬다. 
		t.channelDown();	//메소드 호출 부 
		System.out.println("t ch : " + t.channel);
	
		
		Tv t2 = new Tv(); //두 번째 티비 객체를 생성했다 
		
		t2.channel = 10;	//티비 인스턴스의 멤버변수인 채널에 값을 10으로 줬다. 
		t2.channelUp(); //메소드 호출 부 
		System.out.println("t2의 현재 채널은: " + t2.channel);
		
		
		Tv t3 = t2; //T2의 객체를 T3에 값복사를 하다!! 
		System.out.println("t3 : " + t3.channel);
		
	}
}
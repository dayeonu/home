public class Tv {
	
	   ///////////////////////////���� == �ν��Ͻ�����
		String color;
		boolean power;  //�ν��Ͻ� ����
		int channel;  //ä�� ��ȣ ����
		
		
		/////////////////////////�޼ҵ屸�� == �ν��Ͻ��޼ҵ�
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
		// tv��ü�� ����� �ʹ�.  ++++> ��ü�� ������� Ŭ����(���赵)�� �־���Ѵ�.
		
		Tv t  = new Tv();
		
		t.channel = 7;
		t.channelDown();
		System.out.println("t : " + t.channel);
		
		Tv t2 = new Tv();
		t2.channel = 10;
		t2.channelUp();
		System.out.println("t2 : " + t2.channel);
		
		Tv t3 = t2;
		System.out.println("t3 : " + t3.channel);
		
		int num = 10;
	}
}
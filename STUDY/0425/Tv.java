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
		
		Tv t  = new Tv();  // Ƽ�� ��ü�� �����ߴ�. 
		
		t.channel = 5;	//Ƽ�� �ν��Ͻ��� ��������� ä�ο� ���� 5�� ���. 
		t.channelDown();	//�޼ҵ� ȣ�� �� 
		System.out.println("t ch : " + t.channel);
	
		
		Tv t2 = new Tv(); //�� ��° Ƽ�� ��ü�� �����ߴ� 
		
		t2.channel = 10;	//Ƽ�� �ν��Ͻ��� ��������� ä�ο� ���� 10���� ���. 
		t2.channelUp(); //�޼ҵ� ȣ�� �� 
		System.out.println("t2�� ���� ä����: " + t2.channel);
		
		
		Tv t3 = t2; //T2�� ��ü�� T3�� �����縦 �ϴ�!! 
		System.out.println("t3 : " + t3.channel);
		
	}
}
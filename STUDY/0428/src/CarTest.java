public class CarTest {

	public static void main(String[] args) {
		
		Sedan se = new Sedan();
//		se.color ������ �ȵǴ� ������ color��  private�� �پ��ֱ� �����̴�.
//		���� �Ϸ��� setter �� ����� ���̴�. 

		se.getColor("red");
		System.out.println(se.getColor());
		
		se.getPassenger(4);
		System.out.println(se.getPassenger()+ "��");

		Sedan se2 = new Sedan("blue", 2, 4, 3);
		System.out.println(se2.getPassenger() + "��");
		System.out.println(se2.getColor);
		
		Sports sp = new Sports();
		sp.setColor("red");
		System.out.println(sp.getColor());
		
		Sports sp2 = new Sports("Yellow",2,4,1,5000);
		
	}
}
//���� ==> ������ : 
class Car{
//3���� Ŭ������ ����� ������, �޼������ �� Ŭ�������� �����Ѵ�. 
	private int passenger;
	private int tire;
	private int seat;
	
	public Car() {}
	public Car(int passenger,int tire,int seat ) {
		this.passenger = passenger;
		this.tire = tire;
		this.seat = seat;
		
	}
	void run() {}
	void stop() {}
}

	public int getPassenger() {
		return passenger;
	}
	public void setPassenger(int passenger) {
		this.passenger = passenger;
	}
	public int getTire() {
		return tire;
	}
	public void setTire(int tire) {
		this.tire = tire;
	}
	public int getSeat() {
		return seat;
	}
	public void setSeat(int seat) {
		this.seat = seat;
	}

class Sports extends Sedan{
	
	}

// Ŭ���� 3���� ���� 
class Sedan	extends Car{

	private String color;
	
	public Sedan() {}	//����Ʈ ������ �����. 
	public Sedan(String color, int passenger, int tire, int seat) {
		//super�� �׻� �� ���� 
		super(passenger, tire, seat); //���� Ŭ���� �����ڿ��� ����....Car�����ڿ��� ���� 
		this.color = color;

		
//		this.color = color �� ������ �ȵǴ� ������  private �̱� ������ 
//		setPassenger(passenger);
//		setTire(tire);
//		setSeat(seat);
//����� ���� ������ ���� ������ ����. 
	}
	
	//main���� �ش� color�� ȣ���Ϸ��� getter�� ���������Ѵ�. 
		public String getColor() {
			return color;
		}
		public void setColor(String color) {
			this.color = color;
		}
	
	void gas() {} 
}

class Bus extends Car{
	int passengerCount;
	void passengerLoad() {} 
}

class Truck extends Car{
	private int load;
	void objectLoad() {} 
}
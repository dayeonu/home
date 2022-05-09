public class CarTest {

	public static void main(String[] args) {
		
		Sedan se = new Sedan();
//		se.color 접근이 안되는 이유는 color에  private가 붙어있기 떄문이다.
//		접근 하려면 setter 를 만드는 것이다. 

		se.getColor("red");
		System.out.println(se.getColor());
		
		se.getPassenger(4);
		System.out.println(se.getPassenger()+ "명");

		Sedan se2 = new Sedan("blue", 2, 4, 3);
		System.out.println(se2.getPassenger() + "명");
		System.out.println(se2.getColor);
		
		Sports sp = new Sports();
		sp.setColor("red");
		System.out.println(sp.getColor());
		
		Sports sp2 = new Sports("Yellow",2,4,1,5000);
		
	}
}
//공통 ==> 다형성 : 
class Car{
//3가지 클래스의 공통된 변수나, 메서드들은 각 클래스에서 삭제한다. 
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

// 클래스 3가지 생성 
class Sedan	extends Car{

	private String color;
	
	public Sedan() {}	//디폴트 생성자 만들기. 
	public Sedan(String color, int passenger, int tire, int seat) {
		//super는 항상 맨 위에 
		super(passenger, tire, seat); //상위 클래스 생성자에게 전달....Car생성자에게 전달 
		this.color = color;

		
//		this.color = color 로 접근이 안되는 이유는  private 이기 때문에 
//		setPassenger(passenger);
//		setTire(tire);
//		setSeat(seat);
//상속을 받을 때에는 직접 접근이 가능. 
	}
	
	//main에서 해당 color를 호출하려면 getter를 사용해줘야한다. 
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
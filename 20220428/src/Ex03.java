public class Ex03 {

	static void action(Robot robot) {

		if(robot instanceof DanceRobot) {
			DanceRobot dance = (DanceRobot)robot;
					dance.dance();
			}	else if (robot instanceof SingRobot) {
				SingRobot sing = (SingRobot)robot;
					Sing.sing();
			}	else if (robot instanceof DrawRobot) {
						DrawRobot draw = (DrawRobot)robot;
					draw.draw();
			}}
					
public static void main(String[] args) {
	
		Robot[] arr = { new DanceRobot(), new SingRobot(), new DrawRobot()};
		
		for(int i =0; i<arr.length; i++	) //i�� 0,1,2 
		
				action(arr[i]);
	
} //main�� ��

class Robot{
}

class DanceRobot extends Robot{
	void dance() {
		System.out.println("���� ��ϴ�. ");
	}
}

class SingRobot extends Robot{
	void sing() {
		System.out.println("�뷡�� �մϴ�.");
	}		
}

class DrawRobot extends Robot{
	void draw() {
		System.out.println("�׸��� �׸��ϴ�.");
	}
}
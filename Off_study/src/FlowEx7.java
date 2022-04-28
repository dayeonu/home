import java.util.Scanner;

public class FlowEx7 {

	public static void main(String[] args) {

		System.out.print("가위(1), 바위(2), 보(3) 중 하나를 입력하세요. >");

		Scanner scanner = new Scanner(System.in);
		int user = scanner.nextInt();
		int com = (int)(Math.random()*3)+1; //랜덤 숫자는 변수 com에 저장됨. 
		
		/*
		 * 0.0이상 1.0미만의 사이의 난수가 랜덤으로 나오는 함수. 
		 * (int)(Math.random())앞에 int형을 사용한 이유는, 정수형으로 값을 뽑아
		 * 내고 싶었으므로 실수를 -> 정수로 형변환 해준것(강제형변환). 정수의 값으로 환산하고 싶을 때, *3 + 1을 사용한다. +1을 해준 이유는, 정수가
		 * 0,1,2 까지만 나오므로 0이 필요없을 떄 즉 1,2,3 값으로 환산하고 싶을 떄 쓴다. 3개의 값 말고 20개의 값을 출력하고 싶을 땐
		 * 그냥 *20을 하면 된다.
		 */
		System.out.println("당신은 " + user +"입니다.");
		System.out.println("컴은 " + com +"입니다.");

		switch(user-com) { //조건식 

		case 2: case -1:
			System.out.println("당신이 졌습니다");
			break;
			
		case 1: case -2:
			System.out.println("당신이 이겼습니다");
			break;
			
		default : System.out.println("비겼습니다.");
		}
	}
}
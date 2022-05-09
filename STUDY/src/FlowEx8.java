import java.util.Scanner;

public class FlowEx8 {

	public static void main(String[] args) {

		System.out.println("주민번호 000000-0까지 입력하세요. - 부등호 포함");
	
		Scanner scanner = new Scanner(System.in);
		String regNo = scanner.nextLine();
		
		
		//뽑아 낼때, 왼쪽부터 0의 자리임. 그래서 8이 아니라 7임.
		//charAt() 
		char gender= regNo.charAt(7); 
		
		switch(gender) {
			case '1' : case '3' :
				System.out.println("당신은 남자입니다.");
				break;
			case '2' : case '4' :
				System.out.println("당신은 여자입니다.");
				break;
				
			default :
				System.out.println("유효하지 않는 주민번호 입니다.");
		}
		
	}

}

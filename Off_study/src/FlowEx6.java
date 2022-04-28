import java.util.Scanner;

public class FlowEx6 {

	public static void main(String[] args) {
		
		System.out.println("현재 월을 입력하세요:");
		
		Scanner scanner = new Scanner(System.in);
		int month = scanner.nextInt();
		
		/*
		 * switch의 문은 조건의 결과값이 무조건 정수여야 한다는 점이다. 중복되 되면 안되고 상수는 가능함. Final int SUM =10;
		 */
		
		switch(month) {	// 입력받은 month 변수의 값과 아래 케이스 값이 동일한지 확인 
		
			case 3: case 4: case 5:
				System.out.println("현재의 계절은 봄 입니다.");
				break;
			
			case 6:	case 7: case 8:
				System.out.println("현재의 계절은 여름입니다.");
				break;
			case 9:
			case 10:
			case 11:
				System.out.println("현재의 계절은 가을입니다.");
				break;
		
		default: // 제시한 조건에 전부 해당하지 않는 경우 default 실행문. 
			System.out.println("현재의 계절은 겨울입니다.");

			}	//switch 문의 끝
		} // main 문의 끝 
	}

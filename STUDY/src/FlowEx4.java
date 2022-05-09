import java.util.Scanner;

public class FlowEx4 {

	public static void main(String[] args) {

		int score = 0;
		char grade = ' ';

		System.out.println("점수를 입력하세요=>");
		Scanner scanner = new Scanner(System.in);
		score = scanner.nextInt();	//화면을 통해 입력받은 값을 스코어 변수에 저장

		if(score >= 90) {
			grade = 'A';
		}
		else if( 80<= score && score <= 90) {
			grade = 'B';
		}
		else if( 70< score && score <80) {
			grade = 'C';
		}
		else { grade = 'D'; }
		
		//			
		//		} else if(score >= 90) {
		//			grade = 'B';
		//				
		//		} else if(score >= 90) {
		//			grade = 'C';
		//
		//		} else {
		//			grade = 'D';
		//		}
		System.out.println("당신의 학점은 " + grade + " 입니다.");
	}
}

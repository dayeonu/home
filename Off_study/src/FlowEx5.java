import java.util.Scanner;

public class FlowEx5 {

	public static void main(String[] args) {

		int score = 0;
		char grade = ' ', opt = '0';	//자료형이 동일한 변수는 한줄에 사용가능함. char는 공백 한자리 있으면 선언가능. 
		
		System.out.println("점수를 입력해주세요");
		
		Scanner scanner = new Scanner(System.in);
		score = scanner.nextInt(); //화면을 통해 입력받은 점수를 스코어에 저장
		
		System.out.printf("당신의 점수는 %d입니다. %n", score	);	//키보드로 입력받은 score 출력, 
		
		if(score >= 90) {
			grade = 'A';
			if (score >= 98) {
				opt = '+';
			} else if (score < 94 ) {
				opt = '-';
			} 
		}
			else if(score >= 80) {
				grade = 'B';
				if (score >= 88) {
					opt = '+';
				} else if (score < 84 ) {
					opt = '-';
				} 
			} else {
				grade = 'C'	;
			}
			System.out.printf("당신의 학점은 %c%c입니다. %n", grade, opt);
		} // 변수 opt를 이미 0 으로 초기화 했기때문에 굳이  else문에  opt를 쓰지 않아도 조건에 맞을 경우 끌어다 온다. 
	}


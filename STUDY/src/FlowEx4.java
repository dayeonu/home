import java.util.Scanner;

public class FlowEx4 {

	public static void main(String[] args) {

		int score = 0;
		char grade = ' ';

		System.out.println("������ �Է��ϼ���=>");
		Scanner scanner = new Scanner(System.in);
		score = scanner.nextInt();	//ȭ���� ���� �Է¹��� ���� ���ھ� ������ ����

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
		System.out.println("����� ������ " + grade + " �Դϴ�.");
	}
}

import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		
		//정수입력 2개 받아 합계 구하기
		
		System.out.println("정수입력: ");
		Scanner scanner = new Scanner(System.in);
		int sc = scanner.nextInt();
		
		System.out.println("정수입력: ");
		int sc1 = scanner.nextInt();
		
		System.out.println( "result: " + (sc +sc1));
		
	}

}

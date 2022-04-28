import java.util.Scanner;

public class ex9 {

	public static void main(String[] args) {

		int user;

		System.out.println("별을 찍을 라인 갯수를 입력하세요>");
		Scanner scanner = new Scanner(System.in);
		user = scanner.nextInt();

		for(int i = 0; i<user; i++) { 	//외부 for문 
			for(int j =0; j<=i; j++) {	//내부 for문.. 조건문이 만족할 때까지 계속 돌다 빠져나오게 됨.
				System.out.printf("*");
			}System.out.println(); //줄바꿈
		}  
	}
}
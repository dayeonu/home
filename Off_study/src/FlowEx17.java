import java.util.Scanner;

public class FlowEx17 {

	public static void main(String[] args) {
		
		int num = 0;
		
		System.out.print("*을 출력할 라인의 숫자를 입력하세요>");
		
		Scanner scanner = new Scanner(System.in);
		String tmp = scanner.nextLine(); // 입력받은 문자열을 tmp에 저장. 
		num = Integer.parseInt(tmp); // 입력받은 문자열(tmp)를 num변수 숫자로 변환
		
		for(int i=0; i<num; i++) {
			for(int j =0; j<=i; j++) {
			System.out.print("*");
		}System.out.println();
		}
	}
}



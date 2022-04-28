import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		//숫자만 입력한다. 2자리 정수를 입력하기전까지 무한 반복 10~99
		//while
		//do- while  활용하기.
		
		
		Scanner sc = new Scanner(System.in);
		int num = 0;
		
		System.out.println("두 자리 정수를 입력하세요:");
	
		do {
			System.out.println("입력: ");
			num = sc.nextInt();
		}
		
		while(num > 9 && num <100);
						// 1. 9보다 num이 크고  
		 				//2. 100보다 num이 작아야 한다.
						}//그렇지 않으면, 다시 입력 해야 한다. 
	
public Ex04() {
	// TODO Auto-generated constructor stub
	}

}

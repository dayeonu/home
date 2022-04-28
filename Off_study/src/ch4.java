import java.util.Scanner;

public class ch4 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		//숫자, 문자 입력받기
		String prt = scanner.nextLine(); //숫자,문자 입력받기
		System.out.println(prt);		
	
		//숫자-> 문자열로 변환해주기 Integer.toString 사용하고 새로운 변수 만들어주기. 
		int num = scanner.nextInt(); //숫자,문자 입력받기
		String num2 = Integer.toString(num);
		System.out.println(num2);		
	}
}
		/*
		 *  int, string 순서 출력으로는 오류생김.
		 *  Scanner.nextInt 메소드는 사용자의 입력의 가장 마지막 개행문자(엔터,newline)을 제거하지 않음
		 *  개행문자(엔터) 전까지만 숫자로 입력을 받는다.
		 *  string, int 순서 출력은 받아진다... 
		 */
		

		/*
		 * 해결방법1: \e()추가 
		 * 해결방법2: Scanner.nextLine()으로 입력받고
		 * 					Integer.parseInt()로 변환
		 */

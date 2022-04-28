import java.util.Scanner;

public class gugudan2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
 
		for(int i = 1 ; i <10; i++) {
			
		System.out.println(n+" * "+i+" = "+(n*i) );}
		
	}}
		
/*//구구단 출력하기(백준 출제문제)
		
		int sum;
		int n;
		
		//n입력받기. 
		System.out.println("2~9까지 원하는 숫자 입력: 구구단");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();

		//구구단 계산문
			if( 2 > n || 10 <= n ){ 
				System.out.println("2~9까지만 입력바랍니다.");}
			else 
			for(int i = n ; i <= n; i++) { // 사용자에게 입력받은 값으로 조건문 생성하기.
				for(int j = 1; j<=9; j++) {
				sum = i * j; 
		//출력문.
			System.out.println(i + "*" + j + "=" + sum );
				}	
			}
	}	
}
*/

		//인터넷으로 검색한 간단한 풀이.
		/*Scanner in = new Scanner(System.in);	
		int a = in.nextInt();
		
		in.close();		
		
		for(int i = 1; i<10;i++) {
			System.out.println(a+" * "+i+" = "+(a*i));
		}}}*/

		
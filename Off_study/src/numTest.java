import java.util.Scanner;

public class numTest {

	public static void main(String[] args) {


		// 사용자에게 3가지 정수 입력 받아서, sort 하기.

		//스캐너로 입력 받기. 변수 초기화 및 
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();

		int min, mid, max;

		//		!!!포인트!!!
		max = num1;

		//		#3가지 정수 비교하기
		//		1. num1 와 num2 를 비교
		//		2. num2 와 num3 를 비교
		//		3. num3 과 num1 을 비교
		//		4. min의 변수에 가장 작은 값을 넣어주고
		//		5. max의 변수에 가장 큰 값을 넣어주고
		//		6. mid의 변수에 중간 값을 넣어준다. 

		//if문 사용 해서 값 비교, 참 거짓 수행문 만들기
		if(num2> max) { 		//입력받은 한가지 정수를 골라서, 비교
			if(num2 > num3) 
				max = num2;
			else 
				max = num3;
		}
		else if(num3 > max) {
			max = num3;

			// 사용자가 입력한 3가지 정수 출력문 
			System.out.println(max);
		}
	}
}

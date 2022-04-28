import java.util.Scanner;

public class Ex03 {

	//메인 함수 밖을 벗어나 static 을 기재하고 변수를 입력하면, 어느 함수에서든 쓸 수 있는 공용 변수가 된다.
static	int num1,num2,num3,max;

//세 정수를 입력받아서 최대값 출력( 배열X) >> 조건문 사용
	public static void main(String[] args) {

		//함수 호출문
		input(); 
		int max = calu(); 
		output(max); 
	}

	static void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 3개 입력 : ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
	}

	static int calu() { // 자료형 꼭 같은 걸로 써야 함. 
		max = num1;  
		if(num2 > max) {
			if(num2 > num3)
				max = num2;
			else
				max = num3;
		}
		else if(num3 > max)
			max = num3;
		return max;
		}
	
	static void output(int num) { 
		System.out.println("가장 큰 정수 값 : " + num);
	}
}//end

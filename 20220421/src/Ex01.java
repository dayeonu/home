import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//세 정수 입력 받아서 최대값 출력 (배열x)
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("정수 3개 입력:");
//		int user = sc.nextInt(); 
//		int user2 = sc.nextInt(); 
//		int user3 = sc.nextInt();
//		
//		int max=0; // 가장 큰 값을 넣을 빈 공간
	
		//내가 작성한 문장
		// 10 5 8 
		/*
		 * if(user > user2){ //user값이 user2값보다 크니? 크면 max에 user값을 넣어. max=user;}
		 * if(user> user3) { //user값이 user3값보다 크니? 크면 max에 user값을 넣어. max=user;} if
		 * (user3 > user) { // user3값이 user값보다 크니? max=user;} // user3값이 user값보다 크면 min에
		 * user값을 넣어.
		 * 
		 * System.out.println(max);
		 */
		
		//세 정수를 입력받아서 최대값 출력( 배열X) >> 조건문 사용
		
		Scanner sc = new Scanner(System.in);

		int num1,num2,num3;
		int max, min, med;
		max = min = med = 0;

		System.out.println("정수 3개 입력 : ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		
		if(num2 > max) {
			if(num2 > num3)
				max = num2;
			else
				max = num3;
		}
		else if(num3 > max)
			max = num3;
		System.out.println("max : " + max);

		System.out.println("------------------------");
		//세 정수를 큰 순서 대로 출력

		if(num2 >num1){ // num1 값이 num2보다 작으면, 
			
			if(num2> num3) { // 
				max = num2;
				if( num1 > num3) {
					med = num1;
					min = num3;
				}
			
				else {
					med = num3;
					min = num1;
				}
				}
				else {
				max = num3;
				med = num2;
				min = num1;
				}
				} else if(num3>num1) {
				max = num3;
				med = num2;
				min = num1; 
			}
				
	}


}

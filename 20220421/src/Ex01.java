import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//�� ���� �Է� �޾Ƽ� �ִ밪 ��� (�迭x)
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("���� 3�� �Է�:");
//		int user = sc.nextInt(); 
//		int user2 = sc.nextInt(); 
//		int user3 = sc.nextInt();
//		
//		int max=0; // ���� ū ���� ���� �� ����
	
		//���� �ۼ��� ����
		// 10 5 8 
		/*
		 * if(user > user2){ //user���� user2������ ũ��? ũ�� max�� user���� �־�. max=user;}
		 * if(user> user3) { //user���� user3������ ũ��? ũ�� max�� user���� �־�. max=user;} if
		 * (user3 > user) { // user3���� user������ ũ��? max=user;} // user3���� user������ ũ�� min��
		 * user���� �־�.
		 * 
		 * System.out.println(max);
		 */
		
		//�� ������ �Է¹޾Ƽ� �ִ밪 ���( �迭X) >> ���ǹ� ���
		
		Scanner sc = new Scanner(System.in);

		int num1,num2,num3;
		int max, min, med;
		max = min = med = 0;

		System.out.println("���� 3�� �Է� : ");
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
		//�� ������ ū ���� ��� ���

		if(num2 >num1){ // num1 ���� num2���� ������, 
			
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

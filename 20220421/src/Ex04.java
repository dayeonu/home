import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		//���ڸ� �Է��Ѵ�. 2�ڸ� ������ �Է��ϱ������� ���� �ݺ� 10~99
		//while
		//do- while  Ȱ���ϱ�.
		
		
		Scanner sc = new Scanner(System.in);
		int num = 0;
		
		System.out.println("�� �ڸ� ������ �Է��ϼ���:");
	
		do {
			System.out.println("�Է�: ");
			num = sc.nextInt();
		}
		
		while(num > 9 && num <100);
						// 1. 9���� num�� ũ��  
		 				//2. 100���� num�� �۾ƾ� �Ѵ�.
						}//�׷��� ������, �ٽ� �Է� �ؾ� �Ѵ�. 
	
public Ex04() {
	// TODO Auto-generated constructor stub
	}

}

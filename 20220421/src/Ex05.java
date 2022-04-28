import java.util.Scanner;

public class Ex05 {
	
	
	static int[][] mdays = {
			{31,28,31,30,31,30,31,31,30,31,30,31}, //���
			{31,29,31,30,31,30,31,31,30,31,30,31} //����
	};
	
	
	static int isLeap(int year) {  //���, ���� ���
		return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)? 1 : 0;
	}
	
	
	
	//��� �� ���� ����
	static int dayOfYear(int year, int month, int day) {
		
		int days = day;
		for(int i=1; i<month; i++ )
			days += mdays[isLeap(year)][i-1];
		
		return days;
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int re = 0;
		System.out.println(" �� �� ��� �ϼ��� ���Ѵ�.");
		
		do {
			// do-while ���� 
			// do���� ������ ���� �ѹ��� ���ǹ��� �������ְ�,
			// while�� �Ѿ�� ���� 
			System.out.print("�� �Է� : "); 
			int year = sc.nextInt();
			System.out.print("�� �Է� : "); 
			int month = sc.nextInt();
			System.out.print("�� �Է� : "); 
			int day = sc.nextInt();
			System.out.printf("�� �� %d��° ���Դϴ�.\n", dayOfYear(year,month,day));
			
			System.out.println("�ݺ�(yes(1) / No(0))");
			re = sc.nextInt();
			
		}while(re == 1);
		
	}
}
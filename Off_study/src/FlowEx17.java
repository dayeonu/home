import java.util.Scanner;

public class FlowEx17 {

	public static void main(String[] args) {
		
		int num = 0;
		
		System.out.print("*�� ����� ������ ���ڸ� �Է��ϼ���>");
		
		Scanner scanner = new Scanner(System.in);
		String tmp = scanner.nextLine(); // �Է¹��� ���ڿ��� tmp�� ����. 
		num = Integer.parseInt(tmp); // �Է¹��� ���ڿ�(tmp)�� num���� ���ڷ� ��ȯ
		
		for(int i=0; i<num; i++) {
			for(int j =0; j<=i; j++) {
			System.out.print("*");
		}System.out.println();
		}
	}
}



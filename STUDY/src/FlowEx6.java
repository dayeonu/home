import java.util.Scanner;

public class FlowEx6 {

	public static void main(String[] args) {
		
		System.out.println("���� ���� �Է��ϼ���:");
		
		Scanner scanner = new Scanner(System.in);
		int month = scanner.nextInt();
		
		/*
		 * switch�� ���� ������ ������� ������ �������� �Ѵٴ� ���̴�. �ߺ��� �Ǹ� �ȵǰ� ����� ������. Final int SUM =10;
		 */
		
		switch(month) {	// �Է¹��� month ������ ���� �Ʒ� ���̽� ���� �������� Ȯ�� 
		
			case 3: case 4: case 5:
				System.out.println("������ ������ �� �Դϴ�.");
				break;
			
			case 6:	case 7: case 8:
				System.out.println("������ ������ �����Դϴ�.");
				break;
			case 9:
			case 10:
			case 11:
				System.out.println("������ ������ �����Դϴ�.");
				break;
		
		default: // ������ ���ǿ� ���� �ش����� �ʴ� ��� default ���๮. 
			System.out.println("������ ������ �ܿ��Դϴ�.");

			}	//switch ���� ��
		} // main ���� �� 
	}

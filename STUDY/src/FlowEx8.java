import java.util.Scanner;

public class FlowEx8 {

	public static void main(String[] args) {

		System.out.println("�ֹι�ȣ 000000-0���� �Է��ϼ���. - �ε�ȣ ����");
	
		Scanner scanner = new Scanner(System.in);
		String regNo = scanner.nextLine();
		
		
		//�̾� ����, ���ʺ��� 0�� �ڸ���. �׷��� 8�� �ƴ϶� 7��.
		//charAt() 
		char gender= regNo.charAt(7); 
		
		switch(gender) {
			case '1' : case '3' :
				System.out.println("����� �����Դϴ�.");
				break;
			case '2' : case '4' :
				System.out.println("����� �����Դϴ�.");
				break;
				
			default :
				System.out.println("��ȿ���� �ʴ� �ֹι�ȣ �Դϴ�.");
		}
		
	}

}

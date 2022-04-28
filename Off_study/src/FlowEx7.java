import java.util.Scanner;

public class FlowEx7 {

	public static void main(String[] args) {

		System.out.print("����(1), ����(2), ��(3) �� �ϳ��� �Է��ϼ���. >");

		Scanner scanner = new Scanner(System.in);
		int user = scanner.nextInt();
		int com = (int)(Math.random()*3)+1; //���� ���ڴ� ���� com�� �����. 
		
		/*
		 * 0.0�̻� 1.0�̸��� ������ ������ �������� ������ �Լ�. 
		 * (int)(Math.random())�տ� int���� ����� ������, ���������� ���� �̾�
		 * ���� �;����Ƿ� �Ǽ��� -> ������ ����ȯ ���ذ�(��������ȯ). ������ ������ ȯ���ϰ� ���� ��, *3 + 1�� ����Ѵ�. +1�� ���� ������, ������
		 * 0,1,2 ������ �����Ƿ� 0�� �ʿ���� �� �� 1,2,3 ������ ȯ���ϰ� ���� �� ����. 3���� �� ���� 20���� ���� ����ϰ� ���� ��
		 * �׳� *20�� �ϸ� �ȴ�.
		 */
		System.out.println("����� " + user +"�Դϴ�.");
		System.out.println("���� " + com +"�Դϴ�.");

		switch(user-com) { //���ǽ� 

		case 2: case -1:
			System.out.println("����� �����ϴ�");
			break;
			
		case 1: case -2:
			System.out.println("����� �̰���ϴ�");
			break;
			
		default : System.out.println("�����ϴ�.");
		}
	}
}
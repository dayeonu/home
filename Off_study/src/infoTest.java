import java.util.Scanner;

public class infoTest {

	public static void main(String[] args) {

		System.out.println("[�ʼ� ���� �Է�]");
		System.out.println("1.�̸�:______");
		System.out.println("2.�ֹι�ȣ �� 6�ڸ�:______");
		System.out.println("3.��ȭ��ȣ:______");
		System.out.println("������� �Է����ּ���");
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		int num = sc.nextInt();
		String phone = sc.next();
		System.out.println("[�Է��� ����]");
		System.out.println("1.�̸�:" + name);
		System.out.println("2.�ֹι�ȣ �� 6�ڸ�:" + num);
		System.out.println("3.��ȭ��ȣ:" + phone);
	}

}

import java.util.Scanner;

public class ex9 {

	public static void main(String[] args) {

		int user;

		System.out.println("���� ���� ���� ������ �Է��ϼ���>");
		Scanner scanner = new Scanner(System.in);
		user = scanner.nextInt();

		for(int i = 0; i<user; i++) { 	//�ܺ� for�� 
			for(int j =0; j<=i; j++) {	//���� for��.. ���ǹ��� ������ ������ ��� ���� ���������� ��.
				System.out.printf("*");
			}System.out.println(); //�ٹٲ�
		}  
	}
}
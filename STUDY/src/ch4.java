import java.util.Scanner;

public class ch4 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		//����, ���� �Է¹ޱ�
		String prt = scanner.nextLine(); //����,���� �Է¹ޱ�
		System.out.println(prt);		
	
		//����-> ���ڿ��� ��ȯ���ֱ� Integer.toString ����ϰ� ���ο� ���� ������ֱ�. 
		int num = scanner.nextInt(); //����,���� �Է¹ޱ�
		String num2 = Integer.toString(num);
		System.out.println(num2);		
	}
}
		/*
		 *  int, string ���� ������δ� ��������.
		 *  Scanner.nextInt �޼ҵ�� ������� �Է��� ���� ������ ���๮��(����,newline)�� �������� ����
		 *  ���๮��(����) �������� ���ڷ� �Է��� �޴´�.
		 *  string, int ���� ����� �޾�����... 
		 */
		

		/*
		 * �ذ���1: \e()�߰� 
		 * �ذ���2: Scanner.nextLine()���� �Է¹ް�
		 * 					Integer.parseInt()�� ��ȯ
		 */

import java.util.Scanner;

public class numTest {

	public static void main(String[] args) {


		// ����ڿ��� 3���� ���� �Է� �޾Ƽ�, sort �ϱ�.

		//��ĳ�ʷ� �Է� �ޱ�. ���� �ʱ�ȭ �� 
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();

		int min, mid, max;

		//		!!!����Ʈ!!!
		max = num1;

		//		#3���� ���� ���ϱ�
		//		1. num1 �� num2 �� ��
		//		2. num2 �� num3 �� ��
		//		3. num3 �� num1 �� ��
		//		4. min�� ������ ���� ���� ���� �־��ְ�
		//		5. max�� ������ ���� ū ���� �־��ְ�
		//		6. mid�� ������ �߰� ���� �־��ش�. 

		//if�� ��� �ؼ� �� ��, �� ���� ���๮ �����
		if(num2> max) { 		//�Է¹��� �Ѱ��� ������ ���, ��
			if(num2 > num3) 
				max = num2;
			else 
				max = num3;
		}
		else if(num3 > max) {
			max = num3;

			// ����ڰ� �Է��� 3���� ���� ��¹� 
			System.out.println(max);
		}
	}
}

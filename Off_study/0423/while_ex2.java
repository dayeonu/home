
public class while_ex2 {

	public static void main(String[] args) {

	//	1���� 1�� �������Ѽ� �հ谡 100�� �ʰ��� �� i�� ���� �� �հ踦 ������.
		
		int i = 0;
		int sum =0;
		
		while(sum<=20) {
			
			System.out.println("�հ�: " + sum + "  i�� ��:" + i );
			System.out.println();

		// 0 = 0 + 0
		// 1 = 0 + 1
		// 3 = 1 + 2
			sum += ++i;
			System.out.println("i�� �� :"  + i);
		}
	}
}

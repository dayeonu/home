
public class whileEx3 {

	public static void main(String[] args) {

		int num=0, sum =0;
		
		//�� �ڸ� ���ڸ� ����
		
		for(num=123456; num>0; num = num/10) {
			System.out.println(num%10); //�������� ������ ������ �ڸ����� ���� �ȴ�.
			sum += num % 10;	
		}
		System.out.println("�� �ڸ����� ��" + sum );
	
}
}

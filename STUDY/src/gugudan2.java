import java.util.Scanner;

public class gugudan2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
 
		for(int i = 1 ; i <10; i++) {
			
		System.out.println(n+" * "+i+" = "+(n*i) );}
		
	}}
		
/*//������ ����ϱ�(���� ��������)
		
		int sum;
		int n;
		
		//n�Է¹ޱ�. 
		System.out.println("2~9���� ���ϴ� ���� �Է�: ������");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();

		//������ ��깮
			if( 2 > n || 10 <= n ){ 
				System.out.println("2~9������ �Է¹ٶ��ϴ�.");}
			else 
			for(int i = n ; i <= n; i++) { // ����ڿ��� �Է¹��� ������ ���ǹ� �����ϱ�.
				for(int j = 1; j<=9; j++) {
				sum = i * j; 
		//��¹�.
			System.out.println(i + "*" + j + "=" + sum );
				}	
			}
	}	
}
*/

		//���ͳ����� �˻��� ������ Ǯ��.
		/*Scanner in = new Scanner(System.in);	
		int a = in.nextInt();
		
		in.close();		
		
		for(int i = 1; i<10;i++) {
			System.out.println(a+" * "+i+" = "+(a*i));
		}}}*/

		
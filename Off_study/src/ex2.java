
public class ex2 {

	public static void main(String[] args) {
		/*
		 * �� ������ ���� ü���� �ϱ� 
		 * 
		 * int x = 10; int j = x; // j ������� ������� x���� �־��ָ� �ᱹ x���� j������
		 * ����Ǵ� ��.
		 * 
		 * System.out.println(j);
		 */	
		
		int x =3, y=5;
		System.out.println(" x :" + x + " y :" + y);

		int tmp = x; //x=3�� ���� tmp�� ü���� 
		x = y; // y= 5�� ���� x�� ü����
		y = tmp; // tmp�� ���� y�� ü����
		System.out.println(" x : " + x + " y : "+ y);
	}
	}



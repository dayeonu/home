
public class ex2 {

	public static void main(String[] args) {
		/*
		 * 두 변수의 값을 체인지 하기 
		 * 
		 * int x = 10; int j = x; // j 변수라는 빈공간에 x값을 넣어주면 결국 x값이 j값으로
		 * 변경되는 것.
		 * 
		 * System.out.println(j);
		 */	
		
		int x =3, y=5;
		System.out.println(" x :" + x + " y :" + y);

		int tmp = x; //x=3의 값이 tmp로 체인지 
		x = y; // y= 5의 값이 x로 체인지
		y = tmp; // tmp의 값이 y로 체인지
		System.out.println(" x : " + x + " y : "+ y);
	}
	}



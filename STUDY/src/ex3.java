
public class ex3 {

	public static void main(String[] args) {
		
//		x값과 y값을 바꾸기
		
		int x = 20; int y=50;
		int tmp;

		tmp = x;  // 빈 공간인  tmp 변수를 생성해야, x와 y의 값 체인지가 가능하다. 
		x = y; //x는 50
		y = tmp; //y는 20
		
		//
		System.out.println(x);
		System.out.println(y);
	}

}

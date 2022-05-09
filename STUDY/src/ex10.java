
public class ex10 {

	public static void main(String[] args) {

		//3141
		float pi = 3.141592f;
		float shortPi = pi * 1000;  //3141.592
		int tmp = (int)shortPi; // int형으로 강제형변환 
		System.out.println(tmp);
		
		//3.141
		float tmp2 = (float)tmp/1000;
		System.out.println(tmp2);
	}
}

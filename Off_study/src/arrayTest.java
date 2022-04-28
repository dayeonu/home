import java.util.Arrays;

public class arrayTest {

	public static void main(String[] args) {

		int[] iArr1 = new int[10]; //10개 배열 생성, 초기화
		System.out.println(Arrays.toString(iArr1)); // int 자료형의 배열 디폴트 값은 0이다.
		System.out.println("-------------------------------");
		int[] iArr2 = new int[10];
		int[] iArr3 = {100, 95, 80, 70, 60};
		char[] chArr = { 'a', 'b','c' };


		for(int i =0; i<iArr1.length; i++) { // 0~9까지 
			iArr1[i] = 1; // 1~10까지 값을 차례대로 넣어준다. iArr1[0]=1, iArr1[1]=2 ,,,, iArr1[9]=10
			System.out.print(Arrays.toString(iArr1));
			System.out.println();
		}
		System.out.println("-------------------------------");
		for(int i = 0; i < iArr2.length; i++) { //0~9까지
			iArr2[i] = (int)(Math.random()*10); // iArr2[0]=랜덤값1, iArr2[1]=랜덤값2,,,, iArr2[9]=랜덤값10 
			System.out.print(Arrays.toString(iArr2));
			System.out.println();
		}

		System.out.println("-------------------------------");

		for(int i=0; i < iArr1.length; i++) { // 0~9까지
			System.out.println(iArr1[i]+","); // 1,2,3,4,5,6,7,8,9,10 
		}
		System.out.println(); //줄바꿈

		System.out.println(Arrays.toString(iArr2)); // 랜덤값 범위는 0~9까지. 갯수는 1~10개가 출력됨. 계속해서 바뀜 
		System.out.println(Arrays.toString(iArr3)); // [100, 95, 80, 70, 60]
		System.out.println(Arrays.toString(chArr));// [ a, b, c]
		System.out.println(iArr3); // 주소값나옴.
		System.out.println(chArr); //abc
	}
}

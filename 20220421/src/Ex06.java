import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {

		//
		//(문제)int[] nArr = new int[10]; ==> 난수 0~9를 배열
		// 단 붙어있는 아이는 중복되면 안된다. 0,5,7,9,8		 
		//
		Random rand = new Random(7);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("배열 갯수 입력: ");
		int n = sc.nextInt();
		int[] nArr = new int[n]; //배열 결정

		nArr[0] = rand.nextInt(10);
		
		for(int i =1; i<nArr.length; i++) {
			do {
				nArr[i] = rand.nextInt(10); // 랜덤 0~10 사이 숫자가 입력됨
			}while(nArr[i] == nArr[i-1]);
		} 
			System.out.println(Arrays.toString(nArr));
	}	
}
/*
 * 메소드 호출 
 * 문법 
 * 1. 객체참조변수이름. 메소드이름(); //매개변수가 없는 메소드의 호출
 * 2. 객체참조변수이름. 메소드이름(인수1,인수2, ,,,) //매개변수가 있는 메소드의 호출
 *
 * 
 * 
 */
import java.util.Arrays;

public class ch5_6_7 {

	public static void main(String[] args) {
		
		int[] iArr = {100,95,80,70,60}; // 길이가 5인 int배열
		
		System.out.println(iArr); // 이대로 출력하면, 해당 배열의 주소값? 나옴 배열안의 값들은 안보임 이럴땐, 
								//Arrays.toString(iArr) 해야 나옴
		
		for(int i =0; i<iArr.length; i++) { //배열의 길이 5 니까. 0~4 범위가되고 i가 0일떄 배열 0자리를 쳐다보면 됨. 
											// i가 0일때 100 
											// i가 1일때 95 
											// i가 2일때 80 
											// i가 3일때 70 
											// i가 4일때 60 
			
			System.out.print(iArr[i]+",");
	
		}System.out.println();
		System.out.println(Arrays.toString(iArr)); // 배열 값이 문자열로 반환되서 출력된다,
	}

}

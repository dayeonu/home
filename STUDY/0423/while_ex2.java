
public class while_ex2 {

	public static void main(String[] args) {

	//	1부터 1씩 증가시켜서 합계가 100이 초과될 때 i의 값과 그 합계를 보여줘.
		
		int i = 0;
		int sum =0;
		
		while(sum<=20) {
			
			System.out.println("합계: " + sum + "  i의 값:" + i );
			System.out.println();

		// 0 = 0 + 0
		// 1 = 0 + 1
		// 3 = 1 + 2
			sum += ++i;
			System.out.println("i의 값 :"  + i);
		}
	}
}


public class whileEx3 {

	public static void main(String[] args) {

		int num=0, sum =0;
		
		//각 자리 숫자를 추출
		
		for(num=123456; num>0; num = num/10) {
			System.out.println(num%10); //나머지로 나누면 마지막 자리수만 남게 된다.
			sum += num % 10;	
		}
		System.out.println("각 자리수의 합" + sum );
	
}
}

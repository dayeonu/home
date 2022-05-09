
public class vartest {

	public static void main(String[] args) {

		System.out.printf("%5d%n", 10); // 공백5칸을 만들어주고 10을 출력해준다.
		System.out.printf("%6d%n", 10); // 공백6칸을 만들어주고 10을 출력해준다.
		System.out.printf("%7d%n", 10); // 공백7칸을 만들어주고 10을 출력해준다.
		System.out.printf("%6d%n", 10); // 공백6칸을 만들어주고 10을 출력해준다.
		System.out.printf("%5d%n", 10); // 공백5칸을 만들어주고 10을 출력해준다.
		System.out.printf("%5d%n", 10); // 공백5칸을 만들어주고 10을 출력해준다.
		System.out.printf("%6d%n", 10); // 공백6칸을 만들어주고 10을 출력해준다.
		System.out.printf("%7d%n", 10); // 공백7칸을 만들어주고 10을 출력해준다.
		System.out.printf("%6d%n", 10); // 공백6칸을 만들어주고 10을 출력해준다.
		System.out.printf("%5d%n", 10); // 공백5칸을 만들어주고 10을 출력해준다.

		System.out.printf("[%-5d]%n", 10); // 공백5칸을 만들어주고 10을 출력해준다.
		System.out.printf("[%-4d]%n", 10); // 공백5칸을 만들어주고 10을 출력해준다.
		System.out.printf("[%-3d]%n", 10); // 공백5칸을 만들어주고 10을 출력해준다.
		System.out.printf("[%-2d]%n", 10); // 공백5칸을 만들어주고 10을 출력해준다.
		System.out.printf("[%-1d]%n", 10); // 공백5칸을 만들어주고 10을 출력해준다.

		System.out.printf("[%05d]%n", 10); // 공백에 0으로 채우고 10을 출력한다.
		System.out.printf("[%010d]%n", 10); // 공백에 0으로 채우고 10을 출력한다..
		System.out.printf("[%020d]%n", 10); //  공백에 0으로 채우고 10을 출력한다..
	
		double d = 1.23456789;
		System.out.printf("[d=%14.10f]%n", d); //14칸 만들어주고 나머지칸 0으로 채우기.
	}
}
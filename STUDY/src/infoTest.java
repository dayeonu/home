import java.util.Scanner;

public class infoTest {

	public static void main(String[] args) {

		System.out.println("[필수 정보 입력]");
		System.out.println("1.이름:______");
		System.out.println("2.주민번호 앞 6자리:______");
		System.out.println("3.전화번호:______");
		System.out.println("순서대로 입력해주세요");
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		int num = sc.nextInt();
		String phone = sc.next();
		System.out.println("[입력한 내용]");
		System.out.println("1.이름:" + name);
		System.out.println("2.주민번호 앞 6자리:" + num);
		System.out.println("3.전화번호:" + phone);
	}

}

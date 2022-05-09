import java.util.Scanner;

public class ex8 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String inputData;
		
		while(true) {
			inputData = scanner.nextLine(); // 입력받은 문자열을inputData에 저장. 
			System.out.println("입력된 문자열(종료시 q입력):  " + inputData);
				if(inputData.equals("q")) { //inputData변수에 저장된 값과, "q"의 문자열 비교 equals 
					break;
				}
	}
		System.out.println("종료");

}
}
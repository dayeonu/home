import java.util.Scanner;

public class ex8 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String inputData;
		
		while(true) {
			inputData = scanner.nextLine(); // �Է¹��� ���ڿ���inputData�� ����. 
			System.out.println("�Էµ� ���ڿ�(����� q�Է�):  " + inputData);
				if(inputData.equals("q")) { //inputData������ ����� ����, "q"�� ���ڿ� �� equals 
					break;
				}
	}
		System.out.println("����");

}
}
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {

		//
		//(����)int[] nArr = new int[10]; ==> ���� 0~9�� �迭
		// �� �پ��ִ� ���̴� �ߺ��Ǹ� �ȵȴ�. 0,5,7,9,8		 
		//
		Random rand = new Random(7);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�迭 ���� �Է�: ");
		int n = sc.nextInt();
		int[] nArr = new int[n]; //�迭 ����

		nArr[0] = rand.nextInt(10);
		
		for(int i =1; i<nArr.length; i++) {
			do {
				nArr[i] = rand.nextInt(10); // ���� 0~10 ���� ���ڰ� �Էµ�
			}while(nArr[i] == nArr[i-1]);
		} 
			System.out.println(Arrays.toString(nArr));
	}	
}
/*
 * �޼ҵ� ȣ�� 
 * ���� 
 * 1. ��ü���������̸�. �޼ҵ��̸�(); //�Ű������� ���� �޼ҵ��� ȣ��
 * 2. ��ü���������̸�. �޼ҵ��̸�(�μ�1,�μ�2, ,,,) //�Ű������� �ִ� �޼ҵ��� ȣ��
 *
 * 
 * 
 */
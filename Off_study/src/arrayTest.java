import java.util.Arrays;

public class arrayTest {

	public static void main(String[] args) {

		int[] iArr1 = new int[10]; //10�� �迭 ����, �ʱ�ȭ
		System.out.println(Arrays.toString(iArr1)); // int �ڷ����� �迭 ����Ʈ ���� 0�̴�.
		System.out.println("-------------------------------");
		int[] iArr2 = new int[10];
		int[] iArr3 = {100, 95, 80, 70, 60};
		char[] chArr = { 'a', 'b','c' };


		for(int i =0; i<iArr1.length; i++) { // 0~9���� 
			iArr1[i] = 1; // 1~10���� ���� ���ʴ�� �־��ش�. iArr1[0]=1, iArr1[1]=2 ,,,, iArr1[9]=10
			System.out.print(Arrays.toString(iArr1));
			System.out.println();
		}
		System.out.println("-------------------------------");
		for(int i = 0; i < iArr2.length; i++) { //0~9����
			iArr2[i] = (int)(Math.random()*10); // iArr2[0]=������1, iArr2[1]=������2,,,, iArr2[9]=������10 
			System.out.print(Arrays.toString(iArr2));
			System.out.println();
		}

		System.out.println("-------------------------------");

		for(int i=0; i < iArr1.length; i++) { // 0~9����
			System.out.println(iArr1[i]+","); // 1,2,3,4,5,6,7,8,9,10 
		}
		System.out.println(); //�ٹٲ�

		System.out.println(Arrays.toString(iArr2)); // ������ ������ 0~9����. ������ 1~10���� ��µ�. ����ؼ� �ٲ� 
		System.out.println(Arrays.toString(iArr3)); // [100, 95, 80, 70, 60]
		System.out.println(Arrays.toString(chArr));// [ a, b, c]
		System.out.println(iArr3); // �ּҰ�����.
		System.out.println(chArr); //abc
	}
}

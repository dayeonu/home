import java.util.Arrays;

public class ch5_6_7 {

	public static void main(String[] args) {
		
		int[] iArr = {100,95,80,70,60}; // ���̰� 5�� int�迭
		
		System.out.println(iArr); // �̴�� ����ϸ�, �ش� �迭�� �ּҰ�? ���� �迭���� ������ �Ⱥ��� �̷���, 
								//Arrays.toString(iArr) �ؾ� ����
		
		for(int i =0; i<iArr.length; i++) { //�迭�� ���� 5 �ϱ�. 0~4 �������ǰ� i�� 0�ϋ� �迭 0�ڸ��� �Ĵٺ��� ��. 
											// i�� 0�϶� 100 
											// i�� 1�϶� 95 
											// i�� 2�϶� 80 
											// i�� 3�϶� 70 
											// i�� 4�϶� 60 
			
			System.out.print(iArr[i]+",");
	
		}System.out.println();
		System.out.println(Arrays.toString(iArr)); // �迭 ���� ���ڿ��� ��ȯ�Ǽ� ��µȴ�,
	}

}

import java.util.Arrays;

public class Ex04_1 {

	public static void main(String[] args) {

		
		int[] nArr1 = {10,20,30,40,50};
		int[] nArr2 = {10,20,3,40,50};
	
		boolean check = ArrayEqual(nArr1,nArr2);
		
		System.out.print("nArr1 : ");
		for(int i : nArr1)
			System.out.print(i+ " ");
		
		System.out.println();
		
		System.out.print("nArr2 : ");
		for(int i : nArr2)
			System.out.print(i+ " ");
		
		System.out.println("\n �� ��Ҵ� " + check);
	}
	
//�� �迭 �񱳴� ���⼭
	static boolean ArrayEqual(int[] n1, int[] n2) {
	
		if(n1.length != n2.length) //�迭�� ���̰� ���� �ִٸ� false 
			return false;
		
		for(int i = 0; i<n1.length; i++){
			if(n1[i] != n2[i])
				return false;
		
		return true;
	}
		return false;
}}
//		if(nArr1 == nArr2) {
//			System.out.println("true");
//		}
//			else {
//			System.out.println("false"); 
//		}
		//�迭�� ����, �ʱ�ȭ, ����, ... ��?
//		System.out.println(nArr1.length == nArr2.length); 
		//���̴� ���ٰ� ����.
		
//		System.out.println(nArr1 == nArr2);
		//������ ���� �ٸ��ٰ� ����.



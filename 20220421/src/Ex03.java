import java.util.Scanner;

public class Ex03 {

	//���� �Լ� ���� ��� static �� �����ϰ� ������ �Է��ϸ�, ��� �Լ������� �� �� �ִ� ���� ������ �ȴ�.
static	int num1,num2,num3,max;

//�� ������ �Է¹޾Ƽ� �ִ밪 ���( �迭X) >> ���ǹ� ���
	public static void main(String[] args) {

		//�Լ� ȣ�⹮
		input(); 
		int max = calu(); 
		output(max); 
	}

	static void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("���� 3�� �Է� : ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
	}

	static int calu() { // �ڷ��� �� ���� �ɷ� ��� ��. 
		max = num1;  
		if(num2 > max) {
			if(num2 > num3)
				max = num2;
			else
				max = num3;
		}
		else if(num3 > max)
			max = num3;
		return max;
		}
	
	static void output(int num) { 
		System.out.println("���� ū ���� �� : " + num);
	}
}//end

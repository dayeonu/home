import java.util.Scanner;

public class Student {

	public static void main(String[] args) {

		// 5�� �л� �ΰ���(����, ����)�� �Է¹޾Ƽ� ���� ���, �л��� ����� ���ϴ� ���α׷�
				Scanner sc = new Scanner(System.in);
				
				int number = 5;  // �ο���
				
				int[][] subject = new int[number][2]; //����
				int[] totalStudent = new int[number];  //�л��� ����
				int[] totalSubject = new int[2];  //������ ����

				System.out.printf("%d�� ����, ���� ���� �Է�.\n",number);
				
				for(int i=0; i<number; i++) {
					System.out.printf("%d�� ����:",i+1);
					subject[i][0] = sc.nextInt();  //����
					System.out.println("    ����:");
					subject[i][1] = sc.nextInt();  //����
					
					totalStudent[i] = subject[i][0] + subject[i][1];  //�л��հ�
					totalSubject[0] += subject[i][0];  //���� �հ�
					totalSubject[1] += subject[i][1];  //���� �հ�
				}
				
				System.out.println("No.    ����   ����   ���");
				for(int i=0; i<number; i++) 
					System.out.printf("%2d %6d %6d %6.1f\n", i+1, subject[i][0],
							subject[i][1],  (double)totalStudent[i]/2);
					
					System.out.printf("��� %6.1f %6.1f\n", (double)totalSubject[0]/number,
															(double)totalSubject[1]/number);
				
				
			}
}


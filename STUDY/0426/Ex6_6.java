
class Data {int x;}//������� �Ѱ���, x���̴�. 

public class Ex6_6 {
	// �ڹ�������(������) 6-6 ���� 
	
	
//void�� ��ȯ�� ����
	public static void main(String[] args) {
		
		//Data ������ 
		Data d = new Data();
		d.x = 10;
		System.out.println("main() : x = " + d.x);
		
		
		//�޼��� ȣ��κ� 
		change(d.x);
		System.out.println("After change(d.x)" );
		System.out.println("main() : x = " + d.x);
	}

//void�� ��ȯ�� ����
	static void change(int x) {
		x = 1000;
		System.out.println("change() : x = " + x);
	}
}


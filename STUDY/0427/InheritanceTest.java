// �ڹ��� ����(������) ch7-3,4

class MyPoint {
	int x;
	int y;
}
	
//class Circle extends MyPoint {//���
//	int r;
//}

class Circle extends Object{	//����
// 	MyPoint p; �̰��� ���������� ���� �صθ� ���� ������ ������ �ʾұ� ������ �ڿ� ��������� �����ϴ�. 
	MyPoint p = new MyPoint(); // ��ó�� �ش� ��ü ������ �� ����� ���� ������ ����ϴ�. ���������� �ʱ�ȭ!!
	int r;
	
//�����ڿ��� �ʱ�ȭ�� ���ִ���, �׷��� ���� ������ ����! 
	Circle(){
		p = new MyPoint();
	}
}

public class InheritanceTest {
	public static void main(String[] args) {
		Circle c = new Circle();	// c�� ����Ű�� p�� ��ü!  �ش� ��ü�� �׸����� �׷�������.
		System.out.println(c.toString());	//Circle@5e91993f
		System.out.println(c);				//Circle@5e91993f �� �Ʒ� ������ ��°���� ����.  tostring�� ��밡���� ������ 
											//Object Ŭ���� �κ��� ����� �޾Ƽ� �� �� �ֱ� �����̴�. 
//		c.x = 1;
//		c.y = 2;
//		c.r = 3;
		c.p.x = 1;
		c.p.y = 2;
		c.r = 3;
//	System.out.println("c.x=" + c.x); 
//	System.out.println("c.y=" + c.y); 
//	System.out.println("c.r=" + c.r); 
	
	System.out.println("c.p.x=" + c.p.x); 
	System.out.println("c.p.y=" + c.p.y); 
	System.out.println("c.r=" + c.r); 
	}

}

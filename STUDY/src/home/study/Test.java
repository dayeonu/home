package home.study;
//����Ŭ���� ���������� ����Ŭ���� ���� ����
//����Ŭ���� ���������� ����Ŭ���� ���� �Ұ�
//��, ����Ŭ������ ������ ����Ŭ������ ����Ŭ���� ������������ Ÿ�Ժ�ȯ �� �����ϰ� �� �� �ִ�.
public class Test {

	public static void main(String[] args) {
		Object obj = new BB(new D());  //Object�� ��� Ŭ������ ���� �� �� �ִ� �ֻ��� Ŭ�����̱� ������,
										//������ ���� ������ �ڿ��� ���ο� �����Ǿ��ִ�. ���� �Ϸ��� Ÿ�Ժ�ȯ�� �������
		BB b = (BB)obj;
		
//		AA a = new C();
//		C c = (C)a; // ==> ����
////		----------------------
//		AA a = new B();
//		B b = (C)a; // ==> �Ұ��� ����Ŭ������ ������ ����Ŭ������ �����ؾ���
//		C c = (B)a; // ==> �Ұ��� ����Ŭ������ ����Ŭ���� ���� �Ұ�
		
		Integer a = 10;  
		Integer bb = new Integer(10);
		
		Number num = new Integer(10);
		System.out.println((Integer)num + 10);
		
	}
}

class D{
	int d;
}
class F{}
class AA{
	int a;
	void funcA() {}
}
class BB extends AA{
	int b;
	public BB(Object o) { // (Object o) �� � ��ü�� �־ �������
		if( o instanceof D) { // o�� D�� �ƴ� �ٸ� Ŭ������ ���� Ÿ�Ժ�ȯ�� �Ұ����ϰ� ����
			D dd = (D)o; // int d;�� �����ϱ� ���� Ÿ�Ժ�ȯ
			dd.d = 10;
		}else if(o instanceof F) {
			F f = (F)o;
		}
	}
}
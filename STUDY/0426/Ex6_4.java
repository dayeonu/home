
public class Ex6_4 {
	
	// �ڹ�������(������) 6-4 ���� 

	public static void main(String[] args) {
//��ȯŸ���� void�̹Ƿ� return���� ����. 
		MyMath mm = new MyMath();
		long result1 = mm.add(5L, 3L);
		long result2 = mm.subtract(5L, 3L);
		long result3 = mm.multply(5L, 3L);
		double result4 = mm.divide(5L, 3L);
		
		System.out.println("add(5L, 3L) = " + result1);
		System.out.println("subtract(5L, 3L) = " + result2);
		System.out.println("multply(5L, 3L) = " + result3);
		System.out.println("divide(5L, 3L) = " + result4);
	}
}

// ��Ģ������ �����ϴ� ���� �Դϴ�. Ŭ���� 
// return�� ��ȯŸ���� void�� �ƴѰ�� �� ��ȯ���� �ִ� ��� �ݵ�� return���� �־�� �Ѵ�. 
class MyMath{
	long add(long a, long b) {
		long result = a + b;	//5L + 3L = 8L
		return result;	//result1 �ڸ��� ���� ���Ե� 
	}
	
	long subtract(long a, long b) {
		return a - b;} //5L - 3L = 2L 
	
	long multply(long a, long b) {
		return a * b;} // 5L * 3L = 15L
	
	double divide(double a, double b) {	// 5L % 3L = 1.666666.....7
		return a / b;
	}
}


public class Ex6_4 {
	
	// 자바의정석(기초편) 6-4 예제 

	public static void main(String[] args) {
//반환타입이 void이므로 return문이 없다. 
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

// 사칙연산을 수행하는 설계 입니다. 클래스 
// return은 반환타입이 void가 아닌경우 즉 반환값이 있는 경우 반드시 return문이 있어야 한다. 
class MyMath{
	long add(long a, long b) {
		long result = a + b;	//5L + 3L = 8L
		return result;	//result1 자리에 값이 들어가게됨 
	}
	
	long subtract(long a, long b) {
		return a - b;} //5L - 3L = 2L 
	
	long multply(long a, long b) {
		return a * b;} // 5L * 3L = 15L
	
	double divide(double a, double b) {	// 5L % 3L = 1.666666.....7
		return a / b;
	}
}

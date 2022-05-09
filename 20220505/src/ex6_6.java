//기본형 매개변수 공부!!! 2022-05-05
class Data { int x; }	 

class ex6_6 {
	
	public static void main(String[] args) {
		Data d = new Data();
		d.x = 10;
		System.out.println("main() : x = " + d.x);

		/*
		 * 기본형 매개변수의 특징! 
		 * "변수의 값을 읽기만 할 수 있다" read only!!
		 */
	
		change(d.x); //체인지 메서드 호출함. 
		System.out.println("After change(d.x)");
		System.out.println("main() : y = " + d.x);
	}

	/*
	 * 매개변수의 이름은 x가 아니라 다른 걸로 해도 된다..
	 * 메서드 문 안에서만 허용하니까.
	 */
	
	 static void change(int d) {  // 기본형 매개변수 change(d.x)가 가지고 있는 값을 복사해 넣는다. 
		d = 1000;
		System.out.println("change() : d = " + d);
	}
}

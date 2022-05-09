//2022-05-06 참조형 반환타입 공부 !!!

class Data3{ int x; }

public class Ex6_8 {
	public static void main(String[] args) {
		Data3 d = new Data3();
		d.x = 10;

		System.out.println("d.x의 값은?" + d.x);
		Data3 d2 = copy(d); // copy 메서드에게 주소값 복사 
		System.out.println("d.x = " + d.x);
		System.out.println("d2.x = " + d2.x);
	}

	static Data3 copy(Data3 d) { // 참조형 매개변수~ 값을 읽거나 수정할 수 있다. 
		Data3 tmp = new Data3();
		tmp.x = d.x; // d.x의 값은 10이다. tmp가 참조하는 x변수에 10을 대입한다. 
		System.out.println("tmp.x의 값은? " + tmp.x);
		return tmp; // tmp의 주소값을 메인 d2에 반환 한다. 
	}
}



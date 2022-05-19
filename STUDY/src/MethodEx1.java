
public class MethodEx1 {

	public static void numbering(Long blank) {
		int i = 0;
		while(i< blank) {
			System.out.println(i);
			i++;
		}
	}
	
	public static void main(String[] args) {

		numbering(4L); 
		//넘버링 메서드의 인자값을4로 줬어,
		//넘버링 메서드엔 지역변수 int blank가 있지
		// 인자값을 받을려고 있는거야.
		//그럼 그 인자값을 받아서 처리하게 돼.
		
		//포인트는, 이 인자값의 자료형태와 지역변수 자료형태가 
		//같아야 한다는 점이야.
		
		}
}

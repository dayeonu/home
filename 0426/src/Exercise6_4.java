
public class Exercise6_4 {

	public static void main(String[] args) {

		student2 s = new student2();
		s.name = "홍길동";
		s.ban= 10;
		
		System.out.println(s.name);
		System.out.println(s.ban);
		System.out.println(s.math);
		s.getAverage();
		
		System.out.println("---------------------");
		student2 s2 = new student2();
		s2.name = "이순신";
		s2.kor=90;
		s2.eng=80;
		s2.math= 90;
		System.out.println(s2.name);
		System.out.println(s2.kor);
		System.out.println(s2.eng);
		System.out.println(s2.math);
		System.out.println("총점:"+s2.getTotal());
//		System.out.println("평점:"+s2.getAverage());
		
		System.out.println("-----------------------");
		student2 s3 = new student2();
		s3 = s; 
		System.out.println(s3.name);
		System.out.println(s3.ban);
		System.out.println(s3.math);
		s.getAverage();
		System.out.println("-----------------------");
	}

}
//private < default < protected < pubilc
//접근 제어자  보안에 관련한...

class student2{
	//변수>> 인스턴스변수, 클래스변수, 지역변수
	
	private String name;
	private int ban;
	private int no;
	private int kor;
	private int eng;
	private int math;
	
	//함수 ---> 인스턴스 메소드, 클래스 메소드
	
	int getTotal() {
		int sum = kor+eng+math;
		return sum;
	}
	
	double gegAverage() {
		return getTotal()/3.0;
	}
	
	void getAverage() {
		System.out.println("getAvergae");
	}
}
public class Ex6_4_sam {

	public static void main(String[] args) {
		
		
		Student2 s= new Student2("손흥민", 1,10,90,100,60);	//생성자 호출  >> 디폴트 생성자
		System.out.println(s.getName());
		System.out.println(s.getTotal());
		

		Student2 s2= new Student2("유다연", 21,9,100,100,100);	//생성자 호출  >> 디폴트 생성자
		System.out.println(s2.getName());
		System.out.println(s2.getTotal());
		
		Student2 s3= new Student2("박상무", 21,9);	//생성자 호출  >> 디폴트 생성자
		System.out.println(s3.getName());
		System.out.println(s3.getTotal());
		
//		s.name = "홍길동";
//		s.ban = 10;
//		
//		System.out.println(s.name);
//		System.out.println(s.ban);
//		System.out.println(s.math);
//		s.getAverage();
//		
//		System.out.println("---------------------");
//		
//		Student2 s2 = new Student2();
//		s2.name = "이순신";
//		s2.kor=90;
//		s2.eng=80;
//		s2.math = 90;
//		System.out.println(s2.name);
//		System.out.println(s2.kor);
//		System.out.println(s2.eng);
//		System.out.println(s2.math);
//		System.out.println("총점 : " + s2.getTotal());
//		System.out.println("평균 : " + s2.getAverage());
//		
//		System.out.println("----------------------");
//		
//		Student2 s3 = new Student2();
//		
//		s3 = s;
//		System.out.println(s3.name);
//		System.out.println(s3.ban);
//		System.out.println(s3.math);
//		s.getAverage();
//		String name = s.getName();
//		s.setName("홍길동");
//		int kor = s.getKor();
//		System.out.println(s.getKor());
//		s.setKor(90);
//		s.getBan();
//		System.out.println("반:"+s.getBan());
//		s.setBan(10);
	}

}

// private < default < protected < public

class Student2{
	//변수>> 인스턴스변수, 클래스변수, 지역변수
	
	private String name;
	private int ban;
	private int no;
	private int kor;
	private int eng;
	private int math;
	
	public Student2(){ // 디플토 생성자는 생성자가 존재하지 않으면 java 컴파일러가 생성해주지만, 생성자가 1개라도 존재하면
		//생성하지 않는다. 필요하면 개발자가 직접 작성 
	}
	
//함수 오버로딩 : 함수이름자체가 중복이 될 수 있다.
	public Student2(String name, int ban, int no, int kor, int eng, int math) {
		this.name=name;
		this.ban=ban;
		this.no=no;
		this.kor=kor;
		this.eng=eng;
		this.math=math;
	}
//함수 오버로딩 : 함수이름자체가 중복이 될 수 있다.
	public Student2(String name, int ban, int no ) {
		this.name=name;
		this.ban=ban;
		this.no=no;
	}
		
//		System.out.println("생성자 호출");
	
	
//----------------하단문장은 소스--게터세터 에서 컴퓨터에서 전부 생성해줄 수 있음---------------	
	int getBan() {
		return ban;
	}
	void setBan(int ban) {	//지역변수
		this.ban = ban;	//같은 이름 충돌나서  this 사용 문장을 벗어나면 stack에서 사라짐 
	}
	String getName() {
		//끄집어 내기. getter setter		
		return name;
	}
	
	//setter
	void setName(String name) { //홍길동이 들어감 
		this.name = name;	// name에 홍길동을 또 집어 넣는다는 뜻 // 자기 자신에게 다시 값을 넣겠다는 뜻, int num = 10 , num= num;
	}
	
	int getKor() {
		return kor;
	}
	
	void setKor(int kor) {
		this.kor =  kor;
		
	}
	//함수 --> 인스턴스메소드, 클래스메소드
	
	int getTotal() {
		int sum = kor+eng+math;
		return sum;
	}
	
	double getAverage() {
		return getTotal()/3.0;
	}
}
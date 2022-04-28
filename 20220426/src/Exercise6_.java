
public class Exercise6_ {

	public static void main(String[] args) {

		Student3 s = new Student3("홍길동", 80, 56, 37, 58, 95);
		//		s.name = "홍길동";
		//		s.ban = 1;
		//		s.no =	1;
		//		s.kor= 100;
		//		s.eng = 60;
		//		s.math = 76;
		////		
		//		System.out.println("이름: "+s.name);
		//		System.out.println("총점: "+s.getTotal());
		//		System.out.println("평균: "+s.getAverage());

		System.out.println(s.info());
		System.out.println(s.toString());
	}
}
class Student3{

	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;

	public Student3() {}	//디폴트 생성자는 반드시 기입
	public Student3(String name, int ban, int no, int kor, int eng, int math) {	//디폴트 생성자는 반드시 기입

		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}	

	String info() {
		return name + "," + ban + "," + no + "," + kor + "," +eng + "," + math;
	}

	int getTotal() {
		return kor+eng+math;
	}
	int getAverage() {
		return (kor+eng+math)/3;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBan() {
		return ban;
	}

	public void setBan(int ban) {
		this.ban = ban;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}


}
//멤버변수를 갖는 Student 클래스를 정의하시오
//Student 클래스에 생성자와 info()를 추가하시오
//결과: 홍길동,1,1,100,60,76,236,78.7


class Student{
	String name; //학생 이름
	int ban, no, kor, eng, math; // 반, 번호, 국어점수, 영어점수, 수학점수 

	Student(String name, int ban, int no, int kor, int eng, int math){ // 기본 생성자 추가
	
		//참조변수 초기화
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
}
public class practice6_1 {
	public static void main(String[] args) {
		
		Student info = new Student("홍길동",1,1,100,60,76);
		
		//	합계, 평균 구하기
		
		}
	}
		
//		String str = s.info();
//		System.out.println(info.name + "," + info.ban +"," + info.no +","+ info.math +","+ (info.kor+info.eng+info.math) +","+ 
//				((info.kor+info.eng+info.math)/3));
//	}


/* 문제 풀이에는
class Student{
	
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;

}


class Student{
	String name; //학생 이름
	int ban, no, kor, eng, math; // 반, 번호, 국어점수, 영어점수, 수학점수 

	Student(String name, int ban, int no, int kor, int eng, int math){ // 기본 생성자 추가
	
		//참조변수 초기화
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	public String info() {
		return name 
					+ "," + ban
					+ "," + no
					+ "," + kor
					+ "," + eng
					+ "," + math
					+ "," + (kor+eng+math)
					+ "," + ((int) ((kor+eng+math) / 3f * 10 + 0.5f) / 10f);
	}
}

public class practice6_1 {
	public static void main(String[] args) {

		Student s = new Student("홍길동",1,1,100,60,76);
	
		String str = s.info();
		System.out.println(str);
	}
}
*/
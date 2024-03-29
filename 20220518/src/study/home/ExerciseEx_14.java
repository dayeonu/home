package study.home;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;
class ExerciseEx_14
{
	static ArrayList record = new ArrayList(); // 성적데이터를 저장할 공간
	static Scanner s = new Scanner(System.in);

	public static void main(String args[]) {
		while(true) {
			switch(displayMenu()) {
			case 1 :
				inputRecord();
				break;
			case 2 :
				displayRecord();
				break;
			case 3 :
				System.out.println("프로그램을 종료합니다."); 
				System.exit(0);
			}
		} // while(true)
	}
	// menu를 보여주는 메서드

	static int displayMenu(){
		System.out.println("**************************************************");
		System.out.println("*                성적 관리 프로그램                    *"); 
		System.out.println("**************************************************");
		System.out.println();
		System.out.println(" 1. 학생성적 입력하기 "); 
		System.out.println();
		System.out.println(" 2. 학생성적 보기 "); 
		System.out.println();
		System.out.println(" 3. 프로그램 종료 "); 
		System.out.println();
		System.out.print(" 원하는 메뉴를 선택하세요.(1~3) : "); 

		int menu = s.nextInt(); //숫자입력받아서 menu에 집어넣음..

		if(menu == 1 || menu == 2 || menu == 3) {
			// 1,2,3 만 입력 받고 
		}else System.out.println("잘못 입력하셨습니다. 다시 입력해주세요."); //나머지는 리턴 
		return menu;

	} // public static int displayMenu(){

	// 데이터를 입력받는 메서드

	static void inputRecord() {
		System.out.println("1.학생성적 입력하기 "); 
		System.out.println(" 이름, 반, 번호, 국어성적, 영어성적, 수학성적'  의 순서로 공백없이 입력하세요.");      
		System.out.println("입력을 마치려면 q를 입력하세요. 메인화면으로 돌아갑니다.");     
		while(true) {
			System.out.println(">>");
			ArrayList score = new ArrayList(); // 제네릭 사용안함. 타입없음 
			try {
				String data = s.next();
				if(data.equalsIgnoreCase("q")) {
					System.out.println("종료합니다.");
					return;
				} else {
					StringTokenizer st = new StringTokenizer(data,",");
					while(st.hasMoreTokens()){
						score.add(st.nextToken());
					}   
					String name = (String)score.get(0); 
					int ban = Integer.parseInt((String)score.get(1));
					int no = Integer.parseInt((String)score.get(2));
					int kor = Integer.parseInt((String)score.get(3));
					int eng = Integer.parseInt((String)score.get(4));
					int math = Integer.parseInt((String)score.get(5)); 
//					int schoolRank = Integer.parseInt((String)score.get(6)); 
//					int classRank = Integer.parseInt((String)score.get(7)); 

					Student student = new Student(name, ban, no, kor, eng, math);
					record.add(student);

				}

			}catch (Exception e) {
				System.out.println("오류");
				continue;
			}
		}//while문 끝
	} // public static void inputRecord() 
	// 데이터 목록을 보여주는 메서드

	static void displayRecord() {
		int koreanTotal = 0;
		int englishTotal = 0;
		int mathTotal = 0;
		int total = 0;
		int length = record.size();
		if(length > 0) {
			System.out.println();
			System.out.println(" 이름 반 번호 국어 영어 수학 총점 평균"); 
			System.out.println("====================================================");
			for (int i = 0; i < length ; i++) {
				Student student = (Student)record.get(i);
				System.out.println(student);
				koreanTotal += student.kor;
				mathTotal += student.math;
				englishTotal += student.eng;
				total += student.total;
			}
			System.out.println("====================================================");
			System.out.println("총점 : "+koreanTotal+" "+englishTotal +" "+mathTotal+" "+total);
			System.out.println();
		} else {
			System.out.println("====================================================");
			System.out.println(" 데이터가 없습니다."); 
			System.out.println("====================================================");
		}
	} // static void displayRecord() {
}

class Student implements Comparable {
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	int total;
//	int schoolRank;
//	int classRank; // 반등수
	Student(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
//		this.schoolRank = schoolRank;
//		this.classRank = classRank;
		total = kor+eng+math;
	}
	int getTotal() {
		return total;
	}
	float getAverage() {
		return (int)((getTotal()/ 3f)*10+0.5)/10f;
	}
	public int compareTo(Object o) {
		if(o instanceof Student) {
			Student tmp = (Student)o;
			return tmp.total - this.total;
		} else {
			return -1;
		}
	}
	public String toString() {
		return name
				+","+ban
				+","+no
				+","+kor
				+","+eng
				+","+math
//				+","+schoolRank
//				+","+classRank
				+","+getTotal()
				+","+getAverage()
				;
	}
} // class Student
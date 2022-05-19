package home.study;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;
class ExerciseEx_14
{
   static ArrayList record = new ArrayList(); // 성적데이터를 저장할 공간
   static Scanner s = new Scanner(System.in);
   
   public static void main(String args[]) {
      while(true) {
         switch(displayMenu()) { // 케이스 1,2,3에 따라서 해당되는 메서드 호출함 
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
      System.out.println("입력을 마치려면 q를 입력하세요");     
          while(true) {
            System.out.println(">>");
            ArrayList score = new ArrayList(); // 제네릭 사용안함. 타입없음 
          
            //예외처리 try-catch 문
            try {
               String data = s.next();	// 사용자에게 입력받은 내용을 String타입 data에게 넘겨줌 
               
  //equalsIgnoreCase : 대소문자 구분없이 문자열 자체만으로 비교해주는 함수이다. 
                 if(data.equalsIgnoreCase("q")) { // 만약, 넘겨준 내용이 Q 또는 q 라면 종료함 
                  System.out.println("종료 후 메인 메뉴로 돌아갑니다.");
                  break;
                  
                 } else {	// 이외의 경우라면, 아래와 같이 
  //StringTokenizer : 사용자가 지정한 구분자로 문자를 나누어줌, trim 같은 기능이랄까 ..
  //StringTokenizer( 자르고 싶은 String , 자르는 기준 문자의 집합) 여기에선 , 쉼표로 구분해주었다. 
  //hasMoreTokens: StringTokenizer 클래스 객체에서 다음에 읽어 들일 token이 있으면 true, 없으면 false를 return한다.
  // StringTokenizer.nextToken() - 다음 Token 받아오기                      	
                     StringTokenizer st = new StringTokenizer(data,",");
                        while(st.hasMoreTokens()){
                        	score.add(st.nextToken());
                       }   
                      
//위 ArrayList 에서 제네릭 사용을 안하는 조건이므로 형변환을 아래와 같이 필수적으로 해야만 한다. 네임빼고는 모두 정수 형태 
 /*ArrayList의 get()는 리스트에서 어떤 객체를 가져오는데 사용되는 메소드입니다.
  1. ArrayList.get()
 	get(int index)은 인자로 인덱스를 받습니다. 이 인덱스의 위치에 있는 객체를 리턴해줍니다. 
 	인덱스 위치는 0부터 시작~ 
 	만약 리스트 크기보다 큰 인덱스를 인자로 전달하면 범위를 넘어섰다는 의미인 IndexOutOfBoundsException예외를 발생시킵니다.
*/  
                        String name = (String)score.get(0); 
                        int ban = Integer.parseInt((String)score.get(1));
                        int no = Integer.parseInt((String)score.get(2));
                        int kor = Integer.parseInt((String)score.get(3));
                        int eng = Integer.parseInt((String)score.get(4));
                        int math = Integer.parseInt((String)score.get(5)); 
                        int schoolRank = Integer.parseInt((String)score.get(6)); 
                        int classRank = Integer.parseInt((String)score.get(7)); 

   //ArrayList.add(E e) : 리스트에 인자로 전달된 객체를 추가합니다.                        
                        Student student = new Student(name, ban, no, kor, eng, math, schoolRank, classRank);
                        record.add(student);
                     } 
            }catch (Exception e) {
            	System.out.println("오류! 띄어쓰기 없이 다시 입력해주세요.");
            	continue;
            }
         } //while문 끝
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
         System.out.println(" 이름 반 번호 국어 영어 수학 총점 평균 전교등수 반등수 "); 
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
         System.out.println("총점 : "+koreanTotal+" "+englishTotal 
               +" "+mathTotal+" "+total);
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
      int schoolRank;
      int classRank; // 반등수
      Student(String name, int ban, int no, int kor, int eng, int math, int schoolRank, int classRank) {
         this.name = name;
         this.ban = ban;
         this.no = no;
         this.kor = kor;
         this.eng = eng;
         this.math = math;
         this.schoolRank = schoolRank;
         this.classRank = classRank;
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
               +","+getTotal()
               +","+getAverage()
               +","+schoolRank
               +","+classRank
               ;
      }
   } // class Student
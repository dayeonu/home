package home.study;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;
class ExerciseEx_14
{
   static ArrayList record = new ArrayList(); // ���������͸� ������ ����
   static Scanner s = new Scanner(System.in);
   
   public static void main(String args[]) {
      while(true) {
         switch(displayMenu()) { // ���̽� 1,2,3�� ���� �ش�Ǵ� �޼��� ȣ���� 
	         case 1 :
	            inputRecord();
	            break;
	         case 2 :
	            displayRecord();
	            break;
	         case 3 :
	            System.out.println("���α׷��� �����մϴ�."); 
	            System.exit(0);
         }
      } // while(true)
   }
   // menu�� �����ִ� �޼���
   
   static int displayMenu(){
      System.out.println("**************************************************");
      System.out.println("*                ���� ���� ���α׷�                    *"); 
      System.out.println("**************************************************");
      System.out.println();
      System.out.println(" 1. �л����� �Է��ϱ� "); 
      System.out.println();
      System.out.println(" 2. �л����� ���� "); 
      System.out.println();
      System.out.println(" 3. ���α׷� ���� "); 
      System.out.println();
      System.out.print(" ���ϴ� �޴��� �����ϼ���.(1~3) : "); 
      
      int menu = s.nextInt(); //�����Է¹޾Ƽ� menu�� �������..
      
      if(menu == 1 || menu == 2 || menu == 3) {
         // 1,2,3 �� �Է� �ް� 
      }else System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���."); //�������� ���� 
      return menu;

   } // public static int displayMenu(){

   // �����͸� �Է¹޴� �޼���

   static void inputRecord() {
      System.out.println("1.�л����� �Է��ϱ� "); 
      System.out.println(" �̸�, ��, ��ȣ, �����, �����, ���м���'  �� ������ ������� �Է��ϼ���.");      
      System.out.println("�Է��� ��ġ���� q�� �Է��ϼ���");     
          while(true) {
            System.out.println(">>");
            ArrayList score = new ArrayList(); // ���׸� ������. Ÿ�Ծ��� 
          
            //����ó�� try-catch ��
            try {
               String data = s.next();	// ����ڿ��� �Է¹��� ������ StringŸ�� data���� �Ѱ��� 
               
  //equalsIgnoreCase : ��ҹ��� ���о��� ���ڿ� ��ü������ �����ִ� �Լ��̴�. 
                 if(data.equalsIgnoreCase("q")) { // ����, �Ѱ��� ������ Q �Ǵ� q ��� ������ 
                  System.out.println("���� �� ���� �޴��� ���ư��ϴ�.");
                  break;
                  
                 } else {	// �̿��� �����, �Ʒ��� ���� 
  //StringTokenizer : ����ڰ� ������ �����ڷ� ���ڸ� ��������, trim ���� ����̶��� ..
  //StringTokenizer( �ڸ��� ���� String , �ڸ��� ���� ������ ����) ���⿡�� , ��ǥ�� �������־���. 
  //hasMoreTokens: StringTokenizer Ŭ���� ��ü���� ������ �о� ���� token�� ������ true, ������ false�� return�Ѵ�.
  // StringTokenizer.nextToken() - ���� Token �޾ƿ���                      	
                     StringTokenizer st = new StringTokenizer(data,",");
                        while(st.hasMoreTokens()){
                        	score.add(st.nextToken());
                       }   
                      
//�� ArrayList ���� ���׸� ����� ���ϴ� �����̹Ƿ� ����ȯ�� �Ʒ��� ���� �ʼ������� �ؾ߸� �Ѵ�. ���ӻ���� ��� ���� ���� 
 /*ArrayList�� get()�� ����Ʈ���� � ��ü�� �������µ� ���Ǵ� �޼ҵ��Դϴ�.
  1. ArrayList.get()
 	get(int index)�� ���ڷ� �ε����� �޽��ϴ�. �� �ε����� ��ġ�� �ִ� ��ü�� �������ݴϴ�. 
 	�ε��� ��ġ�� 0���� ����~ 
 	���� ����Ʈ ũ�⺸�� ū �ε����� ���ڷ� �����ϸ� ������ �Ѿ�ٴ� �ǹ��� IndexOutOfBoundsException���ܸ� �߻���ŵ�ϴ�.
*/  
                        String name = (String)score.get(0); 
                        int ban = Integer.parseInt((String)score.get(1));
                        int no = Integer.parseInt((String)score.get(2));
                        int kor = Integer.parseInt((String)score.get(3));
                        int eng = Integer.parseInt((String)score.get(4));
                        int math = Integer.parseInt((String)score.get(5)); 
                        int schoolRank = Integer.parseInt((String)score.get(6)); 
                        int classRank = Integer.parseInt((String)score.get(7)); 

   //ArrayList.add(E e) : ����Ʈ�� ���ڷ� ���޵� ��ü�� �߰��մϴ�.                        
                        Student student = new Student(name, ban, no, kor, eng, math, schoolRank, classRank);
                        record.add(student);
                     } 
            }catch (Exception e) {
            	System.out.println("����! ���� ���� �ٽ� �Է����ּ���.");
            	continue;
            }
         } //while�� ��
   } // public static void inputRecord() 
// ������ ����� �����ִ� �޼���

   static void displayRecord() {
      int koreanTotal = 0;
      int englishTotal = 0;
      int mathTotal = 0;
      int total = 0;
      int length = record.size();
      if(length > 0) {
         System.out.println();
         System.out.println(" �̸� �� ��ȣ ���� ���� ���� ���� ��� ������� �ݵ�� "); 
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
         System.out.println("���� : "+koreanTotal+" "+englishTotal 
               +" "+mathTotal+" "+total);
         System.out.println();
      } else {
         System.out.println("====================================================");
         System.out.println(" �����Ͱ� �����ϴ�."); 
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
      int classRank; // �ݵ��
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
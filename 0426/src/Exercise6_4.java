
public class Exercise6_4 {

	public static void main(String[] args) {

		student2 s = new student2();
		s.name = "ȫ�浿";
		s.ban= 10;
		
		System.out.println(s.name);
		System.out.println(s.ban);
		System.out.println(s.math);
		s.getAverage();
		
		System.out.println("---------------------");
		student2 s2 = new student2();
		s2.name = "�̼���";
		s2.kor=90;
		s2.eng=80;
		s2.math= 90;
		System.out.println(s2.name);
		System.out.println(s2.kor);
		System.out.println(s2.eng);
		System.out.println(s2.math);
		System.out.println("����:"+s2.getTotal());
//		System.out.println("����:"+s2.getAverage());
		
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
//���� ������  ���ȿ� ������...

class student2{
	//����>> �ν��Ͻ�����, Ŭ��������, ��������
	
	private String name;
	private int ban;
	private int no;
	private int kor;
	private int eng;
	private int math;
	
	//�Լ� ---> �ν��Ͻ� �޼ҵ�, Ŭ���� �޼ҵ�
	
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
public class Ex6_4_sam {

	public static void main(String[] args) {
		
		
		Student2 s= new Student2("�����", 1,10,90,100,60);	//������ ȣ��  >> ����Ʈ ������
		System.out.println(s.getName());
		System.out.println(s.getTotal());
		

		Student2 s2= new Student2("���ٿ�", 21,9,100,100,100);	//������ ȣ��  >> ����Ʈ ������
		System.out.println(s2.getName());
		System.out.println(s2.getTotal());
		
		Student2 s3= new Student2("�ڻ�", 21,9);	//������ ȣ��  >> ����Ʈ ������
		System.out.println(s3.getName());
		System.out.println(s3.getTotal());
		
//		s.name = "ȫ�浿";
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
//		s2.name = "�̼���";
//		s2.kor=90;
//		s2.eng=80;
//		s2.math = 90;
//		System.out.println(s2.name);
//		System.out.println(s2.kor);
//		System.out.println(s2.eng);
//		System.out.println(s2.math);
//		System.out.println("���� : " + s2.getTotal());
//		System.out.println("��� : " + s2.getAverage());
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
//		s.setName("ȫ�浿");
//		int kor = s.getKor();
//		System.out.println(s.getKor());
//		s.setKor(90);
//		s.getBan();
//		System.out.println("��:"+s.getBan());
//		s.setBan(10);
	}

}

// private < default < protected < public

class Student2{
	//����>> �ν��Ͻ�����, Ŭ��������, ��������
	
	private String name;
	private int ban;
	private int no;
	private int kor;
	private int eng;
	private int math;
	
	public Student2(){ // ������ �����ڴ� �����ڰ� �������� ������ java �����Ϸ��� ������������, �����ڰ� 1���� �����ϸ�
		//�������� �ʴ´�. �ʿ��ϸ� �����ڰ� ���� �ۼ� 
	}
	
//�Լ� �����ε� : �Լ��̸���ü�� �ߺ��� �� �� �ִ�.
	public Student2(String name, int ban, int no, int kor, int eng, int math) {
		this.name=name;
		this.ban=ban;
		this.no=no;
		this.kor=kor;
		this.eng=eng;
		this.math=math;
	}
//�Լ� �����ε� : �Լ��̸���ü�� �ߺ��� �� �� �ִ�.
	public Student2(String name, int ban, int no ) {
		this.name=name;
		this.ban=ban;
		this.no=no;
	}
		
//		System.out.println("������ ȣ��");
	
	
//----------------�ϴܹ����� �ҽ�--���ͼ��� ���� ��ǻ�Ϳ��� ���� �������� �� ����---------------	
	int getBan() {
		return ban;
	}
	void setBan(int ban) {	//��������
		this.ban = ban;	//���� �̸� �浹����  this ��� ������ ����� stack���� ����� 
	}
	String getName() {
		//������ ����. getter setter		
		return name;
	}
	
	//setter
	void setName(String name) { //ȫ�浿�� �� 
		this.name = name;	// name�� ȫ�浿�� �� ���� �ִ´ٴ� �� // �ڱ� �ڽſ��� �ٽ� ���� �ְڴٴ� ��, int num = 10 , num= num;
	}
	
	int getKor() {
		return kor;
	}
	
	void setKor(int kor) {
		this.kor =  kor;
		
	}
	//�Լ� --> �ν��Ͻ��޼ҵ�, Ŭ�����޼ҵ�
	
	int getTotal() {
		int sum = kor+eng+math;
		return sum;
	}
	
	double getAverage() {
		return getTotal()/3.0;
	}
}
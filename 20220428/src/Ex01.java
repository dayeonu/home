public class Ex01 {
	public static void main(String[] args) {
		animal an = new animal();	//����Ŭ������������� -- ������ �Դ´�
		animal an2 = new Mammal();	// �������� �Դ´�// ����,  MammalŬ������ �޼��� eat�� eat1�� �����ϸ� �� ���� �����ϴ� animalŬ������ eat�޼��带 ������
		animal an3 = new Person();	// ���� 	// ����, �޼��� play�� play1���� �����ϸ� �� ���� �����ϴ� animalŬ������ play�޼��带 ������
		animal an4 = new Birds();	// ���� �Դ´�
		
		//�����ϴ� ����� �������µ�, ���� ���� �ִ� �κк��� �����´�. 
		an.eat();	// ������ �Դ´� ȣ���. 
		an2.eat();
		an3.play();
		an4.eat();
		System.out.println("--------------");
		
		//����ȯ Ÿ�� ��ġ ��Ų��. �׷��� �ҷ��� �� ���� 
		Person p = (Person)an3;
		p.eat();
		p.play();
		p.run();
		System.out.println("--------------");
	
		//����ȯ Ÿ�� ��ġ ��Ų��. �׷��� �ҷ��� �� ���� 
		Mammal m = (Mammal)an3;
		m.eat();	//�������� �Դ´� 
		m.play(); // MammalŬ���� ��ü���� play�޼��尡 ����. 
				  //Ŭ����animal�� play�޼ҵ带 �����Ͽ�,  ������ ��� �־�䰡  ��µȴ�
		
		animal animal = new Penguin();
		 if(animal instanceof Birds) {	//����--> ���� �� ��� �������� �����ִ� ���, 
			 Birds birds = (Birds)animal;
		 	System.out.println(1);
		 	}
		 else if(animal instanceof Mammal ) { // ����--> ������ �� ��� �������� �����ִ� ���,
			 Mammal mammal = (Mammal)animal;
			 System.out.println(0);
		 }
				 //		if(animal instanceof Birds)	// ���� �ϴ� �� , ���������� ����ȯ �ϰڴٴ� �ǹ�.
//				System.out.println(1);
//			else if(animal instanceof Mammal )
//				System.out.println(0);
	}
}
//���� Ŭ������ animal �� �ǰڴ�. 
class animal{ //���� 
	
	void eat() {
		System.out.println("������ �Դ´�");
		}
	void play() {
		System.out.println("������ ��� �־��");
		}
}
// ���� Ŭ������ �޼ҵ� �� ���� ����  eat, play 2���� �̴�. 
// ���� Ŭ������ �޸� �޼ҵ��� �̸��� ����Ŭ������ ��ġ���� ������ ��ӵ��� ���Ͽ� ȣ���� ��������. ȣ��Ǿ����� ���Ѵ�. 
// animal--mammal--whale--Person �� ����  ��,���� Ŭ�����鳢�� ��Ӱ��迡 �ִٴ°��� ��������.

		//@override 
		class Mammal extends animal{ //������
			void eat() {
				System.out.println("�������� �Դ´�");
		}
//			void play() {
//				System.out.println("�������� ��ƿ�");
//			}
		}
		class Whale extends Mammal{	//��
			void eat() {
				System.out.println("���� �Դ´�");
			}
		}
		class Person extends Mammal{ //���
//			void play() {
//				System.out.println("����� ��ƿ�");
//			}
			void eat() {
				System.out.println("����� �Դ´�");
			}
			void run() {
				System.out.println("�پ�!!");
			}
		}
		class Birds extends Mammal{ //��
			void eat() {
				System.out.println("���� �Դ´�");
			}
		}
		class Penguin extends Birds{ //���
			void eat() {
				System.out.println("����� �Դ´�");
			}
			void play() {
				System.out.println("����� ���");
			}
		}
		
		class Sparrow extends Birds{ //����
			void eat() {
				System.out.println("������ �Դ´�");
			}
		}
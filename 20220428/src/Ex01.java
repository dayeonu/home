public class Ex01 {
	public static void main(String[] args) {
		animal an = new animal();	//상위클래스내용출력중 -- 동물이 먹는다
		animal an2 = new Mammal();	// 포유류가 먹는다// 만약,  Mammal클래서의 메서드 eat을 eat1로 변경하면 그 위에 참조하는 animal클래스의 eat메서드를 참조함
		animal an3 = new Person();	// 놀자 	// 만약, 메서드 play를 play1으로 변경하면 그 위에 참조하는 animal클래서의 play메서드를 참조함
		animal an4 = new Birds();	// 새가 먹는다
		
		//참조하는 대상을 가져오는데, 제일 먼저 있는 부분부터 가져온다. 
		an.eat();	// 동물이 먹는다 호출됨. 
		an2.eat();
		an3.play();
		an4.eat();
		System.out.println("--------------");
		
		//형변환 타입 일치 시킨다. 그러면 불러올 수 있음 
		Person p = (Person)an3;
		p.eat();
		p.play();
		p.run();
		System.out.println("--------------");
	
		//형변환 타입 일치 시킨다. 그러면 불러올 수 있음 
		Mammal m = (Mammal)an3;
		m.eat();	//포유류가 먹는다 
		m.play(); // Mammal클래스 자체에는 play메서드가 없다. 
				  //클래스animal의 play메소드를 참조하여,  동물이 놀고 있어요가  출력된다
		
		animal animal = new Penguin();
		 if(animal instanceof Birds) {	//동물--> 조류 의 상속 개념으로 속해있는 경우, 
			 Birds birds = (Birds)animal;
		 	System.out.println(1);
		 	}
		 else if(animal instanceof Mammal ) { // 동물--> 포유류 의 상속 개념으로 속해있는 경우,
			 Mammal mammal = (Mammal)animal;
			 System.out.println(0);
		 }
				 //		if(animal instanceof Birds)	// 검증 하는 중 , 문제없으면 형변환 하겠다는 의미.
//				System.out.println(1);
//			else if(animal instanceof Mammal )
//				System.out.println(0);
	}
}
//상위 클래스인 animal 이 되겠다. 
class animal{ //동물 
	
	void eat() {
		System.out.println("동물이 먹는다");
		}
	void play() {
		System.out.println("동물이 놀고 있어요");
		}
}
// 상위 클래스의 메소드 가 위와 같이  eat, play 2가지 이다. 
// 하위 클래스에 달린 메소드의 이름이 상위클래스와 일치하지 않으면 상속되지 못하여 호출이 끊어진다. 호출되어지지 못한다. 
// animal--mammal--whale--Person 과 같이  상,하위 클래스들끼리 상속관계에 있다는것을 잊지말것.

		//@override 
		class Mammal extends animal{ //포유류
			void eat() {
				System.out.println("포유류가 먹는다");
		}
//			void play() {
//				System.out.println("포유류가 놀아요");
//			}
		}
		class Whale extends Mammal{	//고래
			void eat() {
				System.out.println("고래가 먹는다");
			}
		}
		class Person extends Mammal{ //사람
//			void play() {
//				System.out.println("사람이 놀아요");
//			}
			void eat() {
				System.out.println("사람이 먹는다");
			}
			void run() {
				System.out.println("뛰어!!");
			}
		}
		class Birds extends Mammal{ //새
			void eat() {
				System.out.println("새가 먹는다");
			}
		}
		class Penguin extends Birds{ //펭귄
			void eat() {
				System.out.println("펭귄이 먹는다");
			}
			void play() {
				System.out.println("펭귄이 논다");
			}
		}
		
		class Sparrow extends Birds{ //참새
			void eat() {
				System.out.println("참새가 먹는다");
			}
		}
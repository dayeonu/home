package Ex;

import java.awt.Point;

public class Ex7_22 {
	

	public static void main(String[] args) {

		Shape s = new Circle();
		Shape s2 = new Circle(new Point(10,10),5);
		Shape s3 = new Circle(5);
		
		System.out.println(s.calcArea());
	}
}

abstract class Shape {

	Point p;

	Shape() {
		this(new Point(0,0));
	}
	Shape(Point p) {
		this.p = p;
	}
	abstract double calcArea(); // 도형의 면적을 계산해서 반환하는 메서드
	Point getPosition() {
		return p;
	}
	void setPosition(Point p) {
		this.p = p;
	}
//	@override
	double calcArea() {
		return Math.PI * r * r;
}
		
		class Point {
			int x;
			int y;
			Point() {
				this(0,0);
			}
			Point(int x, int y) {
				this.x=x;
				this.y=y;
			}
		}
	

class Circle extends Shape{
	double r;
	public Circle() {} 	//생성자 호출 
	public Circle(double r) {//생성자 호출 
		this.r = r;
	} 	
	public Circle(Point p, double r) {//생성자 호출 
		super(p);
	} 	
	
	public Circle(point p, double r) { //생성자 호출
		super(p);
		this.r =r;
	}
	
//	@Override
	double calcArea() { //생성자 호출 
		return 0;
	}
}
class Rectangel extends Shape{
	double width; ;	//폭
	double height;	//높이

//	@Override
	double calcArea
	boolean isSquare () {  
		return true;
	} 
}	
 
	public String toString() {
		return "["+x+","+y+"]";
	}
}
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
	abstract double calcArea(); // ������ ������ ����ؼ� ��ȯ�ϴ� �޼���
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
	public Circle() {} 	//������ ȣ�� 
	public Circle(double r) {//������ ȣ�� 
		this.r = r;
	} 	
	public Circle(Point p, double r) {//������ ȣ�� 
		super(p);
	} 	
	
	public Circle(point p, double r) { //������ ȣ��
		super(p);
		this.r =r;
	}
	
//	@Override
	double calcArea() { //������ ȣ�� 
		return 0;
	}
}
class Rectangel extends Shape{
	double width; ;	//��
	double height;	//����

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
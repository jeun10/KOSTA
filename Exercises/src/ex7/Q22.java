package ex7;

abstract class Shape {
	Point p;

	public Shape() {
		this(new Point(0, 0));
	}

	public Shape(Point p) {
		this.p = p;
	}

	public abstract double calcArea(); // 도형의 면적을 계산해서 반환하는 메서드

	Point getPosition() {
		return p;
	}

	void setPosition(Point p) {
		this.p = p;
	}
}

class Point {
	int x;
	int y;

	public Point() {
		this(0, 0);
	}

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public String toString() {
		return "[" + x + "," + y + "]";
	}
}

class Circle extends Shape{
	double r ;
	
	public Circle() {}
	public Circle(int x, int y, double r){
		super(new Point(x,y));
		this.r=r;
	}
	public Circle(double r){
		this.r= r;
	}
	
	public Circle(Point p, double r) {
		super(p);
		this.r=r;
	}
	
	@Override
	public double calcArea( ) {
		
		return (Math.PI*r*r);
	}
	
}

class Rectangle extends Shape{
	int width, height;
	
	public Rectangle() {}
	
	public Rectangle(int x, int y, int width, int height) {
		super(new Point(x,y));
		this.width = width;
		this.height = height;
	}
	
	public Rectangle(Point p, int width, int height) {
	
		super(p);
		this.width = width;
		this.height = height;
	}
	
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	@Override
	public double calcArea() {
		// TODO Auto-generated method stub
		return width*height;
	}
	
	public boolean isSquare() {
//		boolean result =false;
//		if(width==height) {
//			result=true;
//		}
		
		return width==height;
		
	}
}

public class Q22 {
	static public void main(String[] args) {
		Circle circle = new Circle(5,5,10);
		Rectangle rectangle = new Rectangle(3,4,20,10);
		System.out.println(circle.calcArea());
		System.out.println(rectangle.calcArea());
		System.out.println(rectangle.isSquare());
	}
}

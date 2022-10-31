package _06_class_.practice02.p23;

public class Practice {

	/*
	(1) sumArea . 메서드를 작성하시오
	*/
	
	private static Double sumArea(Shape[] arr) {
		double sum = 0;
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i].calcArea();
		}
		
		return sum;
	}
	
	
	public static void main(String[] args)
	{
	Shape[] arr = {new Circle(5.0), new Rectangle(3,4), new Circle(1)};
	System.out.println(" :"+sumArea(arr));
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

class Circle extends Shape {
	double r;
	
	public Circle(double r) {
		this.r = r;
	}

	@Override
	double calcArea() {
		return r * r * Math.PI;
	}
}

class Rectangle extends Shape {
	double width;
	double height;
	
	public Rectangle(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}

	boolean isSquare(){
		return false;
	}
	
	@Override
	double calcArea() {
		return width * height;
	}
	
}

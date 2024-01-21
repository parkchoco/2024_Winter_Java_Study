package project_03;

/*
public class Circle {
	int radius;
	String name;
	
	public Circle() {
		radius = 1;
		name = "";
	}
	
	public Circle(int r, String n) {
		radius = r;
		name = n;
	}
	
	public double getArea() {
		return radius * radius * 3.14;
	}
	
	public static void main(String[] args) {
		Circle pizza = new Circle(10, "자바피자");
		
		double area = pizza.getArea();
		
		System.out.println(pizza.name + "의 면적은 " + area);
		
		Circle donut = new Circle();
		donut.name = "도넛피자";
		area = donut.getArea();
		
		System.out.println(donut.name + "의 면적은 " + area);
	}
}
*/

public class Circle{
	int radius;
	String name;
	
	public Circle() {
		radius = 1;
		name = "";
	}
	
	public Circle(int r, String n) {
		radius = r;
		name = n;
	}
	
	public double getArea() {
		return radius * radius * 3.14;
	}
	
	public static void main(String args[]) {
		Circle pizza = new Circle(10, "자바피자");
		
		double area = pizza.getArea();
		
		System.out.println(pizza.name + "의 반지름은 " + pizza.radius + "이고 넓이는 " + area);
		
		Circle donut = new Circle();
		donut.name = "자바도넛";
		
		area = donut.getArea();
		System.out.println(donut.name + "의 반지름은 " + donut.radius + "이고 넓이는 " + area);
	}
}
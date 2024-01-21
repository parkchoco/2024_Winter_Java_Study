package project_01;
/*
public class Circle {
	
	int radius;
	String name;
	
	public Circle() {
		
	}
	
	public double getArea() {
		return 3.14*radius*radius;
	}
	
	public static void main(String[] args) {
		Circle pizza = new Circle();
		pizza.radius = 10;
		pizza.name = "자바피자";
		double pizzaArea = pizza.getArea();
		System.out.println("자바피자의 면적은 " + pizzaArea);
		
		Circle donut = new Circle();
		donut.radius = 2;
		donut.name = "자바도넛";
		double donutArea = donut.getArea();
		System.out.println("자바도넛의 면적은 " + donutArea);
		
		
		
		
	}
}
*/

public class Circle{
	int radius;
	String name;
	
	public Circle() {}
	
	public double getArea() {
		return radius * radius * 3.14;
	}
	public static void main(String args[]) {
		Circle pizza = new Circle();
		
		pizza.radius = 10;
		pizza.name = "자바피자";
		
		double area = pizza.getArea();
		System.out.println(pizza.name + "의 반지름은 " + pizza.radius + "이고 넓이는 " + area);
		
		Circle donut = new Circle();
		donut.radius = 2;
		donut.name = "자바도넛";
		area = donut.getArea();
		System.out.println(donut.name + "의 반지름은 " + donut.radius + "이고 넓이는 " + area);
	}
}
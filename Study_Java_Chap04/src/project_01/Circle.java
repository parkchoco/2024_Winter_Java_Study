package project_01;

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

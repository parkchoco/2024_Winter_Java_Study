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
		pizza.name = "�ڹ�����";
		double pizzaArea = pizza.getArea();
		System.out.println("�ڹ������� ������ " + pizzaArea);
		
		Circle donut = new Circle();
		donut.radius = 2;
		donut.name = "�ڹٵ���";
		double donutArea = donut.getArea();
		System.out.println("�ڹٵ����� ������ " + donutArea);
		
		
		
		
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
		pizza.name = "�ڹ�����";
		
		double area = pizza.getArea();
		System.out.println(pizza.name + "�� �������� " + pizza.radius + "�̰� ���̴� " + area);
		
		Circle donut = new Circle();
		donut.radius = 2;
		donut.name = "�ڹٵ���";
		area = donut.getArea();
		System.out.println(donut.name + "�� �������� " + donut.radius + "�̰� ���̴� " + area);
	}
}
package project_06;

class Circle {
	int radius;
	
	public Circle(int radius) {
		this.radius = radius;
	}
	
	public double getArea() {
		return radius * radius * 3.14;
	}
}

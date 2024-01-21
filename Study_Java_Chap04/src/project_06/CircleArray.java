package project_06;

/*
public class CircleArray {
	public static void main(String[] args) {
		Circle c[] = new Circle[5];
		
		for(int i=0;i<c.length;i++) {
			c[i] = new Circle(i);
		}
		
		for(int i=0;i<c.length;i++) {
			System.out.println(c[i].getArea() + " ");
		}
	}
}
*/

public class CircleArray{
	public static void main(String[] args) {
		Circle c[] = new Circle[5];
		
		for(int i=0;i<c.length;i++) {
			c[i] = new Circle(i);
		}
		
		for(int i=0;i<5;i++) {
			System.out.println(c[i].getArea());
		}
	}
}
package exercise_05;

import java.util.Scanner;

public class CircleManager {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Circle c[] = new Circle[3];
		for(int i=0;i<c.length;i++) {
			System.out.print("x, y, radius >>");
			double x = input.nextDouble();
			double y = input.nextDouble();
			int radius = input.nextInt();
			c[i] = new Circle(x, y, radius);
		}
		
		for(int i=0;i<c.length;i++) {
			c[i].show();
		}
		input.close();
	}
}

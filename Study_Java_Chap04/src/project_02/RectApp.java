package project_02;
/*
import java.util.Scanner;

class Rectangle {
	int width;
	int height;
	
	public int getArea() {
		return width*height;
	}
}

public class RectApp {
	public static void main(String[] args) {
		Rectangle rect = new Rectangle();
		Scanner input = new Scanner(System.in);
		
		System.out.print(">>");
		rect.width = input.nextInt();
		rect.height = input.nextInt();
		System.out.println("사각형의 면적은 " + rect.getArea());
		
		input.close();
	}
}
*/

import java.util.Scanner;

class Rectangle {
	int width;
	int height;
	public int getArea() {
		return width * height;
	}
}

public class RectApp {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		Rectangle rect = new Rectangle();
		
		System.out.print(">> ");
		rect.width = input.nextInt();
		rect.height = input.nextInt();
		int area = rect.getArea();
		System.out.println("사각형의 면적은 " + area);
		input.close();
	}
}
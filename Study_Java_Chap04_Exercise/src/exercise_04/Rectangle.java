package exercise_04;

public class Rectangle {
	int x, y, width, height;
	
	public Rectangle(int x, int y, int width, int height){
		this.x=x;
		this.y=y;
		this.width = width;
		this.height = height;
	}
	
	int square() {
		return width * height;
	}
	
	void show() {
		System.out.println("(" + x + "," + y + ")에서 크기가 " + width + "x" + height +"인 사각형");
	}
	
	boolean contains(Rectangle r) {
			return true;
	}
	
}

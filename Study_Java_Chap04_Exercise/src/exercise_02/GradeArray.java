package exercise_02;

import java.util.Scanner;

public class GradeArray {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("����, ����, ���� ������ 3���� ���� �Է�>> ");
		int math = input.nextInt();
		int science = input.nextInt();
		int english = input.nextInt();
		
		Grade me = new Grade(math, science, english);
		
		System.out.println("����� " + me.average());
		input.close();
	}
}

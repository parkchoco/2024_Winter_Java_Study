package chap02;

import java.util.Scanner;

public class Project_05 {
	public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("���� �Է��Ͻÿ�: ");
		int number = input.nextInt();
		
		if(number%3==0) {
			System.out.println("3�� ����Դϴ�.");
		}
		else {
			System.out.println("3�� ����� �ƴմϴ�.");
		}
		
		input.close();
	}
}
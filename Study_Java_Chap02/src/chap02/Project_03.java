package chap02;

import java.util.Scanner;

public class Project_03 {
	public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("������ �Է��ϼ���: ");
		int number = input.nextInt();
		
		int sec = number%60;
		int min = (number/60)%60;
		int hour = number/(60*60);
		
		
		System.out.println(number+"�ʴ� " + hour + "�ð�, "  + min + "��, " + sec + "�� �Դϴ�.");
		
		input.close();
	}
}
package chap02;

import java.util.Scanner;

public class Project_03 {
	public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("정수를 입력하세요: ");
		int number = input.nextInt();
		
		int sec = number%60;
		int min = (number/60)%60;
		int hour = number/(60*60);
		
		
		System.out.println(number+"초는 " + hour + "시간, "  + min + "분, " + sec + "초 입니다.");
		
		input.close();
	}
}
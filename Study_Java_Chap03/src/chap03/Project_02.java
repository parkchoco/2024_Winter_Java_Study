package chap03;

import java.util.Scanner;

public class Project_02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int count=0, sum = 0;
		
		System.out.println("정수를 입력하고 마지막에 -1을 입력하세요.");
		
		int num = input.nextInt();
		
		while(num != -1) {
			count++;
			sum += num;
			num = input.nextInt();
		}
		if(count == 0) {
			System.out.println("입력된 수가 없습니다.");
		}
		else {
		System.out.println("정수의 개수는 " + count + "개이며 평균은 " + (double)sum/count + "입니다.");
		}
		input.close();
	}

}

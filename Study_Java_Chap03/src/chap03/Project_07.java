package chap03;

import java.util.Scanner;

public class Project_07 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int sum=0;
		int num[] = new int[5];
		
		System.out.print(num.length + "���� ������ �Է��ϼ���>> ");
		
		for(int i = 0;i<num.length;i++) {
			num[i]=input.nextInt();
			sum+=num[i];
		}
		
		System.out.println("����� " + (double)sum/num.length);
		
		input.close();
	}
}
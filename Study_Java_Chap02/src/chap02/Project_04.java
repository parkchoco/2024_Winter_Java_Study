package chap02;

import java.util.Scanner;

public class Project_04 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("������ �Է��Ͻÿ�: ");
		int score = input.nextInt();
		
		if(score>=90) {
			System.out.println("�����մϴ�! �հ��Դϴ�!");
		}
		else {
			System.out.println("�˼��մϴ�. ���հ��Դϴ�.");
		}
		
		input.close();
	}

}
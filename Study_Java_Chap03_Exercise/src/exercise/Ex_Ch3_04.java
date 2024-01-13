package exercise;

import java.util.Scanner;

public class Ex_Ch3_04 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("소문자 알파벳 하나를 입력하시오>>");
		String s = input.next();
		char c = s.charAt(0);
		
		for(int i=0;i<=(c-'a');i++) {
			for(int j=(c-'a'-i);j>=0;j--) {
				System.out.print((char)(c - j - i));
			}
			System.out.println();
		}
		
		input.close();
	}
}

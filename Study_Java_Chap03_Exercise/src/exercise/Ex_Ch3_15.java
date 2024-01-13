package exercise;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Ex_Ch3_15 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n=0;
		int m=0;
		
		System.out.print("곱하고자 하는 두 수 입력>>");
		for(int i=0;i<1;i++) {
			try {
				n = input.nextInt();
				m = input.nextInt();
			}
			catch(InputMismatchException e) {
				System.out.println("실수는 입력하면 안됩니다.");
				input.nextLine();
				i--;
				continue;
			}
		}
		System.out.print(n + "x" + m + "=" + n*m);
		
		input.close();
	}
}

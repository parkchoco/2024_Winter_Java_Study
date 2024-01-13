<<<<<<< HEAD
package chap03;

import java.util.Scanner;

public class Project_05{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		int sum = 0;
		System.out.println("정수를 5개 입력하세요");
		
		for(int i = 0;i < 5;i++){
			int num = input.nextInt();
			if(num>0){
				sum+=num;
			}
			else{
				continue;
			}
		}
		System.out.println("양수의 합은 " + sum);
		input.close();
	}
}
=======
package chap03;

import java.util.Scanner;

public class Project_05{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		int sum = 0;
		System.out.println("정수를 5개 입력하세요");
		
		for(int i = 0;i < 5;i++){
			int num = input.nextInt();
			if(num>0){
				sum+=num;
			}
			else{
				continue;
			}
		}
		System.out.println("양수의 합은 " + sum);
		input.close();
	}
}
>>>>>>> refs/remotes/origin/main

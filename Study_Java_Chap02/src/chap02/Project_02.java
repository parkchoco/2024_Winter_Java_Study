package chap02;

import java.util.Scanner;

public class Project_02 {

	public static void main(String[] args) {
		System.out.println("이름, 도시, 나이, 체중, 독신 여부를 빈칸으로 분리하여 입력하세요.");
		Scanner input = new Scanner(System.in);
		
		String name = input.next();
		System.out.print("이름은 "+ name);
		
		String city = input.next();
		System.out.print(", 도시는 " + city);
		
		int age = input.nextInt();
		System.out.print(", 나이는 " + age);
		
		double weight = input.nextDouble();
		System.out.print(", 체중은 " + weight);
		
		boolean isSingle = input.nextBoolean();
		System.out.print(", 독신 여부는 " + isSingle + "입니다.");
		
		input.close();
		
	}

}

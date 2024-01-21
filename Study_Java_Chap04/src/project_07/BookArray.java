package project_07;
/*
import java.util.Scanner;

public class BookArray {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Book book[] = new Book[2];
		
		for(int i=0;i<book.length;i++) {
			System.out.print("力格>>");
			String title = input.nextLine();
			System.out.print("历磊>>");
			String author = input.nextLine();
			book[i] = new Book(title, author);
		}
		
		for(int i=0;i<book.length;i++) {
			System.out.print("(" + book[i].title + ", " + book[i].author + ")");
		}
	}
}
*/

import java.util.Scanner;

public class BookArray{
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		Book book[] = new Book[2];

		for(int i=0;i<book.length;i++) {
			System.out.print("力格>>");
			String title = input.nextLine();
			System.out.print("历磊>>");
			String author = input.nextLine();
			book[i] = new Book(title, author);
		}
		
		for(int i=0;i<book.length;i++) {
			System.out.print("(" + book[i].title + ", " + book[i].author + ")");
		}
		
		input.close();
	}
}
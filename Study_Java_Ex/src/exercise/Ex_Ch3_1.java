package exercise;

public class Ex_Ch3_1 {
	public static void main(String[] args) {
		char c = 'A';
		
		for(int i=0;i<5;i++) {
			for(int j=i;j<5;j++) {
				System.out.print((char)(c+j));
			}
			System.out.println();
		}
		
	}
}

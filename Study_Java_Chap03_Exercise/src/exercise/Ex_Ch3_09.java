package exercise;

public class Ex_Ch3_09 {
	public static void main(String[] args) {
		int number[][] = new int [4][4];
		
		for(int i=0;i<4;i++) {
			for(int j=0; j<4;j++) {
				number[i][j] = (int)(Math.random()*10+1);
				System.out.print(number[i][j] + "\t");
			}
			System.out.println();
		}
	}
}

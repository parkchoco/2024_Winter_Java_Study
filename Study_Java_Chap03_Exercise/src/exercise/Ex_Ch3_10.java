package exercise;

public class Ex_Ch3_10 {
	public static void main(String[] args) {
		int number[][] = new int[4][4];
		int i, j;
		
		for(int x=0;x<10;x++) {
			i=(int)(Math.random()*4);
			j=(int)(Math.random()*4);
			if(number[i][j]==0) {
				number[i][j]=(int)(Math.random()*10+1);
			}
			else {
				x--;
				continue;
			}
		}
		
		for(int x=0;x<4;x++) {
			for(int y=0;y<4;y++) {
				System.out.print(number[x][y] + "\t");
			}
			System.out.println();
		}
	}
}

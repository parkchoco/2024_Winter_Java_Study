package chap03;

public class Project_08 {
	public static void main(String[] args) {
		double score[][] = {{3.3,3.4},
							{3.5,3.6},
							{3.7,4.0},
							{4.1,4.2},
							};
		double sum = 0;
		for(int i=0;i<score.length;i++) {
			for(int j=0;j<score[i].length;j++) {
				sum += score[i][j];
			}
		}
		int n=score.length;
		int m=score[0].length;
		System.out.println("4�� ��ü ���� ����� " + sum/(n*m));
		
	}
}
package leetcode;

import java.util.Scanner;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	    //your code here
	    Scanner in = new Scanner(System.in);

		int c = in.nextInt();
		for (int i = 0; i < c; i++){
			int n = in.nextInt();
			int m = in.nextInt();
			int[][] ar = new int[n][m];
			for (int j = 0; j < n; j++)
				for (int k = 0; k < m; k++)
				ar[j][k] = in.nextInt();
			doStuff(ar, n, m);
		}
	}
	
	static void doStuff(int[][] ar, int n, int m) {
		int[][] x = new int[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (i == 0 && j == 0)
					x[i][j] = ar[i][j];
				else if (i == 0)
					x[i][j] = x[i][j-1] + ar[i][j];
				else if (j == 0)
					x[i][j] = ar[i][j];
				else
					x[i][j] = Math.max(x[i][j-1] + ar[i][j], x[i-1][j-1] + ar[i][j]);
				if (x[i][j] <= 0 && j != 0)
					break;
			}
			if (x[i][m-1] > 0) {
				System.out.println("YES");
				return;
			}
		}
		System.out.println("NO");
	}

}

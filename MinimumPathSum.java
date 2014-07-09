package leetcode;

public class MinimumPathSum {
	
	public static void main(String[] args) {
		int[][] grid = {{1,2},{5,6},{1,1}};
		System.out.println(minPathSum(grid));
	}
	
	public static int minPathSum(int[][] grid) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if (grid == null || grid.length == 0 || grid[0].length == 0)
            return 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (i == 0 && j == 0) {
                } else if (i == 0 && j > 0)
                    grid[i][j] += grid[i][j-1];
                else if (j == 0 && i > 0)
                    grid[i][j] += grid[i-1][j];
                else 
                    grid[i][j] += Math.min(grid[i][j-1], grid[i-1][j]);
            }
        }
        return grid[grid.length-1][grid[0].length-1];
    }
}

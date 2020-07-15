import java.util.*;
import java.io.*;
class Grid {
	public static void main(String[] args) {
		int[][] grid = new int[][] {{1,0,0,0,1},{0,0,0,0,0},{0,0,1,0,0}};
		ArrayList<int[]> ones = new ArrayList<>();
		for(int i = 0; i < grid.length; i++) {
			for(int j = 0; j < grid[0].length; j++) {
				if(grid[i][j] == 1) {
					ones.add(new int[] {i,j});
				}
			}
		}
		int min = 1000;
		for(int k = 0; k < grid.length; k++) {
			for(int l = 0; l < grid[0].length; l++) {
				int[] gridindex = new int[] {k,l};
				int val = 0;
				for(int[] one : ones) {
					int[] res = new int[5];
					for(int m = 0; m < 2; m++) {
						res[m] = one[m] - gridindex[m];
					}
					for(int resval : res) {
						val = val + Math.abs(resval);
					}
				}
				if(val < min) {
					min = val;
				}
			}
		}
		System.out.println(min);
	}
}
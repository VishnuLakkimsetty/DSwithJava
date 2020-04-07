// https://www.geeksforgeeks.org/shortest-distance-two-cells-matrix-grid/

package main.java.Graphs;

import java.util.LinkedList;
import java.util.Queue;

public class ShortestDistanceInAMatrix {
	public static void main(String[] aths) {
		char[][] grid = new char[][] { { '0', '*', '0', 's' }, { '*', '0', '*', '*' }, { '0', '*', '*', '*' },
				{ 'd', '*', '*', '*' } };

		System.out.println(minDist(grid));
	}

	private static int minDist(char[][] grid) {
		int h = grid.length;
		int l = grid[0].length;
		boolean[][] visit = new boolean[h][l];
		Queue<String> q = new LinkedList<>();
		String source = "";

		for (int i = 0; i < h; i++) {
			for (int j = 0; j < l; j++) {
				if (grid[i][j] == '0') {
					visit[i][j] = true;
				}

				if (grid[i][j] == 's') {
					source = i + "," + j + ",0";
				}
			}
		}
		if(source == "") {
			return -1;
		}
		q.add(source);
		while(!q.isEmpty()) {
			String x = q.poll();
			int row = Integer.parseInt(x.split(",")[0]);
			int col = Integer.parseInt(x.split(",")[1]);
			int dist = Integer.parseInt(x.split(",")[2]);
			
			if (row < 0 || col < 0 || row >= h || col >= l || visit[row][col])
                continue;
			visit[row][col] = true;
			
			// If it is destination
			if(grid[row][col] == 'd') {
				return dist;
			}
			dist = dist+1;
			// moving up
			q.add((row-1)+","+col+","+dist);
			

			// moving down
			q.add((row+1)+","+col+","+dist);
			

			// moving left
			q.add(row+","+(col-1)+","+dist);
			

			// moving right
			q.add(row+","+(col+1)+","+dist);
			
		}
		

		return -1;
	}

}

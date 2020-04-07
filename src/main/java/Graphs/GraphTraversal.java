// https://www.sanfoundry.com/java-program-traverse-graph-using-bfs/
package main.java.Graphs;

import java.util.LinkedList;
import java.util.Queue;

public class GraphTraversal{
	private int vertices;
	private int[][] adjMat;
	private boolean[] visit;
	
	public GraphTraversal(int V) {
		vertices = V;
		adjMat = new int[V][V];
		visit = new boolean[V];
	}
	
	public static  void main(String[] arhs) {
		GraphTraversal g = new GraphTraversal(4);
		// Undirected graph
		g.addEdge(0, 1); 
        g.addEdge(0, 2); 
        g.addEdge(1, 2); 
        g.addEdge(2, 0); 
        g.addEdge(2, 3); 
        g.addEdge(3, 3); 
		System.out.println("BFS of graph is :: ");
        g.BFS(2);
        for(int i =0;i<g.vertices;i++) {
        	g.visit[i] = false;
        }
        System.out.println("DFS of graph is :: ");
        g.DFS(2);
	}

	private void addEdge(int i, int j) {
		adjMat[i][j] = 1;
		adjMat[j][i] = 1;
		
	}
	
	@SuppressWarnings("unused")
	private void removeEdge(int i, int j) {
		adjMat[i][j] = 0;
		adjMat[j][i] = 0;
		
	}
	
	private void BFS(int v) {		
		Queue<Integer> q = new LinkedList<>();
		q.add(v);
		visit[v] = true;
		while(!q.isEmpty()) {
			System.out.println(q.peek());
			int x = q.poll();
			for(int i =0;i<adjMat.length;i++) {
				if(adjMat[x][i] == 1 && visit[i]==false) {
					q.add(i);
					visit[i] = true;
				}
			}
		}	
	}
	
	private void DFS(int v) {
		visit[v] = true;
		System.out.println(v);
		for(int i =0; i<vertices;i++) {
			if(adjMat[v][i] == 1 && visit[i] == false) {
				DFS(i);
			}
		}
	}

}

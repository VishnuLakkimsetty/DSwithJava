// https://www.geeksforgeeks.org/all-topological-sorts-of-a-directed-acyclic-graph/

package main.java.Graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

import main.java.Graphs.TopologicalSorting.Graph;

public class AllTopologicalSort {

	public static void main(String args[]) {
		// Create a graph given in the above diagram
		Graph g = new Graph(6);
		g.addEdge(5, 2);
		g.addEdge(5, 0);
		g.addEdge(4, 0);
		g.addEdge(4, 1);
		g.addEdge(2, 3);
		g.addEdge(3, 1);

		System.out.println("Following is a Topological " + "sort of the given graph");
		g.allTopologicalSort();
	}

	static class Graph {
		private int vertices;
		private boolean[] visit;
		private LinkedList<Integer>[] adj;

		public Graph(int v) {
			vertices = v;
			visit = new boolean[v];
			adj = new LinkedList[v];
			for (int i = 0; i < v; i++) {
				adj[i] = new LinkedList<>();
			}
		}

		public void allTopologicalSortsUtil(int[] indegree, boolean[] visit2, ArrayList<Integer> s) {
			boolean flag = false;

			for (int i = 0; i < vertices; i++) {
				// If indegree is 0 and not yet visited then
				// only choose that vertex
				if (!visit[i] && indegree[i] == 0) {

					// including in result
					visit[i] = true;
					s.add(i);
					for (int adjacent : this.adj[i]) {
						indegree[adjacent]--;
					}
					allTopologicalSortsUtil(indegree, visit, s);

					// resetting visited, res and indegree for
					// backtracking
					visit[i] = false;
					s.remove(s.size() - 1);
					for (int adjacent : this.adj[i]) {
						indegree[adjacent]++;
					}

					flag = true;
				}
			}
			// We reach here if all vertices are visited.
			// So we print the solution here
			if (!flag) {
				s.forEach(i -> System.out.print(i + " "));
				System.out.println();
			}
		}

		public void allTopologicalSort() {
			int[] indegree = new int[vertices];
			ArrayList<Integer> s = new ArrayList<>();

			for (int i = 0; i < vertices; i++) {

				for (int var : this.adj[i]) {
					indegree[var]++;
				}
			}

			allTopologicalSortsUtil(indegree, visit, s);

		}

		public void addEdge(int i, int j) {
			adj[i].add(j);

		}

	}

}

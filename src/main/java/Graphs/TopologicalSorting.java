// https://www.geeksforgeeks.org/topological-sorting/
package main.java.Graphs;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

public class TopologicalSorting {
	
	static class Graph{
		private int vertices;
		private boolean[] visit;
		private LinkedList<Integer>[] adj;
		
		public Graph(int v){
			vertices = v;
			visit = new boolean[v];
			adj = new LinkedList[v];
			for(int i =0;i<v;i++) {
				adj[i] = new LinkedList<>();
			}
		}

		public void addEdge(int i, int j) {
			adj[i].add(j);
			
		}

		public void topologicalSort() {
			Stack<Integer> s = new Stack<>();
			
			for(int i =0;i<vertices;i++) {
				if(visit[i]==false) {
					topologyUtil(i,visit,s);
				}
			}
			
			while(!s.isEmpty()) {
				System.out.println(s.pop());
			}
			
		}

		private void topologyUtil(int i, boolean[] visit, Stack<Integer> s) {
			visit[i] = true;
			Iterator<Integer> itr = adj[i].iterator();
			int j;
			while(itr.hasNext()) {
				j = itr.next();
				if(visit[j]== false) {
					topologyUtil(j, visit, s);
				}
			}
			
			s.push(i);
			
		}
		
	}
	
	public static void main(String args[]) 
    { 
        // Create a graph given in the above diagram 
        Graph g = new Graph(6); 
        g.addEdge(5, 2); 
        g.addEdge(5, 0); 
        g.addEdge(4, 0); 
        g.addEdge(4, 1); 
        g.addEdge(2, 3); 
        g.addEdge(3, 1);
  
        System.out.println("Following is a Topological " + 
                           "sort of the given graph"); 
        g.topologicalSort(); 
    } 

}

package Graphs;

public class Adjacency_Matrix_Representation {
	private int V; // number of vertices in graph
	private int E; // number of edges in graph
	private int[][] adjMatrix;
	
	public Adjacency_Matrix_Representation(int nodes) {
		this.V = nodes;
		this.E = 0;
		this.adjMatrix = new int[nodes][nodes];
	}
	
	public void addEdge(int u, int v) {
		this.adjMatrix[u][v] = 1;
		this.adjMatrix[v][u] = 1; // because it is an undirected graph
		E++;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(V + " Vertices, " + E + " Edges" + "\n");
		for(int v = 0; v < V; v++) {
			sb.append(v + ": ");
			for(int w : adjMatrix[v]) {
				sb.append(w + " ");
			}
			sb.append("\n");
		}
		return sb.toString();
	}
	
	
	public static void main(String[] args) {
		Adjacency_Matrix_Representation g = new Adjacency_Matrix_Representation(4);
		g.addEdge(0, 1);
		g.addEdge(1, 2);
		g.addEdge(2, 3);
		g.addEdge(3, 0);
		System.out.println(g);
		
	}

}

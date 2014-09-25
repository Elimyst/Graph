import java.util.List;
import java.util.ArrayList;



public class Graph {
	private List<Vertex> vertexs = new ArrayList<>();		//holds all vertexes 
	private List<Edge> edges = new ArrayList<>();			//holds the edges

	public void insertVertex(Vertex in_Vertex){
		vertexs.add(in_Vertex);
	}
	
	public void insertEdge(Edge in_Edge){
		edges.add(in_Edge);
	}

	public List<Vertex> getVertexs() {
		return vertexs;
	}

	public List<Edge> getEdges() {
		return edges;
	}

	
	
}

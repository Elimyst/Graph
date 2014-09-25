public class Driver {
	private Vertex One;
	private Vertex Two;
	private Vertex Three;
	private Vertex Four;
	private Vertex Five;
	private Vertex Six;

	private Edge E1;
	private Edge E2;
	private Edge E3;
	private Edge E4;
	private Edge E5;
	private Edge E6;
	private Edge E7;

	private Graph drawThis;

	public Driver() {
		
		//Sets up the vertexes
		One = new Vertex(1);
		Two = new Vertex(2);
		Three = new Vertex(3);
		Four = new Vertex(4);
		Five = new Vertex(5);
		Six = new Vertex(6);
		
		//Sets up the edges
		E1 = new Edge(One, Two);
		E2 = new Edge(Two, Three);
		E3 = new Edge(One, Three);
		E4 = new Edge(Six, One);
		E5 = new Edge(Two, Five);
		E6 = new Edge(Five, Four);
		E7 = new Edge(Four, Six);
		
		drawThis = new Graph();		//creates a new graph

		//adds vertexes to drawThis(Graph)
		drawThis.insertVertex(One);
		drawThis.insertVertex(Two);
		drawThis.insertVertex(Three);
		drawThis.insertVertex(Four);
		drawThis.insertVertex(Five);
		drawThis.insertVertex(Six);

		//adds edges to 
		drawThis.insertEdge(E1);
		drawThis.insertEdge(E2);
		drawThis.insertEdge(E3);
		drawThis.insertEdge(E4);
		drawThis.insertEdge(E5);
		drawThis.insertEdge(E6);
		drawThis.insertEdge(E7);

		new Visualizer(drawThis);		//Draws the graph
	}

	public static void main(String[] args) {
		new Driver();		//Starts the madness
	}
}

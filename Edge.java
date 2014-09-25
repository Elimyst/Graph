
public class Edge {
	private int value;
	private Vertex pointOne;		//where the edge starts  (no arrow)
	private Vertex pointTwo;		//Where the edge ends	(Small little arrow)
	
	public Edge(Vertex in_pointOne, Vertex in_pointTwo){
		this.pointOne = in_pointOne;
		this.pointTwo = in_pointTwo;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public Vertex getPointOne() {
		return pointOne;
	}

	public Vertex getPointTwo() {
		return pointTwo;
	}
	
	
}

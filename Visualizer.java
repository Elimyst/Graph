import java.util.ListIterator;

import javax.swing.JFrame;

import org.apache.commons.collections15.Transformer;

import edu.uci.ics.jung.algorithms.layout.CircleLayout;
import edu.uci.ics.jung.algorithms.layout.TreeLayout;
import edu.uci.ics.jung.graph.*;
import edu.uci.ics.jung.visualization.*;

public class Visualizer {

	private Graph visualizeMe;
	private CircleLayout<Vertex, Edge> forestContainer;
	private DelegateForest<Vertex, Edge> convertedGraph = new DelegateForest<>();
	private BasicVisualizationServer<Vertex, Edge> frameImage;

	public Visualizer(Graph in_visualizeMe) {
		this.visualizeMe = in_visualizeMe;			//visualize me now points to the inputed graph
		convertToForest();
		
		//I kept this CicleLayout because I felt it was more useful for drawing graphs with more than three edges to a vertex
		//I can change this to TreeLayout when I am trying to visualize my trees from the next few labs
		forestContainer = new CircleLayout<>(convertedGraph);			
		frameImage = new BasicVisualizationServer<>(forestContainer);
		drawGraph();
	}

	public void convertToForest() {
		ListIterator<Vertex> runThroughVertex = visualizeMe.getVertexs()
				.listIterator();											//creates a iterator that runs through the vertex ArrayList
		ListIterator<Edge> runThroughEdges = visualizeMe.getEdges()
				.listIterator();											//creates a iterator that runs through the edges ArrayList

		while (runThroughVertex.hasNext()) {
			convertedGraph.addVertex(runThroughVertex.next());				//Adds each vertex to the Delegate Forest
		}

		while (runThroughEdges.hasNext()) {
			Edge tempEdgeHolder = runThroughEdges.next();					//Holds an edge so we can access its vertexes in the next line
			convertedGraph.addEdge(tempEdgeHolder,
					tempEdgeHolder.getPointOne(), tempEdgeHolder.getPointTwo());	//adds the edge held by tempEdgeHolder as well as its two vertexes
		}
	}

	public void drawGraph() {
		GraphWindow window = new GraphWindow();			//creates a JFrame object
		window.add(frameImage);
		drawVertexNames();
	}

	public void drawVertexNames() {
		Transformer<Vertex, String> transformer = new Transformer<Vertex, String>() {

			@Override
			public String transform(Vertex in_vertex) {
				return in_vertex.getValue() + "";			//converts vertex values from frameImage to strings
			}

		};

		frameImage.getRenderContext().setVertexLabelTransformer(transformer);		//sends vertexes from our BasicVisualizationServer to transformer
		;
	}
}

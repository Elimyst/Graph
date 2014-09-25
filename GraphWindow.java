import java.awt.Dimension;

import javax.swing.JFrame;


public class GraphWindow extends JFrame{
	
	public GraphWindow(){
		super("Waylon Roberts - Graph Visualizer");
		setPreferredSize(new Dimension(620,620));			//Window is 620x620px
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		//Hitting the X-button works! Wow, thats neat.
        pack();
        setLocationRelativeTo(null);						//draws the JFrame in the center of the screen
        setVisible(true);									//makes it so that our JFrame is not invisible. 
	}
}

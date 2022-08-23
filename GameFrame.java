package snake;

import javax.swing.JFrame;
public class GameFrame extends JFrame{

GameFrame()

{
	//System.out.println("hi");
	this.add(new GamePanel());
	this.setVisible(true);
	this.setTitle("Snake");
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setResizable(false);
	//this.setSize(400,400);
	this.pack(); // This make sure all the GUI components are in the gameframe surroundings only
	this.setLocationRelativeTo(null);// this makes our window to apear in the middle of the screen
}

	
	
	
	
	
	
	
	

}

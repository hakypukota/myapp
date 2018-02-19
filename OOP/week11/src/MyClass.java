import java.awt.*;
import java.awt.event.KeyEvent;

import com.golden.gamedev.*;
public class MyClass extends Game{
	private static final String String = null;
	private int x;
	private int y;
	private int x2;
	private int y2;
	private int xx;
	private int yy;
	
	public void initResources() {
		x=320;
		y=240;
		x2=320;
		y2=240;
		
		
	}

	public void render(Graphics2D g) {
		g.setColor(Color.BLACK); // Sets the colour of the next shape
		g.fillRect(0,0,getWidth(),getHeight()); // Draw the background (a rectangle)
	        
	        
		g.setColor(Color.WHITE);
		g.fillOval(x, y ,20,20); // Drawing the circle
		
		g.setColor(Color.RED);
		g.fillOval(x2, y2, 20, 20);
		
	}

	public void update(long arg0) {
		if(keyDown(KeyEvent.VK_LEFT))
		{
			x--;
		}
		if(keyDown(KeyEvent.VK_RIGHT)){
			x++;
		}
		if(keyDown(KeyEvent.VK_UP)){
			y--;
		}
		if(keyDown(KeyEvent.VK_DOWN)){
			y++;
		}
		
		
		
		
	}
	public static void main (String args[])
	{
		GameLoader gameLoader = new GameLoader();
		MyClass g = new MyClass(); // Instance of the class we just created
		gameLoader.setup(g,new Dimension(640,480),false); // window size, false = not full screen
		gameLoader.start(); // starts the game
	}

}

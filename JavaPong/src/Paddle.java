import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class Paddle extends Rectangle
{
	int id;
	int yVel;
	
	Paddle(int xPos, int yPos, int PADDLE_WIDTH, int PADDLE_HEIGHT, int id)
	{
		super(xPos, yPos, PADDLE_WIDTH, PADDLE_HEIGHT);
		this.id = id;
	}
	
	public void keyPressed(KeyEvent e)
	{
		
	}
	
	public void keyReleased(KeyEvent e)
	{
		
	}
	
	public void setYDir(int yDir)
	{
		
	}
	
	public void move()
	{
		
	}
	
	public void draw(Graphics g)
	{
		// player 1
		if(id == 1)
		{
			g.setColor(Color.BLUE);
		}
		// player 2
		else
		{
			g.setColor(Color.RED);
		}
		
		g.fillRect(x, y, width, height);
	}
}
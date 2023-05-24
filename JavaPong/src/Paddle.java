import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class Paddle extends Rectangle
{
	int id;
	int yVel;
	int speed = 10;
	
	Paddle(int xPos, int yPos, int PADDLE_WIDTH, int PADDLE_HEIGHT, int id)
	{
		super(xPos, yPos, PADDLE_WIDTH, PADDLE_HEIGHT);
		this.id = id;
	}
	
	public void keyPressed(KeyEvent e)
	{
		switch(id)
		{
		case 1:
			if(e.getKeyCode() == KeyEvent.VK_W)
			{
				setYDir(-speed);
				move();
			}
			if(e.getKeyCode() == KeyEvent.VK_S)
			{
				setYDir(speed);
				move();
			}
			break;
		case 2:
			if(e.getKeyCode() == KeyEvent.VK_UP)
			{
				setYDir(-speed);
				move();
			}
			if(e.getKeyCode() == KeyEvent.VK_DOWN)
			{
				setYDir(speed);
				move();
			}
			break;
		}
	}
	
	public void keyReleased(KeyEvent e)
	{
		switch(id)
		{
		case 1:
			if(e.getKeyCode() == KeyEvent.VK_W)
			{
				setYDir(0);
				move();
			}
			if(e.getKeyCode() == KeyEvent.VK_S)
			{
				setYDir(0);
				move();
			}
			break;
		case 2:
			if(e.getKeyCode() == KeyEvent.VK_UP)
			{
				setYDir(0);
				move();
			}
			if(e.getKeyCode() == KeyEvent.VK_DOWN)
			{
				setYDir(0);
				move();
			}
			break;
		}
	}
	
	public void setYDir(int yDir)
	{
		yVel = yDir;
	}
	
	public void move()
	{
		y = y + yVel;
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
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class Ball extends Rectangle
{
	Random random;
	int xVel;
	int yVel;
	int initialSpeed = 3;
	
	Ball(int xPos, int yPos, int width, int height)
	{
		super(xPos, yPos, width, height);
		random = new Random();
		
		int randXDir = random.nextInt(2);
		if(randXDir == 0)
		{
			randXDir--;
			
		}
		setXDir(randXDir * initialSpeed);
		int randYDir = random.nextInt(2);
		if(randYDir == 0)
		{
			randYDir--;
			
		}
		setYDir(randYDir * initialSpeed);
	}
	
	public void setXDir(int xDir)
	{
		xVel = xDir;
	}
	
	public void setYDir(int yDir)
	{
		yVel = yDir;
	}
	
	public void move()
	{
		x += xVel;
		y += yVel;
	}
	
	public void draw(Graphics g)
	{
		g.setColor(Color.WHITE);
		g.fillOval(x, y, height, width);
	}
}

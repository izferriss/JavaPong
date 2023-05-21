import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class Panel extends JPanel implements Runnable
{
	static final int GAME_WIDTH = 800;
	static final int GAME_HEIGHT = 600;
	static final Dimension SCREEN_SIZE = new Dimension(GAME_WIDTH, GAME_HEIGHT);
	static final int BALL_DIAMETER = 20;
	static final int PADDLE_WIDTH = 25;
	static final int PADDLE_HEIGHT = 100;
	
	Thread thread;
	Image image;
	Graphics graphics;
	Random random;
	Paddle paddle1;
	Paddle paddle2;
	Ball ball;
	Score score;
	
	Panel()
	{
		newPaddles();
		newBall();
		score = new Score(GAME_WIDTH, GAME_HEIGHT);
		this.setFocusable(true);
		this.addKeyListener(new ActionListener());
		this.setPreferredSize(SCREEN_SIZE);
		
		thread = new Thread(this);
		thread.start();
	}
	
	public void newBall()
	{
		
	}
	
	public void newPaddles()
	{
		paddle1 = new Paddle(0, (GAME_HEIGHT / 2) - (PADDLE_HEIGHT / 2), PADDLE_WIDTH, PADDLE_HEIGHT, 1);
		paddle2 = new Paddle(GAME_WIDTH - PADDLE_WIDTH, (GAME_HEIGHT / 2) - (PADDLE_HEIGHT / 2), PADDLE_WIDTH, PADDLE_HEIGHT, 2);
	}
	
	public void paint(Graphics g)
	{
		image = createImage(getWidth(), getHeight());
		graphics = image.getGraphics();
		draw(graphics);
		g.drawImage(image, 0, 0, this);
	}
	
	public void draw(Graphics g)
	{
		paddle1.draw(g);
		paddle2.draw(g);
	}
	
	public void move()
	{
		
	}
	
	public void checkCollision()
	{
		
	}
	
	public void run()
	{
		// game loop
		long lastTime = System.nanoTime();
		double amountOfTicks = 60.f;
		double ns = 1000000000 / amountOfTicks;
		double delta = 0;
		
		while(true)
		{
			long now = System.nanoTime();
			delta += (now - lastTime) / ns;
			lastTime = now;
			if(delta >= 1)
			{
				move();
				checkCollision();
				repaint();
				delta--;
			}
		}
	}
	
	public class ActionListener extends KeyAdapter
	{
		public void keyPressed(KeyEvent e)
		{
			
		}
		
		public void keyReleased(KeyEvent e)
		{
			
		}
	}
}

package snakeTutorial;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.Timer;

import javax.swing.ImageIcon;
import javax.swing.JPanel;


public class GamePlay extends JPanel implements KeyListener, ActionListener
{
	private int[] snakeXLength = new int[750];
	private int[] snakeYLength = new int[750];
	
	private boolean left = false;
	private boolean right = false;
	private boolean up = false;
	private boolean down = false;
	
	private int lengthOfSnake = 3;
	private int moves = 0;
	
	private ImageIcon titleImage;
	private ImageIcon rightMouth;
	private ImageIcon leftMouth;
	private ImageIcon upMouth;
	private ImageIcon downMouth;
	private ImageIcon snakeImage;
	
	private Timer timer;
	private int delay = 100;
	
	
	
	
	public GamePlay()
	{
		addKeyListener(this);
		setFocusable(true);
		setFocusTraversalKeysEnabled(false);
		timer = new Timer(delay, this);	
		timer.start();					
	}
	
	public void paint(Graphics g)
	{
		if(moves == 0)
		{
			snakeXLength[2] = 50;
			snakeXLength[1] = 75;
			snakeXLength[0] = 100;
			
			snakeYLength[2] = 100;
			snakeYLength[1] = 7100;
			snakeYLength[0] = 100;
		}
		
		//draw title image border
		g.setColor(Color.WHITE);
		g.drawRect(24, 10, 851, 55);
		
		//draw title image
		titleImage = new ImageIcon(getClass().getResource("/img/snaketitle.jpg"));
		titleImage.paintIcon(this, g, 25, 11); //doesn't work
		
		//draw border for gameplay
		g.setColor(Color.WHITE);
		g.drawRect(24, 74, 851, 557);
		
		//draw background for gameplay
		g.setColor(Color.BLACK);
		g.fillRect(25,  75,  850,  575);
		
		//draw snake
		rightMouth = new ImageIcon(getClass().getResource("/img/rightmouth.png"));
		rightMouth.paintIcon(this, g, snakeXLength[0], snakeYLength[0]);
		
		for(int a = 0; a < lengthOfSnake; a++)
		{
			if(a == 0 && right)
			{
				rightMouth = new ImageIcon(getClass().getResource("/img/rightmouth.png"));
				rightMouth.paintIcon(this, g, snakeXLength[0], snakeYLength[0]);		
			}
			if(a == 0 && left)
			{
				leftMouth = new ImageIcon(getClass().getResource("/img/leftmouth.png"));
				leftMouth.paintIcon(this, g, snakeXLength[0], snakeYLength[0]);		
			}
			if(a == 0 && up)
			{
				upMouth = new ImageIcon(getClass().getResource("/img/upmouth.png"));
				upMouth.paintIcon(this, g, snakeXLength[0], snakeYLength[0]);		
			}
			if(a == 0 && down)
			{
				downMouth = new ImageIcon(getClass().getResource("/img/downmouth.png"));
				downMouth.paintIcon(this, g, snakeXLength[0], snakeYLength[0]);		
			}
			if(a != 0)
			{
				snakeImage = new ImageIcon(getClass().getResource("/img/snakeimage.png"));
				snakeImage.paintIcon(this, g, snakeXLength[0], snakeYLength[0]);	
			}
		}
		
		g.dispose();
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) 
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent arg0) 
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent arg0) 
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) 
	{
		// TODO Auto-generated method stub
		
	}

}

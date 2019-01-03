package snakeTutorial;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Timer;

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
		//timer = new Timer(delay, this);
		//timer.start();
	}
	
	public void paint(Graphics g)
	{
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

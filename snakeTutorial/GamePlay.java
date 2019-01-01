package snakeTutorial;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JPanel;


public class GamePlay extends JPanel
{
	ImageIcon titleImage;
	
	public GamePlay()
	{
		
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

}

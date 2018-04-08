import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class Shop  extends JApplet //implements MouseListener
{
	public static boolean tophat = false;
	public static boolean mustache = false;
	public static boolean sunglasses = false;
	public static boolean blue = false;
	public static boolean red = false;
	public static boolean green = false;
	public static boolean yellow = false;
	public static boolean purple = false;
	public static boolean sneakers = false;

	public static boolean quit = false;

	private ImageIcon shopImage;//image

	//Image button
	public JButton shopButton;

	//Main Buttons
	private JFrame tophatClick;
	private JFrame mustacheClick;
	private JFrame sunglassesClick;
	private JFrame blueClick;
	private JFrame redClick;
	private JFrame greenClick;
	private JFrame purpleClick;
	private JFrame yellowClick;
	private JFrame sneakersClick;

	private JFrame quitClick;


	public void init () 
	{		


		try
		{
			playMusicMain();
		}
		catch(Exception err)
		{
			//System.out.println("2. " + err);
		}


		//Adds the image and creates a button out of it
		//TODO 	shopImage = new ImageIcon(this.getClass().getResource("Pictures/EasyMediumHard.jpg"));//image		
		shopButton = new JButton (shopImage);//image button


		getContentPane().add(shopButton);
		setSize(833,777); // TODO

		centerWindow();//centers the window

		shopButton.addMouseListener(new MouseAdapter()
		{
			public void mouseClicked(MouseEvent e)
			{

				//TOPHAT
				if (e.getX() > 41 && e.getX() < 266 && e.getY() > 253 && e.getY() < 353)
				{
					//System.out.println("tophat");

					tophat = true;


				}
				//TOPHAT
				if (e.getX() > 41 && e.getX() < 266 && e.getY() > 253 && e.getY() < 353)
				{
					//System.out.println("tophat");

					tophat = true;


				}
				//TOPHAT
				if (e.getX() > 41 && e.getX() < 266 && e.getY() > 253 && e.getY() < 353)
				{
					//System.out.println("tophat");

					tophat = true;


				}
				//TOPHAT
				if (e.getX() > 41 && e.getX() < 266 && e.getY() > 253 && e.getY() < 353)
				{
					//System.out.println("tophat");

					tophat = true;


				}
				//TOPHAT
				if (e.getX() > 41 && e.getX() < 266 && e.getY() > 253 && e.getY() < 353)
				{
					//System.out.println("tophat");

					tophat = true;


				}
				//TOPHAT
				if (e.getX() > 41 && e.getX() < 266 && e.getY() > 253 && e.getY() < 353)
				{
					//System.out.println("tophat");

					tophat = true;


				}
				//TOPHAT
				if (e.getX() > 41 && e.getX() < 266 && e.getY() > 253 && e.getY() < 353)
				{
					//System.out.println("tophat");

					tophat = true;


				}
				//TOPHAT
				if (e.getX() > 41 && e.getX() < 266 && e.getY() > 253 && e.getY() < 353)
				{
					//System.out.println("tophat");

					tophat = true;


				}
				//TOPHAT
				if (e.getX() > 41 && e.getX() < 266 && e.getY() > 253 && e.getY() < 353)
				{
					//System.out.println("tophat");

					tophat = true;


				}
				//TOPHAT
				if (e.getX() > 41 && e.getX() < 266 && e.getY() > 253 && e.getY() < 353)
				{
					//System.out.println("tophat");

					tophat = true;


				}



			}

			public void mouseEntered(MouseEvent arg0) {

			}

			public void mouseExited(MouseEvent arg0) {

			}

			public void mousePressed(MouseEvent arg0) {

			}

			public void mouseReleased(MouseEvent arg0) {

			}
		});
	}




	public class CloseListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			System.exit(0);
		}
	}

	public void playMusic() throws InterruptedException
	{
		Sound.play("TitleScreenMusic.wav");
	}
	public void playMusicMain() throws InterruptedException
	{
		playMusic();

	}

	//Centers the window
	public void centerWindow()
	{
		//gets top level window
		Window window;
		Container c = getParent();
		while (c.getParent()!=null) 
			c = c.getParent();

		// center window
		if (c instanceof Window)//if it is the top window...
		{
			//centers it
			window = (Window)c;
			window.pack();
			window.setLocationRelativeTo(null);					
		}
	}
}

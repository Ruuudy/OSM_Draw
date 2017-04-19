
import java.awt.*;
import javax.swing.*;

public class Draw
{
	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				JFrame frame = new DrawFrame();
				frame.setTitle("Sieæ dróg Kraków");
				frame.pack();
				frame.setLocationRelativeTo(null);
//				frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setVisible(true);
			}
		});
	}
}
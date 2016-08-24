import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class CorrectFrame extends JFrame
{
	public CorrectFrame()
	{
		initComponenets();
	}
		private void initComponenets()
		{
			setTitle( "DemoForm" );
			setSize( 400, 500 );
			setLayout( new FlowLayout());
		}

		public static void main( String[] args ) 
		{ 
			// Now:!!
			SwingUtilities.invokeLater( () -> new CorrectFrame().setVisible( true ) );

			//Before:!!
			/*SwingUtilities.invokeLater( new Runnable()
				{
					@Override
					public void run()
					{
						new CorrectFrame().setVisible( true );
					}
				});*/
		}
}
		
import javax.swing.*;
import java.awt.*;
class app extends JFrame
{
	JTextField t;
	JButton b;
	
	app()
	{
		setSize(400,400);
		setTitle("JFrames");
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);setLayout(new FlowLayout());
		t=new JTextField(10);
		b=new JButton("check");
		add(t);
		add(b);
		pack();
		
		
		
		
	}
	public static void main(String args[])
	{
		new app();
	}
}

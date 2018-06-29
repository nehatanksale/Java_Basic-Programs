import java.awt.Button;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.applet.*;

public class app extends Applet implements ActionListener {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Label l1;
    Button b1;
    TextField t1;

    public void init()
    {
        l1=new Label("Press Button");
    b1=new Button("Button");
    add(t1);
    add(l1);
    add(b1);
    b1.addActionListener(this);

    

    }

	@Override
	public void actionPerformed(ActionEvent ae) {
		// TODO Auto-generated method stub
		String s1="abcd";
		if(ae.getSource()==b1)
		{
			String s=t1.getText();
			
			if(s.equals(s1))
			{
			
			l1.setText("Successful");
			}
		}
		
	}
}

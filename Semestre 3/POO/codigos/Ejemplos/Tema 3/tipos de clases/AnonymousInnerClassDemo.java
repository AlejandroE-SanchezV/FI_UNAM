import java.applet.*; 
import javax.swing.JApplet;
import java.awt.event.*; 
/* <applet code="AnonymousInnerClassDemo" 
width=200 height=100> </applet> */
public class AnonymousInnerClassDemo extends JApplet { 
	public void init() { 
		addMouseListener(new MouseAdapter() { 
			public void mousePressed(MouseEvent me) { 
				showStatus("Mouse Pressed"); 
			} 
		}); 
	} 
}
import java.awt.Toolkit;

import javax.swing.JFrame;

public class Start extends JFrame{
	
	public Start(){
		this.add(new MainClass());
		this.setSize(Toolkit.getDefaultToolkit().getScreenSize());
		this.setUndecorated(true);
		this.setVisible(true);
	}
	
	public static void main(String[] args){
		new Start();		
	}
}
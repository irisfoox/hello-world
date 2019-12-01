package hello;

import javax.swing.JOptionPane;

public class hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            // the simplest java there is:
	    System.out.println("hello world");
	    //and if we want to step it up a bit:
	    String name=JOptionPane.showInputDialog("enter your name");
	    JOptionPane.showMessageDialog(null, "hello world\nand hello "+name+"\nhow are you today?");;  
	}
}

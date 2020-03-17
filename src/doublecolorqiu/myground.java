package doublecolorqiu;

import javax.swing.JFrame;


public class myground {
  
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			jframe(i);
		}
	}
	
	public static void jframe(int i) {
		JFrame jFrame = new JFrame("双色球");
		jFrame.setBounds(0, 0, 800, 600);
		jFrame.setVisible(true);
		myback myback = new myback();
		jFrame.setDefaultCloseOperation(3);
		jFrame.add(myback);
	}
}
